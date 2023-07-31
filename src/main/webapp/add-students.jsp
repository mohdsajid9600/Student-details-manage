<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
						<p class="font-weight-bold fs-4 text-center" style="font-size:larger; color: teal;">Add Student Details</p>

						<c:if test="${not empty successMsg}">
						<p class="text-center text-success">${successMsg}</p>
						<c:remove var="successMsg"/>
						</c:if>
						<c:if test="${not empty errorMsg}">
						<p class="text-center text-success">${errorMsg}</p>
						<c:remove var="errorMsg"/>
						</c:if>
						
						<form action="register" method="post">
							<div class="mb-3">
								<label class="form-label">Full Name</label><input type="text"
									name="name" class="form-control" placeholder="Enter Full Name" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Date of Birth</label><input
									type="date" name="dob" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Address</label><input type="text"
									name="address" class="form-control" placeholder="Enter Your Address" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Qualification</label><input
									type="text" name="qualification" class="form-control" placeholder="Enter Your Qualification" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Email Address</label><input
									type="email" name="email" class="form-control" placeholder="Enter Your Email" required>
							</div>
							<button type="submit" class="btn btn-primary btn-block btn-lg">Submit</button>
							<button type="reset" class="btn btn-secondary btn-block btn-lg">Reset</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>