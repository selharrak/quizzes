/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Test> getAllTestForQuiz(final Long idQuiz) {
		final String FIND_ALL_TEST_FOR_QUIZ_QUERY = new StringBuilder("from ").append(Test.class.getName())
				.append(" test where test.quiz.id = :idQuiz").toString();
		final Query query = getEntityManager().createQuery(FIND_ALL_TEST_FOR_QUIZ_QUERY);
		query.setParameter("idQuiz", idQuiz);
		return query.getResultList();
	}

}
