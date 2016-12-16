package com.stagex.factory;

import java.sql.ResultSet;

import com.stagex.bean.StudentExperience;
import com.stagex.dao.GenericDaoImpl;

public class StudentExperienceDaoFactory extends GenericDaoImpl<StudentExperience> {

	
public ResultSet salJob(){
		
		Statement statement = connexion.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT avg(salary) FROM stagex.experience");
		
		while (resultat.next()){
			int a=resultat.getInt("avg(salary)");
			System.out.println("Le salaire moyen des élèves employés est:"+a);
		}
		resultat.close();
	}
}
