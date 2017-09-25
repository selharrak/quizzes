/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.TestQuestionDao;
import ma.aselharrak.quiz.dao.model.TestQuestion;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class TestQuestionDaoImpl extends CrudDaoImpl<TestQuestion, Long> implements TestQuestionDao {

	@PersistenceContext
	private EntityManager entityManager;

	public TestQuestionDaoImpl() {
		super(TestQuestion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
