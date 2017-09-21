/**
 * 
 */
package ma.aselharrak.quiz.dao.test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ma.aselharrak.quiz.dao.LevelDao;
import ma.aselharrak.quiz.dao.QuestionDao;
import ma.aselharrak.quiz.dao.QuestionResponseDao;
import ma.aselharrak.quiz.dao.QuizDao;
import ma.aselharrak.quiz.dao.ResponseDao;
import ma.aselharrak.quiz.dao.TestDao;
import ma.aselharrak.quiz.dao.TestQuestionDao;
import ma.aselharrak.quiz.dao.model.Quiz;

/**
 * @author SELHARRAK
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:quizzes-dao-config.xml")
@Transactional
public class QuizDaoIntegrationTest {

	@Autowired
	QuizDao quizDao;
	@Autowired
	TestDao testDao;
	@Autowired
	TestQuestionDao testQuestionDao;
	@Autowired
	QuestionResponseDao questionResponseDao;
	@Autowired
	QuestionDao questionDao;
	@Autowired
	ResponseDao responseDao;
	@Autowired
	LevelDao levelDao;

	@Test
	public void testCreate() {
		Quiz newQuiz = new Quiz("Front-END", "Description For Front-END Quiz");
		ma.aselharrak.quiz.dao.model.Test test = new ma.aselharrak.quiz.dao.model.Test("JAVASCRIPT","Description For JavaScript ...", 10);
		Set<ma.aselharrak.quiz.dao.model.Test> tests = new HashSet<>();
		tests.add(test);
		newQuiz.setTests(tests);
	}

}
