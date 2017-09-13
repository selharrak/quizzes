package ma.aselharrak.quiz.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ma.aselharrak.quiz.dao.model.Quiz;
import ma.aselharrak.quiz.dao.model.Test;
import ma.aselharrak.quiz.web.data.UserData;
import ma.aselharrak.quiz.web.facade.UserFacade;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class HomeController {

	@Autowired
	private UserFacade userFacade;

	@RequestMapping
	public @ResponseBody Set<UserData> getUsers() {
		final Set<UserData> users = userFacade.getAll();
		return users;
	}
	
	@RequestMapping(value = "quizzes")
	public @ResponseBody List<Quiz> getQuizzes() {

		List<Quiz> quizzes = new ArrayList<>();
		quizzes.add(new Quiz("Java", "java description ..."));
		quizzes.add(new Quiz("DevOps", "DevOps description ..."));
		quizzes.add(new Quiz("Front-end", "Front End description ..."));
		quizzes.add(new Quiz("UX / UI", "UX / UI description ..."));
		quizzes.add(new Quiz("Mobile", "Mobile description ..."));
		quizzes.add(new Quiz("PHP", "PHP description ..."));

		/*
		List<Test> tests = new ArrayList<>();
		tests.add(new Test("Test 1","Test 1 description", 30));
		tests.add(new Test("Test 2","Test 2 description", 15));
		tests.add(new Test("Test 3","Test 3 description", 25));
		tests.add(new Test("Test 4","Test 4 description", 30));

		Map< List<Quiz>, List<Test> > quizzeList= new HashMap<>();
		quizzeList.put(quizzes, tests);*/
		return quizzes;
	}

}
