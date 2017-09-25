/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.QuestionResponseService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.QuestionResponseDao;
import ma.aselharrak.quiz.dao.model.QuestionResponse;

/**
 * @author SELHARRAK
 *
 */
@Service
public class QuestionResponseServiceImpl extends CrudServiceImpl<QuestionResponse, Long>
		implements QuestionResponseService {

	@Autowired
	private QuestionResponseDao questionResponseDao;

	@Override
	protected CrudDao<QuestionResponse, Long> getDao() {
		return questionResponseDao;
	}

}
