/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.QuestionDao;
import ma.aselharrak.quiz.dao.model.Question;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class QuestionDaoImpl extends CrudDaoImpl<Question, Long> implements QuestionDao {

	@PersistenceContext
	private EntityManager entityManager;

	public QuestionDaoImpl() {
		super(Question.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
