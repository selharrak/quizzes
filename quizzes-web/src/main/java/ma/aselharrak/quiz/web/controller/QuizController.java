package ma.aselharrak.quiz.web.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ma.aselharrak.quiz.web.data.QuizData;
import ma.aselharrak.quiz.web.data.TestData;
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
	public String getAll(Model m) {
		m.addAttribute("quizzes",quizFacade.getAll());
		return "quizzes";
	}

	@RequestMapping("/quiz/{id}/{label}")
	public String getQuiz(Model model,
						  @PathVariable Long id,
						  @PathVariable String label ) {
		
		model.addAttribute("title",label);
		model.addAttribute("tests",quizFacade.getTestsBy(id));
		return "quiz";
	}

	
	
	
	@GetMapping("/getAll.json")
	@ResponseBody
	public Set<QuizData> getAllJson() {
		return quizFacade.getAll();
	}
	
	@RequestMapping("/quiz/jsoon/{id}/{label}")
	@ResponseBody
	public Set<TestData> getQuizJson(  @PathVariable Long id, @PathVariable String label ) {
		return quizFacade.getTestsBy(id);
	}
}
