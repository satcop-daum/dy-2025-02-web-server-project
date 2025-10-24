package com.example.sbb;

import com.example.sbb.entity.Answer;
import com.example.sbb.entity.Question;
import com.example.sbb.repository.AnswerRepository;
import com.example.sbb.repository.QuestionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    /*
    @Test
    void testJpaAdd() {
        Question q1 = new Question();
        q1.setSubject("질문1 입니다.");
        q1.setContent("질문1에 대한 내용입니다.");
        q1.setCreateDate(LocalDateTime.now());
        questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("질문2 입니다.");
        q2.setContent("질문2에 대한 내용입니다.");
        q2.setCreateDate(LocalDateTime.now());
        questionRepository.save(q2);
    }
    */

    /*
    @Test
    void testJpaGets() {

        List<Question> questionList = questionRepository.findAll();
        assertEquals(4, questionList.size());

        Question q1 = questionList.get(0);
        assertEquals("질문1 입니다..", q1.getSubject());
    }
    */

    /*
    @Test
    void testJpaGet() {

        Optional<Question> optionalQuestion = questionRepository.findById(1);
        if (optionalQuestion.isPresent()) {
            Question question = optionalQuestion.get();
            assertEquals("질문1 입니다.", question.getSubject());
        }
    }
    */

    /*
    @Test
    void testJpaSubject() {

        //Question question = questionRepository.findBySubject("질문1 입니다.");
        //assertEquals(1, question.getId());

        Question question = questionRepository.findBySubjectAndContent("질문1 입니다.", "질문1에 대한 내용입니다.");
        assertEquals(1, question.getId());
    }
    */

    /*
    @Test
    void testJpaSubjectLike() {
        List<Question> questions = questionRepository.findBySubjectLike("%질문%");
        assertEquals(2, questions.size());
    }
    */


    /*
    @Test
    void testJpaUpdate() {
        Optional<Question> question = questionRepository.findById(1);
        assertTrue(question.isPresent());

        Question q =  question.get();
        q.setSubject("질문1에 대한 수정 진행.");
        questionRepository.save(q);
    }
    */

    /*
    @Test
    void testJpaDelete() {
        long count = questionRepository.count();
        assertEquals(2, count);

        Optional<Question> question = questionRepository.findById(1);
        assertTrue(question.isPresent());

        Question q = question.get();
        questionRepository.delete(q);

        long count2 = questionRepository.count();
        assertEquals(1, count2);
    }
    */

    /*
    @Test
    void testJpaAnswerSave() {
        Optional<Question> question = questionRepository.findById(2);
        assertTrue(question.isPresent());

        Question q = question.get();

        Answer a = new Answer();
        a.setContent("질문2에 대한 답변입니다.");
        a.setQuestion(q);
        a.setCreateDate(LocalDateTime.now());
        answerRepository.save(a);
    }
    */

    /*
    @Test
    void testJpaAnswerGet() {

        Optional<Answer> answer = answerRepository.findById(1);
        assertTrue(answer.isPresent());

        Answer a = answer.get();
        assertEquals(2, a.getQuestion().getId());
    }
    */

    @Transactional
    @Test
    void testJpaQuestionGetAnswer() {
        Optional<Question> question = questionRepository.findById(2);
        assertTrue(question.isPresent());

        Question q = question.get();

        List<Answer> answers = q.getAnswerList();

        assertEquals(1, answers.size());
        assertEquals("질문2에 대한 답변입니다.", answers.get(0).getContent());
    }


}
