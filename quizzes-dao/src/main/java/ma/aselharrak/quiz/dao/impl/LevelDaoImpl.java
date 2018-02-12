/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.LevelDao;
import ma.aselharrak.quiz.dao.model.Level;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class LevelDaoImpl extends CrudDaoImpl<Level, Long> implements LevelDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public LevelDaoImpl() {
		super(Level.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
