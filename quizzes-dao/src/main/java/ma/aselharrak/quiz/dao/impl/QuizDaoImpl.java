/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.QuizDao;
import ma.aselharrak.quiz.dao.model.Quiz;

/**
 * @author AELHARRAK
 *
 */
@Repository
public class QuizDaoImpl extends CrudDaoImpl<Quiz, Long> implements QuizDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	public QuizDaoImpl() {
		super(Quiz.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
