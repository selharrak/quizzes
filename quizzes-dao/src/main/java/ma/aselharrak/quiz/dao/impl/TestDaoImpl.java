/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.TestDao;
import ma.aselharrak.quiz.dao.model.Test;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class TestDaoImpl extends CrudDaoImpl<Test, Long> implements TestDao {

	@PersistenceContext
	private EntityManager entityManager;

	public TestDaoImpl() {
		super(Test.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
