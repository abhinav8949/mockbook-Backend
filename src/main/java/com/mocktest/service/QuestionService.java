package com.mocktest.service;

import com.mocktest.model.exam.Question;
import com.mocktest.model.exam.Quiz;

import java.util.List;

public interface QuestionService {

    public List<Question> getAllQuestions();
    public List<Question> getOnePageQuestions(Integer pageSize, Integer pageNum);
    public Question getQuestionById(Long id);
    public Question addNewQuestion(Question question);
    public Question updateOldQuestion(Question question);
    public void deleteQuestion(Long id);
    public List<Question> getQuestionOfSameQuiz(Quiz quiz);
    public Question getOneQuestionById(Long id);
}
