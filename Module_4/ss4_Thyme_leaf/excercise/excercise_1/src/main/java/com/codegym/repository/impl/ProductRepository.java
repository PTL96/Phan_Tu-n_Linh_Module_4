package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Iphone X","10.000.000 VNĐ","Gold","Apple"));
        productList.add(new Product(2,"SamSung Note 10","11.000.000 VNĐ","Violet","SamSung"));
        productList.add(new Product(3,"Iphone 13","14.000.000 VNĐ","Black","Apple"));
        productList.add(new Product(4,"SamSung Note 20","22.000.000 VNĐ","Blue","SamSung"));
        productList.add(new Product(5,"Nokia","12.000.000 VNĐ","Blue","Nokia"));
        productList.add(new Product(6,"Iphone 14","25.000.000 VNĐ","Blue","Apple"));
        productList.add(new Product(7,"Iphone 14 Pro max","42.000.000 VNĐ","Blue","Apple"));
    }
    @Override
    public List<Product> displayAll(){
       return productList;
    }

    @Override
    public void save(Product product){
        productList.add(product);
    }

    @Override
    public Product findById(int id){
        for (Product product : productList) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public void edit(int id, Product product){

    }

    @Override
    public void delete(int id){
        productList.remove(id);
    }

    @Override
    public List<Product>search(String name){
        return productList;
    }
}
