/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JaxRs.service.impl;

import com.karki.JaxRs.dao.CategoryDao;
import com.karki.JaxRs.dao.impl.CategoryDaoImpl;
import com.karki.JaxRs.entity.Category;
import com.karki.JaxRs.service.CategoryService;
import java.util.List;

/**
 *
 * @author sharmila
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public void insert(Category category) {
        categoryDao.insert(category);
    }

    @Override
    public void update(Category category) {
        categoryDao.update(category);
    }

    @Override
    public void delete(int id) {
        categoryDao.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    @Override
    public Category getById(int id) {
        return categoryDao.getById(id);
    }

}
