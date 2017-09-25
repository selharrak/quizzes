/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.TestService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.TestDao;
import ma.aselharrak.quiz.dao.model.Test;

/**
 * @author SELHARRAK
 *
 */
@Service
public class TestServiceImpl extends CrudServiceImpl<Test, Long> implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	protected CrudDao<Test, Long> getDao() {
		return testDao;
	}

}
