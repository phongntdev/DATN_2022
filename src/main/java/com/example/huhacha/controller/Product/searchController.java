package com.example.huhacha.controller.Product;

import com.example.huhacha.entitis.Product;
import com.example.huhacha.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class searchController {
    @Autowired
    private ProductService service;

        @GetMapping()
        public ResponseEntity<?> getAllDepartmentsBySearch() {
            List<Product> entities = service.findByNameLike("%name%");
            return new ResponseEntity<List<Product>>(entities, HttpStatus.OK);
        }
}