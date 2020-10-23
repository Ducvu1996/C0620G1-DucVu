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
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select p from product p " +
                " where p.product_id= :product_id" ,Product.class);
        typedQuery.setParameter("product_id", id);
        return typedQuery.getSingleResult();
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();

    }

    @Override
    public void update( Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();

    }

    @Override
    public void remove(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Product product = findById(id);
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }
}
