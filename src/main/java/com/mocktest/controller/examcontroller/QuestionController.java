package com.mocktest.controller.examcontroller;

import com.mocktest.model.exam.Question;
import com.mocktest.model.exam.Quiz;
import com.mocktest.service.QuestionService;
import com.mocktest.service.QuizService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

@RestController
@RequestMapping(value = "/question")
@CrossOrigin("http://localhost:4200/")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuizService quizService;
    @Operation(summary = "Get All Questions")
    @GetMapping("/")
    public List<Question> getAllQuestions(){
        return this.questionService.getAllQuestions();
    }

//    @GetMapping("/question")
//    public List<Question> getPageQuestions(
//            @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize,
//            @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum
//    ){
//        return this.questionService.getOnePageQuestions(pageSize, pageNum);
//    }
    @Operation(summary = "Get Questions by qsnId")
    @GetMapping("/{qid}")
    public Question getQuestionById(@PathVariable("qid") Long qid){
        return this.questionService.getQuestionById(qid);
    }
    @Operation(summary = "Add New Questions")
    @PostMapping("/")
    public Question addNewQuestion(@RequestBody Question question){
        return this.questionService.addNewQuestion(question);
    }
    @Operation(summary = "Update Old Questions")
    @PutMapping("/")
    public Question updateOldQuestion(@RequestBody Question question){
        return this.questionService.updateOldQuestion(question);
    }
    @Operation(summary = "Delete Questions by qsnId")
    @DeleteMapping("/{qid}")
    public void deleteQuestionById(@PathVariable("qid") Long qid){
        this.questionService.deleteQuestion(qid);
    }
    @Operation(summary = "Get All Questions Of Specific quiz by quizId")
    @GetMapping("/quiz/all/{quiz_id}")
    public List<Question> getAllQuestionByQuiz(@PathVariable("quiz_id") Long quiz_id){
        Quiz quiz=new Quiz();
        quiz.setId(quiz_id);
        return this.questionService.getQuestionOfSameQuiz(quiz);
    }
    @Operation(summary = "Get Shuffled Questions of specific quiz", description = "This shuffled questions shown to examination.")
    @GetMapping("/quiz/{quiz_id}")
    public ResponseEntity<?> getShuffledQuestionByQuiz(@PathVariable("quiz_id") Long quiz_id){

        Quiz quizById = this.quizService.getQuizById(quiz_id);
        Set<Question> questions = quizById.getQuestions();

        List<Question> questionList=new ArrayList<>(questions);
        Collections.shuffle(questionList);
        return ResponseEntity.ok(questionList);
    }
    @Operation(summary = "Evaluation of quiz")
    @PostMapping("/eval-quiz")
    public ResponseEntity<?> evaluateQuizScore(@RequestBody List<Question> questions){

        DecimalFormat decfor = new DecimalFormat("0.00");
        decfor.setRoundingMode(RoundingMode.UP);

        System.out.println(questions);
        double marksGot=0;
        Integer correctAnswer=0;
        Integer attemptedQuestion=0;

        for(Question q:questions){
//            System.out.println(q.getGivenAnswer());
//            q.getQuesId();
            Question question = this.questionService.getOneQuestionById(q.getId());

            if(question.getAnswer().equals(q.getGivenAnswer())){
                correctAnswer++;
                double marksSingle=Double.parseDouble(questions.get(0).getQuiz().getMaxMarks())/questions.size();
                marksGot+=marksSingle;
            }
            if(q.getGivenAnswer()!=null){
                attemptedQuestion++;
            }
        };

        Map<String, Object> eval=Map.of("marksGot", decfor.format(marksGot), "correctAnswer", correctAnswer, "attemptedQuestion", attemptedQuestion);
        return ResponseEntity.ok(eval);
    }

}
