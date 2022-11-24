package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final List<Product> productList = new ArrayList<>();




    @Override
    public List<Product> displayAll(){
        Session session = null;
        List<Product> productList = null;
        try {
            session =  ConnectionUtil.sessionFactory.openSession();
            productList = session.createQuery("FROM Product").getResultList();
        }finally {
            if (session != null){
                session.close();
            }
        }
return productList;
    }

    @Override
    public void save(Product product){
        productList.add(product);
    }

    @Override
    public Product findById(int id){
       Session session = null;
       Product product = null;
       try {
           session = ConnectionUtil.sessionFactory.openSession();
           product = (Product) session.createQuery("FROM Product p where id = :idx").setParameter("idx",id).getSingleResult();
       }finally {
           if (session != null){
               session.close();
           }
       }
       return product;
    }

    @Override
    public void edit(int id, Product product){
Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(product);
            transaction.commit();
        }finally {
            if(session != null){
                session.close();
            }
        }
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
