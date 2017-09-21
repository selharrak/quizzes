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

	Quiz quizz1;
	Test t1;
	Question q1, q2, q3, q4;
	Response r1_1, r2_1, r3_1, r4_1, r1_2, r2_2, r3_2, r4_2, r1_3, r2_3, r3_3, r4_3, r1_4, r2_4, r3_4, r4_4;
	QuestionResponse q1r1, q1r2, q1r3, q1r4, q2r1, q2r2, q2r3, q2r4, q3r1, q3r2, q3r3, q3r4, q4r1, q4r2, q4r3, q4r4;
	Level l1, l2;

	@Before
	public void setUp() {

		quizz1 = new Quiz("Front-END", "Description For Front-END Quiz");

		t1 = new Test("JAVASCRIPT", "Description For JavaScript ...", 10);
		t1.setQuiz(quizz1);

		l1 = new Level("Beginner");
		l2 = new Level("Intermediate");

		q1 = new Question("Quel est le rapport entre Java et JavaScript ?");
		q1.setLevel(l1);
		r1_1 = new Response(
				"C'est le même langage, mais le nom  JavaScript  est utilisé pour le code s'exécutant dans une page Web.");
		r2_1 = new Response("Ce sont deux langages différents, malgré quelques points communs dans la syntaxe.");
		r3_1 = new Response("Java est une version améliorée de JavaScript.");
		r4_1 = new Response("Java est une île, ça n'a rien à voir !");
		q1r1 = new QuestionResponse(q1, r1_1, false);
		q1r2 = new QuestionResponse(q1, r2_1, true);
		q1r3 = new QuestionResponse(q1, r3_1, false);
		q1r4 = new QuestionResponse(q1, r4_1, false);

		q2 = new Question("Laquelle de ces syntaxes est correcte ?");
		q2.setLevel(l1);
		r1_2 = new Response(" if (a != 2) {}");
		r2_2 = new Response(" if a != 2 {}");
		r3_2 = new Response(" if (a <> 2) {}");
		r4_2 = new Response(" if a <> 2 {}");
		q2r1 = new QuestionResponse(q2, r1_2, true);
		q2r2 = new QuestionResponse(q2, r2_2, false);
		q2r3 = new QuestionResponse(q2, r3_2, false);
		q2r4 = new QuestionResponse(q2, r4_2, false);

		q3 = new Question("Quel attribut des noeuds de l'arbre DOM correspond à l'attribut (X)HTML class?");
		q3.setLevel(l1);
		r1_3 = new Response("class");
		r2_3 = new Response("CLASS");
		r3_3 = new Response("className");
		r4_3 = new Response("kiwi");
		q3r1 = new QuestionResponse(q3, r1_3, true);
		q3r2 = new QuestionResponse(q3, r2_3, false);
		q3r3 = new QuestionResponse(q3, r3_3, false);
		q3r4 = new QuestionResponse(q3, r4_3, false);

		q4 = new Question("Dans un fichier JavaScript externe (.js), il faut ?");
		q4.setLevel(l1);
		r1_4 = new Response("entourer le code avec les balises <script> et </script>.");
		r2_4 = new Response("préciser l’encodage du fichier avec la règle @charset.");
		r3_4 = new Response("échapper les caractères spéciaux (X)HTML.");
		r4_4 = new Response("Aucune des réponses précédentes.");
		q4r1 = new QuestionResponse(q4, r1_4, true);
		q4r2 = new QuestionResponse(q4, r2_4, false);
		q4r3 = new QuestionResponse(q4, r3_4, false);
		q4r4 = new QuestionResponse(q4, r4_4, false);

	}

	@org.junit.Test
	public void testCreate() {

	}

}
