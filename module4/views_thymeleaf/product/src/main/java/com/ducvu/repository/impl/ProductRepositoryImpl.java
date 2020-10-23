package com.ducvu.repository.impl;

import com.ducvu.entity.Product;
import com.ducvu.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {


    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select p from product p",Product.class);

        return typedQuery.getResultList();
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public void save(Product student) {

    }
}
