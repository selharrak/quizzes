package ma.aselharrak.quiz.web.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.aselharrak.quiz.web.data.TestData;
import ma.aselharrak.quiz.web.facade.TestFacade;

/**
 * 
 * @author AELHARRAK
 *
 */
@Controller
@RequestMapping("/tests")
public class TestController {

	@Autowired
	private TestFacade testFacade;

	@GetMapping("/{idQuizz}")
	public String displayTestsForQuiz(final Model model, final @PathVariable Long idQuizz) {
		final Set<TestData> tests = testFacade.getAllTestForQuiz(idQuizz);
		model.addAttribute("tests", tests);
		return "tests";
	}
}
