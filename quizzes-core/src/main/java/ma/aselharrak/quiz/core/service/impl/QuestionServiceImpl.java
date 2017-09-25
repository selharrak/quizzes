/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.QuestionService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.QuestionDao;
import ma.aselharrak.quiz.dao.model.Question;

/**
 * @author SELHARRAK
 *
 */
@Service
public class QuestionServiceImpl extends CrudServiceImpl<Question, Long> implements QuestionService {

	@Autowired
	private QuestionDao questionDao;

	@Override
	protected CrudDao<Question, Long> getDao() {
		return questionDao;
	}

}
