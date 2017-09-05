/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import java.io.Serializable;
import java.util.Collection;

import ma.aselharrak.quiz.core.service.CrudService;
import ma.aselharrak.quiz.dao.CrudDao;

/**
 * @author SELHARRAK
 *
 */
public abstract class CrudServiceImpl<Entity, PK extends Serializable> implements CrudService<Entity, PK> {
	
	protected abstract CrudDao<Entity, PK> getDao();

	@Override
	public void create(final Entity entity) {
		getDao().create(entity);
	}

	@Override
	public Entity read(final PK pk) {
		return getDao().read(pk);
	}

	@Override
	public void update(final Entity entity) {
		getDao().update(entity);
	}

	@Override
	public void delete(final Entity entity) {
		getDao().delete(entity);
	}

	@Override
	public Collection<Entity> getAll() {
		return getDao().getAll();
	}

}
