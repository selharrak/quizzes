/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.UserTestService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.UserTestDao;
import ma.aselharrak.quiz.dao.model.UserTest;

/**
 * @author SELHARRAK
 *
 */
@Service
public class UserTestServiceImpl extends CrudServiceImpl<UserTest, Long> implements UserTestService {

	@Autowired
	private UserTestDao userTestDao;

	@Override
	protected CrudDao<UserTest, Long> getDao() {
		return userTestDao;
	}

}
