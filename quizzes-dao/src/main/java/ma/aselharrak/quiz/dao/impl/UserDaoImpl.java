/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.UserDao;
import ma.aselharrak.quiz.dao.model.User;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class UserDaoImpl extends CrudDaoImpl<User, Long> implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDaoImpl() {
		super(User.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
