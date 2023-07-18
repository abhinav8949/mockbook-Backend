package com.mocktest.service.impl;

import com.mocktest.model.exam.Category;
import com.mocktest.repository.CategoryRepository;
import com.mocktest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return this.categoryRepository.findById(id).get();
    }

    @Override
    public Category addNewCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public Category updateOldCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        this.categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getCategoryByName() {



        return null;
    }


}
