package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.StudentDAO;
import com.entity.Student;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String qualification = req.getParameter("qualification");
		String email = req.getParameter("email");
		int id = Integer.parseInt(req.getParameter("id"));
		
		System.out.println(id+" get id edit details");
		
		Student student = new Student(id, name, dob, address, qualification, email);

		StudentDAO dao = new StudentDAO(DBConnect.MakeCon());

		HttpSession session = req.getSession();

		boolean f = dao.updateDataStudent(student);
		System.out.println(f+" update servlet get f value");
		// System.out.println(f);
		if (f) {

			session.setAttribute("successMsg" , "Student Details Updated Successfully..");
			System.out.println("Data Updated .. in if else");
			resp.sendRedirect("index.jsp");
			
		} else {

			session.setAttribute("errorMsg", "Something wrong on server..");
			System.out.println("invalide... in if else");
			resp.sendRedirect("index.jsp");
			
		}
	}

}
