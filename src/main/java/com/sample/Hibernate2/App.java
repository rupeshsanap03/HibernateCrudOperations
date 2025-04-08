
package com.sample.Hibernate2;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();

		try {
			Student s1 = new Student();
			s1.setId(4);
			s1.setName("Kartik");

			session.save(s1);
			session.flush();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
//	private static void rusticateStudent(Session session, int id) { // TODO
//		  Auto-generated method stub Transaction transaction = null;
//		  
//		  try { transaction = session.beginTransaction(); Student s = (Student)
//		  session.get(Student.class, id); if (s != null) { session.delete(s);
//		  transaction.commit(); System.out.println("subject deleted ........."); } else
//		  { System.out.println("Student does not exist"); }
//		  
//		  } catch (Exception e) { transaction.rollback(); e.printStackTrace(); } }
//
//	private static void updateSubject(Session session, int id, String newSubject) { // TODO Auto-generated method stub
//																					// // Transaction transaction =
//																					// null;
//
//		try {
//			transaction = session.beginTransaction();
//			Student s = (Student) session.get(Student.class, id);
//			s.setSubject(newSubject);
//			session.update(s);
//			;
//
//			transaction.commit();
//			System.out.println("subject updated .........");
//
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}
//	}
//
//	private static void saveStudent(Session session, Student student) { // TODO
//		  Auto-generated method stub Transaction transaction = null;
//		  
//		  try { transaction = session.beginTransaction(); session.save(student);
//		  transaction.commit(); } catch (Exception e) { transaction.rollback();
//		  e.printStackTrace(); }
//		  
//		  }
