/**
 * 
 */
package ma.aselharrak.quiz.dao.test;

import org.junit.Before;
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
import ma.aselharrak.quiz.dao.model.Level;
import ma.aselharrak.quiz.dao.model.Question;
import ma.aselharrak.quiz.dao.model.QuestionResponse;
import ma.aselharrak.quiz.dao.model.Quiz;
import ma.aselharrak.quiz.dao.model.Response;
import ma.aselharrak.quiz.dao.model.Test;
import ma.aselharrak.quiz.dao.model.TestQuestion;

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

	Quiz quizz;
	Test test;
	Question question;
	TestQuestion testQuestion;
	Response firstResponse, secondResponse, thirdResponse, fourthResponse;
	QuestionResponse fristQuestionResponse, secondQuestionResponse, thirdQuestionResponse, fourthQuestionResponse;
	Level beginner, intermediate;

	@Before
	public void setUp() {

		beginner = new Level("Beginner");
		intermediate = new Level("Intermediate");
		
		quizz = new Quiz("Front-END", "Description For Front-END Quiz");
		
		test = new Test("JAVASCRIPT", "Description For JavaScript ...", 10);
		
		question = new Question("Quel est le rapport entre Java et JavaScript ?");
		
		testQuestion = new TestQuestion();
		
		firstResponse = new Response("C'est le même langage, mais le nom  JavaScript  est utilisé pour le code s'exécutant dans une page Web.");
		secondResponse = new Response("Ce sont deux langages différents, malgré quelques points communs dans la syntaxe.");
		thirdResponse = new Response("Java est une version améliorée de JavaScript.");
		fourthResponse = new Response("Java est une île, ça n'a rien à voir !");
		
		fristQuestionResponse = new QuestionResponse();
		secondQuestionResponse = new QuestionResponse();
		thirdQuestionResponse = new QuestionResponse();
		fourthQuestionResponse = new QuestionResponse();

	}

	@org.junit.Test
	public void initDb() {
		/**/
		levelDao.create(beginner);
		levelDao.create(intermediate);
		
		quizDao.create(quizz);
		
		test.setQuiz(quizDao.read(quizz.getId()));
		testDao.create(test);
		
		question.setLevel(levelDao.read(beginner.getId()));
		questionDao.create(question);
		
		testQuestion.setQuestion(questionDao.read(question.getId()));
		testQuestion.setTest(testDao.read(test.getId()));
		testQuestionDao.create(testQuestion);
		
		responseDao.create(firstResponse);
		responseDao.create(secondResponse);
		responseDao.create(thirdResponse);
		responseDao.create(fourthResponse);
		
		fristQuestionResponse.setQuestion(questionDao.read(question.getId()));
		fristQuestionResponse.setResponse(responseDao.read(firstResponse.getId()));
		fristQuestionResponse.setStatus(false);
		questionResponseDao.create(fristQuestionResponse);
		
		secondQuestionResponse.setQuestion(questionDao.read(question.getId()));
		secondQuestionResponse.setResponse(responseDao.read(secondResponse.getId()));
		secondQuestionResponse.setStatus(true);
		questionResponseDao.create(secondQuestionResponse);
		
		thirdQuestionResponse.setQuestion(questionDao.read(question.getId()));
		thirdQuestionResponse.setResponse(responseDao.read(thirdResponse.getId()));
		thirdQuestionResponse.setStatus(false);
		questionResponseDao.create(thirdQuestionResponse);
		
		fourthQuestionResponse.setQuestion(questionDao.read(question.getId()));
		fourthQuestionResponse.setResponse(responseDao.read(fourthResponse.getId()));
		fourthQuestionResponse.setStatus(false);
		questionResponseDao.create(fourthQuestionResponse);
		
	}

}
