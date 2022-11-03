package com.example.huhacha.service;

import com.example.huhacha.DTO.Oder_detailDto;
import com.example.huhacha.entitis.Oder_detail;
import com.example.huhacha.mapper.Oder_detailMapper;
import com.example.huhacha.repository.Oder_detailRepository;
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
public class Oder_detailService {
    private final Oder_detailRepository repository;
    private final Oder_detailMapper oder_detailMapper;

    public Oder_detailService(Oder_detailRepository repository, Oder_detailMapper oder_detailMapper) {
        this.repository = repository;
        this.oder_detailMapper = oder_detailMapper;
    }

    public Oder_detailDto save(Oder_detailDto oder_detailDto) {
        Oder_detail entity = oder_detailMapper.toEntity(oder_detailDto);
        return oder_detailMapper.toDto(repository.save(entity));
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public Oder_detailDto findById(long id) {
        return oder_detailMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<Oder_detailDto> findByCondition(Oder_detailDto oder_detailDto, Pageable pageable) {
        Page<Oder_detail> entityPage = repository.findAll(pageable);
        List<Oder_detail> entities = entityPage.getContent();
        return new PageImpl<>(oder_detailMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public Oder_detailDto update(Oder_detailDto oder_detailDto, short id) {
        Oder_detailDto data = findById(id);
        Oder_detail entity = oder_detailMapper.toEntity(oder_detailDto);
        BeanUtil.copyProperties(data, entity);
        return save(oder_detailMapper.toDto(entity));
    }
}