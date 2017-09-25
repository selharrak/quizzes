/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.RoleService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.RoleDao;
import ma.aselharrak.quiz.dao.model.Role;

/**
 * @author SELHARRAK
 *
 */
@Service
public class RoleServiceImpl extends CrudServiceImpl<Role, Long> implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	protected CrudDao<Role, Long> getDao() {
		return roleDao;
	}

}
