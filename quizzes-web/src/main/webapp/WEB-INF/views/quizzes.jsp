<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags" %>
<common:header/>
<body>
	<common:navigation/>
    <!-- Page Content -->
    <div class="container">
		<div class="search">
			<div class="button_box2">
				<form class="form-wrapper-2 cf">
					<input type="text" placeholder="Search here..." required>
					<button type="submit">Search</button>
				</form>
			</div>
		</div>
      <div class="row">
		<c:forEach items="${quizzes}" var="quizze">
		  <div class="col-lg-4 col-sm-6 portfolio-item">
		          <div class="card h-100">
		            <div class="card-body">
		              <h1 class="card-title">
		             	<c:url value="quizzes/quiz/${quizze.id}/${quizze.label}" var="url"/>
		                <a href="${url}"><c:out value="${quizze.label}" /></a>
		              </h1>
		              <c:out value="${quizze.description}" />
		              <p class="card-text">Lorem ipsum dolor sit amet, conseiunt, illum tempora ex quae? Nihil, dolorem!</p>
		              ${quizze.nbQuiz} Tests.
		            </div>
		          </div>
		        </div>
		</c:forEach>
      </div>
      <!-- /.row -->

      <!-- Pagination -->
      <ul class="pagination justify-content-center">
        <li class="page-item">
          <a class="page-link" href="#" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
            <span class="sr-only">Previous</span>
          </a>
        </li>
        <li class="page-item">
          <a class="page-link" href="#">1</a>
        </li>
        <li class="page-item">
          <a class="page-link" href="#">2</a>
        </li>
        <li class="page-item">
          <a class="page-link" href="#">3</a>
        </li>
        <li class="page-item">
          <a class="page-link" href="#" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
            <span class="sr-only">Next</span>
          </a>
        </li>
      </ul>

    </div>
    <!-- /.container -->
<common:footer/>