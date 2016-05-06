/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.jaxrs.dao;

import com.karki.jaxrs.entity.Customer;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface CustomerDao {
   List<Customer> login(String email,String password);
}
