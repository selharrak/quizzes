package ma.aselharrak.quiz.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ma.aselharrak.quiz.model.Quiz;

@Controller
@RequestMapping("/")

public class HomeController {

	@RequestMapping(value = "quizzes")
	public @ResponseBody ArrayList<Quiz> getQuizzes() {

		ArrayList<Quiz> quizzes = new ArrayList<>();
		quizzes.add(new Quiz("Java", "java description ..."));
		quizzes.add(new Quiz("DevOps", "java description ..."));
		quizzes.add(new Quiz("Front-end", "java description ..."));
		quizzes.add(new Quiz("UX / UI", "java description ..."));
		quizzes.add(new Quiz("Mobile", "java description ..."));

		return quizzes;
	}

}
