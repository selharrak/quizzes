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

.search {
  padding-top: 4rem;
  padding-bottom: 4rem;
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

<!--  
    <section class="jumbotron text-center">
      <div class="container">
        <h1 class="jumbotron-heading text-white">Quizzes</h1>
        <img height="150" src="http://www.ekodefi.com/wp-content/themes/ekodefi-v2/media/img/icon-nav-challenges-health-fr.png"/>
        <p class="lead text-white">Test yourself everyday and exam your knowledge to keep your up to date it's free !</p>
        <p>
          <a href="#" class="btn btn-primary">Main call to action</a>
          <a href="#" class="btn btn-secondary">Secondary action</a>
        </p>
      </div>
    </section>
 -->   
    
    
    <!-- Page Content -->
    <div class="container">
 
 
<style>
/* search box */

.button_box2 {
}
/*-------------------------------------*/
.cf:before, .cf:after{
content:"";
display:table;
}
.cf:after{
clear:both;
}
.cf{
zoom:1;
}
/*-------------------------------------*/

.form-wrapper-2 {
width: 100%;
padding: 15px;
background: #555;
-moz-border-radius: 10px;
-webkit-border-radius: 10px;
border-radius: 10px;
-moz-box-shadow: 0 1px 1px rgba(0,0,0,.4) inset, 0 1px 0 rgba(255,255,255,.2);
-webkit-box-shadow: 0 1px 1px rgba(0,0,0,.4) inset, 0 1px 0 rgba(255,255,255,.2);
box-shadow: 0 1px 1px rgba(0,0,0,.4) inset, 0 1px 0 rgba(255,255,255,.2);
}
.form-wrapper-2 input {
width: 89%;
padding: 12px 10px;
float: left;
font: bold 15px 'Raleway', sans-serif;
border: 0;
background: #eee;
-moz-border-radius: 3px 0 0 3px;
-webkit-border-radius: 3px 0 0 3px;
border-radius: 3px 0 0 3px;
}
.form-wrapper-2 input:focus {
outline: 0;
background: #fff;
-moz-box-shadow: 0 0 2px rgba(0,0,0,.8) inset;
-webkit-box-shadow: 0 0 2px rgba(0,0,0,.8) inset;
box-shadow: 0 0 2px rgba(0,0,0,.8) inset;
}
.form-wrapper-2 input::-webkit-input-placeholder {
color: #999;
font-weight: normal;
font-style: italic;
}
.form-wrapper-2 input:-moz-placeholder {
color: #999;
font-weight: normal;
font-style: italic;
}
.form-wrapper-2 input:-ms-input-placeholder {
color: #999;
font-weight: normal;
font-style: italic;
}
.form-wrapper-2 button {
overflow: visible;
position: relative;
float: right;
border: 0;
padding: 0;
cursor: pointer;
height: 40px;
width: 110px;
font: bold 15px/40px 'Raleway', sans-serif;
color: #fff;
text-transform: uppercase;
background: #D88F3C;
-moz-border-radius: 0 3px 3px 0;
-webkit-border-radius: 0 3px 3px 0;
border-radius: 0 3px 3px 0;
text-shadow: 0 -1px 0 rgba(0, 0 ,0, .3);
}
.form-wrapper-2 button:hover{
background: #FA8807;
}
.form-wrapper-2 button:active,
.form-wrapper-2 button:focus{
background: #c42f2f;
}
.form-wrapper-2 button:before {
content: '';
position: absolute;
border-width: 8px 8px 8px 0;
border-style: solid solid solid none;
border-color: transparent #D88F3C transparent;
top: 12px;
left: -6px;
}
.form-wrapper-2 button:hover:before{
border-right-color: #FA8807;
}
.form-wrapper-2 button:focus:before{
border-right-color: #c42f2f;
}
.form-wrapper-2 button::-moz-focus-inner {
border: 0;
padding: 0;
}
</style>
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
		              <h4 class="card-title">
		             	<c:url value="quiz/${quizze.id}/${quizze.label}" var="url"/>
		                <a href="${url}"><c:out value="${quizze.label}" /></a>
		              </h4>
		              <c:out value="${quizze.description}" />
		              <p class="card-text">Lorem ipsum dolor sit amet, conseiunt, illum tempora ex quae? Nihil, dolorem!</p>
		              
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

    <!-- Footer -->
    <footer class="py-5 bg-dark fixed-bottom">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; @quizzes 2017</p>
      </div>
      <!-- /.container -->
    </footer>


  </body>

</html>