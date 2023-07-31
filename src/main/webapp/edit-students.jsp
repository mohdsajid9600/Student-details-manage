<%@page import="com.entity.Student"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all-cssFiles.jsp"%>
</head>
<body class="bg-dark">

	<%@include file="navbar.jsp"%>
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="font-weight-bold fs-4 text-center" style="font-size:larger; color: teal;">Edit Student Details</p>
					
						<%
						int id = Integer.parseInt(request.getParameter("id"));
						StudentDAO dao = new StudentDAO(DBConnect.MakeCon());
						Student s = dao.getStudentById(id);
						%>
						<form action="update" method="post">
							<div class="mb-3">
								<label class="form-label">Full Name</label><input type="text"
									value="<%=s.getName()%>" name="name" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Date of Birth</label><input
									type="date" value="<%=s.getDod()%>" name="dob"
									class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Address</label><input type="text"
									value="<%=s.getAddress()%>" name="address" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Qualification</label><input
									type="text" name="qualification"
									value="<%=s.getQualification()%>" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Email Address</label><input
									type="email" value="<%=s.getEmail()%>" name="email"
									class="form-control" required> <input type="hidden" value="<%=s.getId()%>" name="id" class="form-control">
							</div>
							<button type="submit" class="btn btn-primary btn-lg btn-block">Update</button>
							
						</form> <br>
						<a href="welcome.jsp"><button type="button" class="btn btn-secondary btn-lg btn-block">Cancel</button></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>