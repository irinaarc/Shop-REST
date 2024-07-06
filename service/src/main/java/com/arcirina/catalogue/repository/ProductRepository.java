package com.arcirina.catalogue.repository;

import com.arcirina.catalogue.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();

    Product save(Product product);

    Optional<Product> finById(Integer productId);

    void deleteById(Integer id);
}