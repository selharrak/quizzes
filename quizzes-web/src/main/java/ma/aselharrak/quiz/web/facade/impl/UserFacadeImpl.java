/**
 * 
 */
package ma.aselharrak.quiz.web.facade.impl;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.aselharrak.quiz.core.service.UserService;
import ma.aselharrak.quiz.dao.model.User;
import ma.aselharrak.quiz.web.converter.UserConverter;
import ma.aselharrak.quiz.web.data.UserData;
import ma.aselharrak.quiz.web.facade.UserFacade;

/**
 * @author SELHARRAK
 *
 */
@Component
public class UserFacadeImpl implements UserFacade {

	@Autowired
	private UserService userService;

	@Autowired
	private UserConverter userConverter;

	@Override
	public Set<UserData> getAll() {
		final Collection<User> usersModel = userService.getAll();
		final Set<UserData> usersData = userConverter.convert(usersModel);
		return usersData;
	}

}
