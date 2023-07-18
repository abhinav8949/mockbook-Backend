package com.mocktest.controller.examcontroller;

import com.mocktest.controller.response.GenericResponse;
import com.mocktest.model.exam.Category;
import com.mocktest.model.exam.Quiz;
import com.mocktest.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/quiz")
@CrossOrigin("http://localhost:4200/")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/")
    public ResponseEntity<GenericResponse> getAllQuiz(){

        return new ResponseEntity<>(this.quizService.getAllQuiz(), HttpStatus.OK);

    }
    @GetMapping("/{quizId}")
    public Quiz getQuizById(@PathVariable("quizId") Long quizId){
        return this.quizService.getQuizById(quizId);
    }
    @PostMapping("/")
    public Quiz addNewQuiz(@RequestBody Quiz quiz){
        return this.quizService.addNewQuiz(quiz);
    }
    @PutMapping("/")
    public Quiz updateOldQuiz(@RequestBody Quiz quiz){
        return this.quizService.updateOldQuiz(quiz);
    }
    @DeleteMapping("/{quizId}")
    public void deleteQuiz(@PathVariable("quizId") Long quizId){
        this.quizService.deleteQuiz(quizId);
    }

    @GetMapping("/category/{cid}")
    public List<Quiz> getAllQuizOfSameCategory(@PathVariable("cid") Long cid){
        Category category=new Category();
        category.setId(cid);
        System.out.println(category);
        return this.quizService.getAllQuizByCategory(category);

    }

    @GetMapping("/active")
    public List<Quiz> getAllActiveQuiz(){
        return this.quizService.getAllActiveQuiz();
    }

    @GetMapping("/category/active/{cid}")
    public List<Quiz> getAllActiveQuizofSameCategory(@PathVariable("cid") Long cid){
        Category category=new Category();
        category.setId(cid);
        return this.quizService.getAllActiveQuizOfSameCategory(category);
    }


}
