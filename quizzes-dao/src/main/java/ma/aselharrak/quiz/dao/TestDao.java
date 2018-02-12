/**
 * 
 */
package ma.aselharrak.quiz.dao;

import java.util.Collection;
import java.util.Set;

import ma.aselharrak.quiz.dao.model.Test;

/**
 * @author SELHARRAK
 *
 */
public interface TestDao extends CrudDao<Test, Long> {

	Collection<Test> getAllTestForQuiz(final Long idQuiz);

}
