package com.example.huhacha.controller;

import com.example.huhacha.DTO.Product_sizeDto;
import com.example.huhacha.entitis.Product_size;
import com.example.huhacha.mapper.Product_sizeMapper;
import com.example.huhacha.service.Product_sizeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/product-_-size")
@RestController
@Slf4j
@Api("product-_-size")
public class Product_sizeController {
    private final Product_sizeService product_sizeService;

    public Product_sizeController(Product_sizeService product_sizeService) {
        this.product_sizeService = product_sizeService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated Product_sizeDto product_sizeDto) {
        product_sizeService.save(product_sizeDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product_sizeDto> findById(@PathVariable("id") short id) {
        Product_sizeDto product_size = product_sizeService.findById(id);
        return ResponseEntity.ok(product_size);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") short id) {
        Optional.ofNullable(product_sizeService.findById(id)).orElseThrow(() -> {
            log.error("Unable to delete non-existent data！");
            return new ResourceNotFoundException("cai gi do");
        });
        product_sizeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<Product_sizeDto>> pageQuery(Product_sizeDto product_sizeDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Product_sizeDto> product_sizePage = product_sizeService.findByCondition(product_sizeDto, pageable);
        return ResponseEntity.ok(product_sizePage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated Product_sizeDto product_sizeDto, @PathVariable("id") short id) {
        product_sizeService.update(product_sizeDto, id);
        return ResponseEntity.ok().build();
    }
}