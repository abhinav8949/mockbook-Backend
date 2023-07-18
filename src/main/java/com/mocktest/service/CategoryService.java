package com.mocktest.service;

import com.mocktest.model.exam.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getAllCategories();
    public Category getCategoryById(Long id);
    public Category addNewCategory(Category category);
    public Category updateOldCategory(Category category);
    public void deleteCategory(Long id);

    public List<Category> getCategoryByName();

}
