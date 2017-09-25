/**
 * 
 */
package ma.aselharrak.quiz.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.aselharrak.quiz.core.service.LevelService;
import ma.aselharrak.quiz.dao.CrudDao;
import ma.aselharrak.quiz.dao.LevelDao;
import ma.aselharrak.quiz.dao.model.Level;

/**
 * @author SQLI-SELHARAK
 *
 */
@Service
public class LevelServiceImpl extends CrudServiceImpl<Level, Long> implements LevelService {

	@Autowired
	private LevelDao levelDAo;

	@Override
	protected CrudDao<Level, Long> getDao() {
		return levelDAo;
	}

}
