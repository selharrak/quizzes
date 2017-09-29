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
		  <article class="col-lg-4 col-sm-6 quiz-item">
			  <div class="additional-info">
			   	
			   	<div class="info-cards">
			   		<div class="info-card">
			   			<div class="type">
			   				<i class="fa fa-question"></i>
			   				<span class="label"> QUESTIONS</span>
			   			</div>
			   			<div class="value">
			   				${test.nbQuestion }
			   			</div>
			   		</div>
			   		
			   		<div class="info-card">
			   			<div class="type">
			   				<i class="fa fa-clock-o"></i>
			   				<span class="label"> MINUTES</span>
			   			</div>
			   			<div class="value">
			   				${test.duration }
			   			</div>
			   		</div>			   		
			   		
			   	</div>
			   	
			   	
			   	
			   	<div class="grouped-info">
			   	
		   	    	<div  class="quiz-rating">
			          <div  class="label">Rating:</div>
			          <div  class="rating readonly"><i  class="fa fa-star" data-rating="1"></i><i  class="fa fa-star" data-rating="2"></i><i  class="fa fa-star" data-rating="3"></i><i  class="fa fa-star" data-rating="4"></i><i  class="fa fa-star" data-rating="5"></i></div>
			        </div>
			   	
			   		<div class="quiz-level">
			   			<div class="label">
			   				level
			   			</div>
			   			<div class="level">
			   				<i class="bar"></i><i class="bar"></i><i class="bar"></i><i class="bar empty"></i>
			   			</div>
			   		</div>
			   	</div>
			  </div>
			  <c:url value="quizzes/quiz/start/${test.id}" var="url"/>
			  <div  class="main-info">
			  	<h1 class="card-title">
	                <a href="${url}"><c:out value="${test.label}" /></a>
              	</h1>
             <p class="description"> <c:out value="${test.description}" />
               </p>
              
              
              <div class="actions">
        <a class="btn btn-take-test" href="${url}">
          <i class="fa fa-chevron-circle-right"></i>Take the test</a>
        <a _class="btn btn-more" title="Docker quiz medium level" href="/en/quizzes/devops/docker-quiz-medium-level">
          <i  class="fa fa-chevron-circle-right"></i>Find out more</a>
      </div>
              
              
			  </div>
      		</article>
		</c:forEach>
      </section>

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
   