package controler;

import java.util.HashSet;

import model.Answer;
import model.Question;
import model.SessionFactoryUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateHelper {
	private SessionFactory sesion;

	public HibernateHelper() {
		sesion = SessionFactoryUtil.getSessionFactory();

	}

	public void addQuestion(int i, String text, String category) {
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		Question question = new Question(i, text, category,
				new HashSet<Answer>(0));
		session.save(question);
		tx.commit();
		session.close();
	}
}
