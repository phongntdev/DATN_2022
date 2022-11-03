package com.example.huhacha.repository;

import com.example.huhacha.entitis.Product_size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_sizeRepository extends JpaRepository<Product_size, Long>, JpaSpecificationExecutor<Product_size> {
}