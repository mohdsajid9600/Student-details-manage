package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.StudentDAO;
import com.entity.Student;
@WebServlet("/register")
public class ResgisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		String qualification=req.getParameter("qualification");
		String email=req.getParameter("email");
		
		Student student=new Student(name,dob,address,qualification,email);
		
		StudentDAO dao=new StudentDAO(DBConnect.MakeCon());
		
		HttpSession session = req.getSession();
		
		boolean f=dao.addStudent(student);
		//System.out.println(f);
		if(f) {
			
			session.setAttribute("successMsg", "Student Details submited Successfully..");
			resp.sendRedirect("add-students.jsp");
			//System.out.println("Data Updated ..");
		}else {
			
			session.setAttribute("errorMsg", "Something wrong on server..");
			resp.sendRedirect("add-students.jsp");
			//System.out.println("invalide...");
		}
		
	}
	
	

}
