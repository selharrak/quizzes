/**
 * 
 */
package ma.aselharrak.quiz.core.service;

import java.util.Collection;

import ma.aselharrak.quiz.dao.model.Test;

/**
 * @author SELHARRAK
 *
 */
public interface TestService extends CrudService<Test, Long> {

	public Collection<Test> getAllTestForQuiz(Long idQuiz);

}
