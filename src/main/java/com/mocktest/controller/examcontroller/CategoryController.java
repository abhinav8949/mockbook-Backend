package com.mocktest.controller.examcontroller;

import com.mocktest.model.exam.Category;
import com.mocktest.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
@CrossOrigin("http://localhost:4200/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Operation(summary = "Get All category", description = "Getting All Cateogry object.")
    @GetMapping("/")
    public List<Category> getAllExamCategory(){
        List<Category> allCategories = this.categoryService.getAllCategories();
        return allCategories;
    }
    @Operation(summary = "Get category by id", description = "Get a Cateogry object by specifying its id, " +
            "The response is Category object with id, title, description.")
    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable("categoryId") Long categoryId){
        return this.categoryService.getCategoryById(categoryId);
    }
    @Operation(summary = "Create category", description = "Creating a Cateogry object.")
    @PostMapping("/")
    public Category saveCategoryData(@RequestBody Category category){
        return this.categoryService.addNewCategory(category);
    }
    @Operation(summary = "Update category by id - x", description = "Updating a Cateogry object by specifying its id.")
    @PutMapping("/")
    public Category updateOldCategoryData(@RequestBody Category category){
        return this.categoryService.updateOldCategory(category);
    }
    @Operation(summary = "Delete category by id.", description = "Deleting a Cateogry object by specifying its id.")
    @DeleteMapping("/{categoryId}")
    public void deleteCategoryById(@PathVariable("categoryId") Long categoryId){
        this.categoryService.deleteCategory(categoryId);
    }


}
