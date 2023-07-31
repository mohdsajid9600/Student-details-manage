<%@page import="java.util.Date"%>
<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.conn.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CURD-Operation</title>
<%@include file="all-cssFiles.jsp"%>
</head>
<body class="bg-dark">
	<%@include file="navbar.jsp"%>
	
	<div class="container p-5">
		<div class="card">
			<div class="card-body">
			<p style="color: teal;">Today : Date & Time  <%= new Date().toString() %></p>
				<p class="text-center font-weight-bold" style="font-size: x-large; color: teal;">All
					Students Details</p>
				<c:if test="${not empty successMsg}">
					<p class="text-center text-success">${successMsg}</p>
					<c:remove var="successMsg" />
				</c:if>
				<c:if test="${not empty errorMsg}">
					<p class="text-center text-success">${errorMsg}</p>
					<c:remove var="errorMsg" />
				</c:if>
				<c:if test="${not empty successMsg}">
					<p class="text-center text-success">${successMsg}</p>
					<c:remove var="successMsg" />
				</c:if>
				<c:if test="${not empty errorMsg}">
					<p class="text-center text-success">${errorMsg}</p>
					<c:remove var="errorMsg" />
				</c:if>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Full Name</th>
							<th scope="col">DOB</th>
							<th scope="col">Address</th>
							<th scope="col">Qualification</th>
							<th scope="col">Email Address</th>
						</tr>
					</thead>
					<tbody>

						<%
						StudentDAO dao = new StudentDAO(DBConnect.MakeCon());
						List<Student> list = dao.getData();
						//out.print(list);
						for (Student stu : list) {
						%>


						<tr>
							<th scope="row"><%=stu.getName()%></th>
							<td><%=stu.getDod()%></td>
							<td><%=stu.getAddress()%></td>
							<td><%=stu.getQualification()%></td>
							<td><%=stu.getEmail()%></td>
						</tr>

						<%
						}
						%>



					</tbody>
				</table>
				<a href="welcome.jsp" class="btn btn-info btn-m active float-right" role="button"
					aria-pressed="true">Edit Details</a> 
					<a href="add-students.jsp" class="btn btn-info btn-m active float-left" role="button"
					aria-pressed="true">Add Details</a>
			</div>
		</div>
	</div>
</body>
</html>