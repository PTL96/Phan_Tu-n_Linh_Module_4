package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayAll();

    void save(Product product);

    void edit(int id, Product product);

    Product findById(int id);

    void delete(int id);

    List<Product>search(String name);
}
