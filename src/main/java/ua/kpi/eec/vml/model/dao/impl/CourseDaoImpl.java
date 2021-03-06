package ua.kpi.eec.vml.model.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.kpi.eec.vml.model.dao.CourseDao;
import ua.kpi.eec.vml.model.entity.Course;

@Repository
public class CourseDaoImpl extends AbstractHibernateDao<Course> implements CourseDao {

	@Override
	public Class<?> getEntityClass() {
		return Course.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Course> findAll() {
		return getSessionFactory().getCurrentSession().createQuery("from Course order by id").list();
	}

}
