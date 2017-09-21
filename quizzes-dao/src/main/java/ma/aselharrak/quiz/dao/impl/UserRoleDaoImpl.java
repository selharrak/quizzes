/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.UserRoleDao;
import ma.aselharrak.quiz.dao.model.UserRole;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class UserRoleDaoImpl extends CrudDaoImpl<UserRole, Long> implements UserRoleDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserRoleDaoImpl() {
		super(UserRole.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
