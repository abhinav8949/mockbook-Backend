package com.mocktest.service.impl;

import com.mocktest.controller.response.GenericResponse;
import com.mocktest.model.exam.Category;
import com.mocktest.model.exam.Quiz;
import com.mocktest.repository.QuizRepository;
import com.mocktest.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Override
    public GenericResponse getAllQuiz() {
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setObjResponse(this.quizRepository.findAll());
        genericResponse.setMsg("getting success");
        return genericResponse;
//        return this.quizRepository.findAll();

    }

    @Override
    public Quiz getQuizById(Long id) {
        return this.quizRepository.findById(id).get();
    }

    @Override
    public Quiz addNewQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateOldQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public void deleteQuiz(Long id) {
        this.quizRepository.deleteById(id);
    }

    @Override
    public List<Quiz> getAllQuizByCategory(Category category) {
        return this.quizRepository.findByCategory(category);
    }

    @Override
    public List<Quiz> getAllActiveQuiz() {
        return this.quizRepository.findByActive(true);
    }

    @Override
    public List<Quiz> getAllActiveQuizOfSameCategory(Category category) {
        return this.quizRepository.findByCategoryAndActive(category, true);
    }


}
