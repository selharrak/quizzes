package ma.aselharrak.quiz.web.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ma.aselharrak.quiz.web.data.UserData;
import ma.aselharrak.quiz.web.facade.UserFacade;

@Controller
@RequestMapping("/")

public class HomeController {

	@Autowired
	private UserFacade userFacade;

	@RequestMapping
	public @ResponseBody Set<UserData> getUsers() {
		final Set<UserData> users = userFacade.getAll();
		return users;
	}

}
