/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.TestQuestionService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.TestQuestionDao;
import ma.aselharrak.quiz.dao.model.TestQuestion;

/**
 * @author SELHARRAK
 *
 */
@Service
public class TestQuestionServiceImpl extends CrudServiceImpl<TestQuestion, Long> implements TestQuestionService {

	@Autowired
	private TestQuestionDao testQuestionDao;

	@Override
	protected CrudDao<TestQuestion, Long> getDao() {
		return testQuestionDao;
	}

}
