package com.example.huhacha.service.Iservice;

import com.example.huhacha.entitis.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

//    public Page<Product> getAllProducts(Pageable paging);
//
//    public Product getProductByID(short id);
//
//    public Product getProductByName(String name);
//
//    public void createProduct(Product product);
//
//    public void updateProduct(Product product);
//
//    public void deleteProduct(short id);
//
//    public boolean isProductExistsByID(short id);
//
//    public boolean isProductExistsByName(String name);

    public List<Product> findByNameLike(String name);

//    public List<Product> findAllByOrderByIdDesc();
}

