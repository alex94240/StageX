package com.stagex.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stagex.bean.Apply;
import com.stagex.bean.Company;
import com.stagex.bean.Student;
import com.stagex.dao.GenericDaoImpl;
import com.stagex.factory.ApplyDaoFactory;
import com.stagex.factory.CompanyDaoFactory;
import com.stagex.factory.StudentDaoFactory;

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
    	
    	Map<String,Object> sqlWhereMap = new HashMap<String, Object>();   
        sqlWhereMap.put("socialSecruityNum", numOfSocialSecurity);
        List<Student> stus;
        StudentDaoFactory stuFactory = new StudentDaoFactory();
        int studentId = -1;
		try {			
			stus = stuFactory.findAllByConditions(sqlWhereMap, Student.class);
			studentId = stus.get(0).getStudentId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	
    	apply.setStudentId(studentId);

    	//company information
    	String companyName = request.getParameter("companyName");
    	String siretNum = request.getParameter("siretNum");
    	String CodeAPE = request.getParameter("CodeAPE");
    	String companyAddress = request.getParameter("companyAddress");
    	String receptionName = request.getParameter("receptionName");  		
  		String companyFax = request.getParameter("companyFax");
  		String companyEmail = request.getParameter("companyEmail");
  		String companyTelephone = request.getParameter("companyTelephone");
  		
  		Company company = new Company();
  		company.setCompanyName(companyName);
  		company.setSiretNumber(siretNum);
  		company.setCodeApe(CodeAPE);
  		company.setCompanyAddress(companyAddress);
  		company.setReceptionName(receptionName);
  		company.setFax(companyFax);
  		company.setEmail(companyEmail);
  		company.setTelphone(companyTelephone);
  		CompanyDaoFactory companyFact = new CompanyDaoFactory();
  		
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
    	
    	//System.out.println(prestation);
		apply.setChargePersonContact(chargeContact);
		apply.setApplyAddress(applyAddress);
		apply.setApplyTelphone(applyPhone);
		apply.setDecription(description);
		/**/
		try {
			Locale locale = Locale.US; 
			apply.setStartDate(new Date(new SimpleDateFormat("d MMM, yyyy",locale).parse(startDate).getTime()));
			apply.setEndDate(new Date(new SimpleDateFormat("d MMM, yyyy",locale).parse(endDate).getTime()));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		apply.setSalary(Integer.parseInt(salary));
		apply.setBenefit(Integer.parseInt(benefit));
		apply.setHealthInsurance(Integer.parseInt(healthInsurance));
		apply.setWorkTrip(Integer.parseInt(workTrip));
		
		apply.setWayFindApply(wayFindApply);
		apply.setBossFirstName(bossPrenom);
		apply.setBossLastName(bossNom);
		apply.setBossEmail(bossEmail);
		apply.setBossJob(bossJob);
		apply.setBossTelphone(bossTelephone);
		apply.setBossFax(bossFax);
		apply.setCompanyPrestation(prestation);
		apply.setCompanyContast(contast);
		apply.setApplyGoal(applyGoal);
		apply.setPricipleSteps(pricipleSteps);
		apply.setApplyRequirement(applyRequirement);
		
		try {
			int companyId = companyFact.createReturnId(company);
			apply.setCompanyId(companyId);
			
			applyFactory.create(apply);
			
			
			System.out.println("crete apply succ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 response.sendRedirect("/StageX/home.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
