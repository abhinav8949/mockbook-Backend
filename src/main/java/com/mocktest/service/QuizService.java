package com.mocktest.service;

import com.mocktest.controller.response.GenericResponse;
import com.mocktest.model.exam.Category;
import com.mocktest.model.exam.Quiz;

import java.util.List;

public interface QuizService {

    public GenericResponse getAllQuiz();
    public Quiz getQuizById(Long id);
    public Quiz addNewQuiz(Quiz quiz);
    public Quiz updateOldQuiz(Quiz quiz);
    public void deleteQuiz(Long id);
    public List<Quiz> getAllQuizByCategory(Category category);
    public List<Quiz> getAllActiveQuiz();
    public List<Quiz> getAllActiveQuizOfSameCategory(Category category);
}
