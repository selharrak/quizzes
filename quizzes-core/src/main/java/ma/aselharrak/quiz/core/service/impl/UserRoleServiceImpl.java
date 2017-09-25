/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.UserRoleService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.UserRoleDao;
import ma.aselharrak.quiz.dao.model.UserRole;

/**
 * @author SELHARRAK
 *
 */
@Service
public class UserRoleServiceImpl extends CrudServiceImpl<UserRole, Long> implements UserRoleService {

	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	protected CrudDao<UserRole, Long> getDao() {
		return userRoleDao;
	}

}
