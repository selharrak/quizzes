/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.aselharrak.quiz.dao.ResponseDao;
import ma.aselharrak.quiz.dao.model.Response;

/**
 * @author SELHARRAK
 *
 */
@Repository
public class ResponseDaoImpl extends CrudDaoImpl<Response, Long> implements ResponseDao {

	@PersistenceContext
	private EntityManager entityManager;

	public ResponseDaoImpl() {
		super(Response.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
