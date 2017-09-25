/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.ResponseService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.ResponseDao;
import ma.aselharrak.quiz.dao.model.Response;

/**
 * @author SELHARRAK
 *
 */
@Service
public class ResponseServiceImpl extends CrudServiceImpl<Response, Long> implements ResponseService {

	@Autowired
	private ResponseDao responseDao;

	@Override
	protected CrudDao<Response, Long> getDao() {
		return responseDao;
	}
}
