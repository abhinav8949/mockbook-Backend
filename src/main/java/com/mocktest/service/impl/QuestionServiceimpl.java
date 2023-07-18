package com.mocktest.service.impl;

import com.mocktest.model.exam.Question;
import com.mocktest.model.exam.Quiz;
import com.mocktest.repository.QuestionRepository;
import com.mocktest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceimpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    @Override
    public List<Question> getAllQuestions() {
        return this.questionRepository.findAll();
    }

    @Override
    public List<Question> getOnePageQuestions(Integer pageSize, Integer pageNum) {

        Pageable page= PageRequest.of(pageSize, pageNum);

        Page<Question> pageQuestion = questionRepository.findAll(page);
        List<Question> content = pageQuestion.getContent();
        return content;

    }

    @Override
    public Question getQuestionById(Long id) {
        if (id==null){
            throw new RuntimeException("No value present");
        }
        return this.questionRepository.findById(id).get();
    }

    @Override
    public Question addNewQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Question updateOldQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        this.questionRepository.deleteById(id);
    }

    @Override
    public List<Question> getQuestionOfSameQuiz(Quiz quiz) {
        return this.questionRepository.findByQuiz(quiz);
    }

    @Override
    public Question getOneQuestionById(Long id) {
        return questionRepository.getOne(id);
    }
}
