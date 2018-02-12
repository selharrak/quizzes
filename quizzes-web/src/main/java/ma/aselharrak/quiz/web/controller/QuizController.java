package ma.aselharrak.quiz.web.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.aselharrak.quiz.web.data.QuizData;
import ma.aselharrak.quiz.web.facade.QuizFacade;

/**
 * 
 * @author AELHARRAK
 *
 */
@Controller
@RequestMapping("/quizzes")
public class QuizController {

	@Autowired
	private QuizFacade quizFacade;

	@GetMapping
	public String displayQuizzes(final Model model) {
		final Set<QuizData> quizzes = quizFacade.getAllQuiz();
		model.addAttribute("quizzes", quizzes);
		return "quizzes";
	}

}
