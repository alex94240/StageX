package com.stagex.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stagex.bean.Apply;
import com.stagex.factory.ApplyDaoFactory;

/**
 * Servlet implementation class ApplyServlet
 */
@WebServlet("/ApplyServlet")
public class ApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ApplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Apply apply = new Apply();
		ApplyDaoFactory applyFactory = new ApplyDaoFactory();
		
		//person information
		String group = request.getParameter("group");
  		String nom = request.getParameter("nom");
  		String prenom = request.getParameter("prenom");
    	String numOfSocialSecurity = request.getParameter("numOfSocialSecurity");
    	String parcours = request.getParameter("parcours");
    	String personAddress = request.getParameter("personAddress");
    	String personEmail = request.getParameter("personEmail");
    	String personTelephone = request.getParameter("personTelephone");
    	
    	//company information
    	String companyName = request.getParameter("companyName");
    	String siretNum = request.getParameter("siretNum");
    	String CodeAPE = request.getParameter("CodeAPE");
    	String companyAddress = request.getParameter("companyAddress");
    	String receptionName = request.getParameter("receptionName");  		
  		String companyFax = request.getParameter("companyFax");
  		String companyEmail = request.getParameter("companyEmail");
  		String companyTelephone = request.getParameter("companyTelephone");	
  		
  		//apply information
    	String chargeContact = request.getParameter("chargeContact");
  		String applyAddress = request.getParameter("applyAddress");
    	String applyPhone = request.getParameter("applyPhone");    	
    	
    	String description = request.getParameter("description");
    	String startDate = request.getParameter("startDate");
    	String endDate = request.getParameter("endDate");
    	String salary = request.getParameter("salary");
    	String benefit = request.getParameter("benefit");
    	String healthInsurance = request.getParameter("healthInsurance");
    	String workTrip = request.getParameter("workTrip");
    	String wayFindApply = request.getParameter("wayFindApply");
    	
    	String bossNom = request.getParameter("bossNom");
    	String bossPrenom = request.getParameter("bossPrenom");
  		String bossEmail = request.getParameter("bossEmail");
  		String bossJob = request.getParameter("bossJob");
    	String bossTelephone = request.getParameter("bossTelephone");
    	String bossFax = request.getParameter("bossFax");

    	String prestation = request.getParameter("prestation");
    	String contast = request.getParameter("contast");
    	String applyGoal = request.getParameter("applyGoal");
    	String pricipleSteps = request.getParameter("pricipleSteps");
    	String applyRequirement = request.getParameter("applyRequirement");
			
		/*
		try {
			applyFactory.create(apply);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
