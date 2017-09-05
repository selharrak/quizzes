/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.UserService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.UserDao;
import ma.aselharrak.quiz.dao.model.User;

/**
 * @author SELHARRAK
 *
 */
@Service
public class UserServiceImpl extends CrudServiceImpl<User, Long> implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	protected CrudDao<User, Long> getDao() {
		return userDao;
	}

}
