<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags" %>
<common:header/>
<body>
	<common:navigation/>
    
    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading -->
      <h1 class="my-4"> ${title}</h1> 
      <a href="#"> < Back to domains</a>
      <section>
		<c:forEach items="${tests}" var="test">
			<c:forEach items="${test.testQuestions}" var="queztion">
				${queztion.id} <br/>
				${queztion.question.label}<br/>
				<ul>
				<c:forEach items="${queztion.question.questionResponses}" var="reponze">
					<li>${reponze.response.label}</li>
				</c:forEach>
				</ul>
			</c:forEach>
		</c:forEach>
      </section>
    </div>
    <!-- /.container -->
<common:footer/>
   