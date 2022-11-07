package com.example.huhacha.service;

import com.example.huhacha.DTO.ProductDto;
import com.example.huhacha.entitis.Product;

import com.example.huhacha.mapper.ProductMapper;
import com.example.huhacha.repository.ProductRepository;
import com.example.huhacha.service.Iservice.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class ProductService implements IProductService {
    ProductRepository repository;
    ProductMapper productMapper;

    public ProductDto save(ProductDto productDto) {
        Product entity = productMapper.toEntity(productDto);
        return productMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public ProductDto findById(Long id) {
        return productMapper.toDto(repository.findById(id).get());
    }

    public Page<ProductDto> findByCondition(ProductDto productDto, Pageable pageable) {
        Page<Product> entityPage = repository.findAll(pageable);
        List<Product> entities = entityPage.getContent();
        return new PageImpl<>(productMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ProductDto update(ProductDto productDto, Long id) {
        ProductDto data = findById(id);
        Product entity = productMapper.toEntity(productDto);
//        BeanUtil.copyProperties(data, entity);
        return save(productMapper.toDto(entity));
    }
    @Override
    public List<Product> findByNameLike(String name) {
        return repository.findByNameLike(name);
    }
}