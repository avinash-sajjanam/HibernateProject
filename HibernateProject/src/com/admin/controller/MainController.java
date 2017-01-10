package com.admin.controller;

import org.hibernate.Session;

import com.admin.config.HibernateConfiguration;
import com.admin.pojo.Student;

public class MainController {
	public static void main(String[] args) {
		Session session=HibernateConfiguration.getSessionFactory();

		try{
			Student student=new Student();
			student.setStudentName("avinash");
			student.setStudentAddress("IA");
			session.save(student);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

}
