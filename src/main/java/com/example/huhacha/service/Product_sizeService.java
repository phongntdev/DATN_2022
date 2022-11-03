package com.example.huhacha.service;

import com.example.huhacha.DTO.Product_sizeDto;
import com.example.huhacha.entitis.Product_size;
import com.example.huhacha.mapper.Product_sizeMapper;
import com.example.huhacha.repository.Product_sizeRepository;
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
public class Product_sizeService {
    private final Product_sizeRepository repository;
    private final Product_sizeMapper product_sizeMapper;

    public Product_sizeService(Product_sizeRepository repository, Product_sizeMapper product_sizeMapper) {
        this.repository = repository;
        this.product_sizeMapper = product_sizeMapper;
    }

    public Product_sizeDto save(Product_sizeDto product_sizeDto) {
        Product_size entity = product_sizeMapper.toEntity(product_sizeDto);
        return product_sizeMapper.toDto(repository.save(entity));
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public Product_sizeDto findById(long id) {
        return product_sizeMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<Product_sizeDto> findByCondition(Product_sizeDto product_sizeDto, Pageable pageable) {
        Page<Product_size> entityPage = repository.findAll(pageable);
        List<Product_size> entities = entityPage.getContent();
        return new PageImpl<>(product_sizeMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public Product_sizeDto update(Product_sizeDto product_sizeDto, short id) {
        Product_sizeDto data = findById(id);
        Product_size entity = product_sizeMapper.toEntity(product_sizeDto);
        BeanUtil.copyProperties(data, entity);
        return save(product_sizeMapper.toDto(entity));
    }
}