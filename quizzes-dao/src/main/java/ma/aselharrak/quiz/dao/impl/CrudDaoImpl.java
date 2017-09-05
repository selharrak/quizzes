/**
 * 
 */
package ma.aselharrak.quiz.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import ma.aselharrak.quiz.dao.CrudDao;

/**
 * @author SELHARRAK
 *
 */
public abstract class CrudDaoImpl<Entity, PK extends Serializable> implements CrudDao<Entity, PK> {

	private Class<Entity> entityClass;

	public CrudDaoImpl(final Class<Entity> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	@Override
	@Transactional
	public void create(final Entity entity) {
		getEntityManager().persist(entity);
	}

	@Override
	public Entity read(final PK pk) {
		return getEntityManager().find(entityClass, pk);
	}

	@Override
	@Transactional
	public void update(final Entity entity) {
		getEntityManager().merge(entity);
	}

	@Override
	@Transactional
	public void delete(final Entity entity) {
		getEntityManager().remove(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Entity> getAll() {
		final String FIND_ALL_QUERY = new StringBuilder("from ").append(entityClass.getSimpleName()).append(" entity")
				.toString();
		final Query query = getEntityManager().createQuery(FIND_ALL_QUERY);
		return query.getResultList();
	}

}
