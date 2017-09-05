/**
 * 
 */
package ma.aselharrak.quiz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ma.aselharrak.quiz.core.service.UserService;
import ma.aselharrak.quiz.dao.model.User;

/**
 * @author SELHARRAK
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:quizzes-core-config.xml" , "classpath*:quizzes-dao-config.xml"})
@Transactional
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	User user;

	@Before
	public void setUp() {
		user = new User("selharrak@hotmail.com", "xxxxx", "selharrak");
	}

	@Test
	public void testCreate() {
		userService.create(user);
	}

}
