package controler;

import org.hibernate.SessionFactory;

import model.SessionFactoryUtil;

public class Main {

	public static void main(String[] args) {

		HibernateHelper hibernateHelper = new HibernateHelper();
		System.out.println("Inserto una pregunta nueva");
		hibernateHelper.addQuestion(2, "�Cu�nto son 2 + 2?", "Matem�ticas");
	}
}
