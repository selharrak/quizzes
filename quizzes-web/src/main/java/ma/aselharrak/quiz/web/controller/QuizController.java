package ma.aselharrak.quiz.web.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.aselharrak.quiz.web.data.QuizData;
import ma.aselharrak.quiz.web.facade.QuizFacade;
/**
 * 
 * @author AELHARRAK
 *
 */
@RestController
@RequestMapping("/quizzes")
public class QuizController {

	@Autowired
	private QuizFacade quizFacade;

	@GetMapping
	public Set<QuizData> getAll() {
		return quizFacade.getAll();
	}

}
