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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDAO dao=new StudentDAO(DBConnect.MakeCon());
		
		HttpSession session = req.getSession();

		boolean f = dao.deleteDataById(id);
		System.out.println(f+" update servlet get f value");
		// System.out.println(f);
		if (f) {

			session.setAttribute("successMsg" , "Student Details Deleted Successfully..");
			System.out.println("Data Updated .. in if else");
			resp.sendRedirect("welcome.jsp");
			
		} else {

			session.setAttribute("errorMsg", "Something wrong on server..");
			System.out.println("invalide... in if else");
			resp.sendRedirect("welcome.jsp");
			
		}
	}

	
}
