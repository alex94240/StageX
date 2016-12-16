package com.stagex.factory;

import java.sql.ResultSet;

import com.stagex.bean.Apply;
import com.stagex.dao.GenericDaoImpl;

public class ApplyDaoFactory extends GenericDaoImpl<Apply>{
	
	public ResultSet salInternship(){
		
		Statement statement = connexion.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT avg(salary) FROM stagex.apply"
				+ "WHERE validate='true';");
		
		while (resultat.next()){
			int a=resultat.getInt("avg(salary)");
			System.out.println("Le salaire moyen des élèves en stage est:"+a);
		}
		resultat.close();
	}
}
