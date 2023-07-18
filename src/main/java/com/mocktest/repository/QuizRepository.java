package com.mocktest.repository;

import com.mocktest.model.exam.Category;
import com.mocktest.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    public List<Quiz> findByCategory(Category category);
    public List<Quiz> findByActive(Boolean b);
    public List<Quiz> findByCategoryAndActive(Category c, boolean b);

}
