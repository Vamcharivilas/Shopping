package shopping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import shopping.dto.Payment;

public class PaymentCrud {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vamc");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public Payment save(Payment p) {
		et.begin();
		p=em.merge(p);
		et.commit();
		return p;
	}

}
