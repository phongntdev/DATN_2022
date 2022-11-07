package com.example.huhacha.service;

import com.example.huhacha.DTO.ContactDto;
import com.example.huhacha.entitis.Contact;
import com.example.huhacha.mapper.ContactMapper;
import com.example.huhacha.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class ContactService {
    private final ContactRepository repository;
    private final ContactMapper contactMapper;

    public ContactService(ContactRepository repository, ContactMapper contactMapper) {
        this.repository = repository;
        this.contactMapper = contactMapper;
    }

    public ContactDto save(ContactDto contactDto) {
        Contact entity = contactMapper.toEntity(contactDto);
        return contactMapper.toDto(repository.save(entity));
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public ContactDto findById(long id) {
        return contactMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<ContactDto> findByCondition(ContactDto contactDto, Pageable pageable) {
        Page<Contact> entityPage = repository.findAll(pageable);
        List<Contact> entities = entityPage.getContent();
        return new PageImpl<>(contactMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ContactDto update(ContactDto contactDto, short id) {
        ContactDto data = findById(id);
        Contact entity = contactMapper.toEntity(contactDto);
        BeanUtil.copyProperties(data, entity);
        return save(contactMapper.toDto(entity));
    }
}