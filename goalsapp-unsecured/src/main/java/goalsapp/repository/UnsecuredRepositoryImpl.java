package goalsapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UnsecuredRepositoryImpl implements UnsecuredRepository {

	@PersistenceContext
    private EntityManager em;
	
	@Override
	public boolean isUserExisting(String username, String password) {
		Query query = em.createNativeQuery("select * from user where username='"+username+"' and password='"+password+"'");
		return CollectionUtils.isNotEmpty(query.getResultList());
	}

}
