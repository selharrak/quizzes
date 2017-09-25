/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.RoleDao;
import ma.aselharrak.quiz.dao.model.Role;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class RoleDaoImpl extends CrudDaoImpl<Role, Long> implements RoleDao {

	@PersistenceContext
	private EntityManager entityManager;

	public RoleDaoImpl() {
		super(Role.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
