/**
 * 
 */
package ma.aselharrak.quiz.web.converter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ma.aselharrak.quiz.dao.model.User;
import ma.aselharrak.quiz.web.data.UserData;

/**
 * @author SELHARRAK
 *
 */
@Component
public class UserConverter implements Converter<User, UserData>{

	@Override
	public UserData convert(final User user) {
		final UserData userData = new UserData();
		userData.setEmail(user.getEmail());
		userData.setPassword(user.getPassword());
		userData.setUserName(user.getUserName());
		userData.setEnabled(user.isEnabled());
		userData.setCreated(user.getCreated());
		return userData;
	}

	public Set<UserData> convert(final Collection<User> usersModel) {
		final Set<UserData> usersData = new HashSet<>();
		for (User user : usersModel) {
			usersData.add(convert(user));
		}
		return usersData;
	}

}
