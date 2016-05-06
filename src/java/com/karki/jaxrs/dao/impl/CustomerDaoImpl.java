/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.jaxrs.dao.impl;

import com.karki.jaxrs.dao.CustomerDao;
import com.karki.jaxrs.entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sharmila
 */
public class CustomerDaoImpl implements CustomerDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction trans;

    public CustomerDaoImpl() {
        emf = Persistence.createEntityManagerFactory("JaxRSPU");
        em = emf.createEntityManager();
    }

    @Override
    public List<Customer> login(String email, String password) {
        return em.createQuery("SELECT c.email,c.password,c.status from Customer where c.status='1'").getResultList();
    }

}
