/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JaxRs.dao.impl;

import com.karki.JaxRs.dao.CategoryDao;
import com.karki.JaxRs.entity.Category;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sharmila
 */
public class CategoryDaoImpl implements CategoryDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction trans;

    public CategoryDaoImpl() {
        emf = Persistence.createEntityManagerFactory("JaxRSPU");
        em=emf.createEntityManager();
    }

    @Override
    public void insert(Category category) {
        trans = em.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        em.persist(category);
        em.flush();
        trans.commit();
    }

    @Override
    public void update(Category category) {
        trans = em.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        em.merge(category);
        em.flush();
        trans.commit();
    }

    @Override
    public void delete(int id) {
        trans = em.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        Category category = getById(id);
        if (category != null) {
            em.remove(category);
        }
        em.flush();
        trans.commit();
    }

    @Override
    public List<Category> getAll() {
        return em.createQuery("SELECT c FROM Category c").getResultList();
    }

    @Override
    public Category getById(int id) {
        return em.find(Category.class, id);
    }

  

}
