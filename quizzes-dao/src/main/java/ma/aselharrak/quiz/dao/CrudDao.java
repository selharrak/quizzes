/**
 * 
 */
package ma.aselharrak.quiz.dao;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author SELHARRAK
 *
 */
public interface CrudDao<Entity, PK extends Serializable> {

	void create(final Entity entity);

	Entity read(final PK pk);

	void update(final Entity entity);
	
	void delete(final Entity entity);
	
	Collection<Entity> getAll();

}
