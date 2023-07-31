<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all-cssFiles.jsp"%>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-info">
		<!-- Image and text -->
			<a class="navbar-brand" href="#"> <!-- <img
				src="C:\Users\hp\Desktop\SajidFolder\Passport_Size_Photos\logo s.jpg" width="30"
				height="30" class="d-inline-block align-top" alt=""> --> S.H.M
			</a>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp"><button class="btn btn-info btn-sm">Home
							Page</button> <span class="sr-only">(current)</span> </a></li>
				<li class="nav-item active"><a class="nav-link"
					href="welcome.jsp"><button class="btn btn-info btn-sm">Edit
							Students Details</button> <span class="sr-only">(current)</span> </a></li>
				<li class="nav-item active"><a class="nav-link"
					href="add-students.jsp"><button class="btn btn-info btn-sm">Add
							Students Details</button></a></li>

			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn  btn-outline-light my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
</body>
</html>