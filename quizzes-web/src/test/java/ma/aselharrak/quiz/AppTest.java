package ma.aselharrak.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppTest {

	@RequestMapping(value = "/")
	public String welcome(Model model) {// Welcome page, non-rest
		model.addAttribute("test", "test");
		return "home";
	}
}
