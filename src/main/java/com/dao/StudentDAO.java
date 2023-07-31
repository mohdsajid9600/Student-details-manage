package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDAO {

	private Connection conn;

	public StudentDAO(Connection conn) {
		super();
		this.conn = conn;
		
		System.out.println(this.conn+"  Connection is Created.......");
	}

	public boolean addStudent(Student student) {

		boolean f = false;

		try {
			String q = "insert into student_table(name,dob,address,qualification,email) values(?,?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(q);

			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getDod());
			pstmt.setString(3, student.getAddress());
			pstmt.setString(4, student.getQualification());
			pstmt.setString(5, student.getEmail());
			
//			System.out.println(student.getName());
//			System.out.println(student.getDod());
//			System.out.println(student.getAddress());
//			System.out.println(student.getQualification());
//			System.out.println(student.getEmail());
			
		
			int count = pstmt.executeUpdate();
			//System.out.println(count);
			
			
			if (count == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Student> getData() {

		Student stu = null;
		List<Student> list = new ArrayList<Student>();
		try {
			

			String query = "select*from student_table";

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setDod(rs.getString(3));
				stu.setAddress(rs.getString(4));
				stu.setQualification(rs.getString(5));
				stu.setEmail(rs.getString(6));

				list.add(stu);
				// System.out.println(list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Student getStudentById(int Id) {

		Student stu = null;
		
		try {
			

			String query = "select*from student_table where id=?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Id);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setDod(rs.getString(3));
				stu.setAddress(rs.getString(4));
				stu.setQualification(rs.getString(5));
				stu.setEmail(rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stu;
	}

	
	
	public boolean updateDataStudent(Student student) {

		boolean f = false;

		try {
			String q = "update student_table set name=?,dob=?,address=?,qualification=?,email=? where id=?";

			PreparedStatement pstmt = conn.prepareStatement(q);

			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getDod());
			pstmt.setString(3, student.getAddress());
			pstmt.setString(4, student.getQualification());
			pstmt.setString(5, student.getEmail());
			pstmt.setInt(6, student.getId());
			
		
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
			
			if (count == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	
	public boolean deleteDataById(int id) {

		boolean f = false;

		try {
			String q = "delete from student_table where id=?";

			PreparedStatement pstmt = conn.prepareStatement(q);
			
			pstmt.setInt(1, id);
		
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
			
			if (count == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
}






