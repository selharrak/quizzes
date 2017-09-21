/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.UserTestDao;
import ma.aselharrak.quiz.dao.model.UserTest;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class UserTestDaoImpl extends CrudDaoImpl<UserTest, Long> implements UserTestDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserTestDaoImpl() {
		super(UserTest.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
