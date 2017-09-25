/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.QuestionResponseDao;
import ma.aselharrak.quiz.dao.model.QuestionResponse;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class QuestionResponseDaoImpl extends CrudDaoImpl<QuestionResponse, Long> implements QuestionResponseDao {

	@PersistenceContext
	private EntityManager entityManager;

	public QuestionResponseDaoImpl() {
		super(QuestionResponse.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
