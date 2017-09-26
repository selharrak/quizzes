<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>3 Col Portfolio - Start Bootstrap Template</title>
	<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-3-col-portfolio/vendor/bootstrap/css/bootstrap.min.css">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<style>

body {
    padding-top: 54px;
}

@media (min-width: 992px) {
    body {
        padding-top: 56px;
    }
}

.portfolio-item {
    margin-bottom: 30px;
}

.pagination {
    margin-bottom: 30px;
}
.jumbotron {
  padding-top: 6rem;
  padding-bottom: 6rem;
  margin-bottom: 0;
  /*background-color: #fff;*/
  background: url("https://www.govloop.com/wp-content/uploads/2017/03/iStock-492045720-e1489770327921.jpg") no-repeat center center fixed transparent;
  background-size: cover;
  
  
}

.jumbotron p:last-child {
  margin-bottom: 0;
}

.jumbotron-heading {
  font-weight: 300;
}

.jumbotron .container {
  max-width: 40rem;
}





.quiz-item{
    max-width: none;
    margin-right: auto;
    margin-left: auto;
    display: flex;
    flex-flow: row wrap;
    border: 5px solid #f8bd32;
    background-color: #f8bd32;
    box-sizing: border-box;
}
.additional-info {
    flex: 0 0 auto;
    padding-right: 2.5rem;
    padding-left: 2.5rem;
    width: 300px;
        background-color: #fff;
            padding: 40px;
    padding: 2.5rem;
    }
    
    
    .info-cards{
    -webkit-transform: translateX(-50%);
    -moz-transform: translateX(-50%);
    -o-transform: translateX(-50%);
    -ms-transform: translateX(-50%);
    transform: translateX(-50%);
    position: relative;
    left: 50%;
        margin-bottom: 25px;
    margin-bottom: 1.5625rem;
    display: inline-block;}
    
    .info-card{
        margin-right: 15px;
    margin-right: .9375rem;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 5px;
    background-color: #4d5755;
    border: 2px solid #4d5755;
    text-align: center;
    min-width: 90px;
    width: auto;
    display: inline-block;}
    
    
.type {
    font-size: 11px;
    font-size: .6875rem;
    text-transform: uppercase;
    display: block;
    font-weight: 700;
    padding: 10px;
    padding: .625rem;
    color: #fff;
}


    .value{
        font-size: 26px;
    font-size: 1.625rem;
    background-color: #fff;
    font-weight: 700;
    }
    
    
    .fa{
        font-size: 30px;
    font-size: 1.875rem;
    margin-bottom: 5px;
    margin-bottom: .3125rem;
    color: #f8bd32;
        display: inline-block;
    font: normal normal normal 14px/1 FontAwesome;
    font-size: inherit;
    text-rendering: auto;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    }
</style>
  </head>
  
  <body>





    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Services</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    
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
			   		<div class="quiz-level">
			   			<div class="label">
			   				${test.duration } medium level
			   			</div>
			   			<div class="level">
			   				<i class="bar"></i><i class="bar"></i><i class="bar"></i><i class="bar empty"></i>
			   			</div>
			   		</div>
			   	</div>
			  </div>
			  
			  <div  class="main-info">
			  	<h4 class="card-title">
	             	<c:url value="quiz/${test.id}" var="url"/>
	                <a href="${url}"><c:out value="${test.label}" /></a>
              	</h4>
              <c:out value="${test.description}" />
              <p class="card-text"> ---</p>
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

    <!-- Footer -->
    <footer class="py-5 bg-dark fixed-bottom">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; @quizzes 2017</p>
      </div>
      <!-- /.container -->
    </footer>


  </body>

</html>