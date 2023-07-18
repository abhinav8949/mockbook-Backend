package com.mocktest.repository;

import com.mocktest.model.exam.Question;
import com.mocktest.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    public List<Question> findByQuiz(Quiz quiz);

}
