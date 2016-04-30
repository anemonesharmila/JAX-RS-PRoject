/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JaxRs.dao;

import com.karki.JaxRs.entity.Category;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface CategoryDao {

    void insert(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> getAll();
    Category getById(int id);
            
}
