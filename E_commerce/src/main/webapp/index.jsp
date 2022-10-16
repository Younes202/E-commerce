<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
              <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name ="viewport" content = "widht-device-widht , initialesclae=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
    </head>
   	 <body>
        <div class="container">
            <h1>management of commands</h1>
            <ul class="nav nav-tabs">
                <li class="nav-item active">
                    <a class="nav-link active" data-toogle="tabs" href="#home">Command</a>
                </li>
                <li>
                    <a class="nav-link" href="menu1" data-toogle="tabs" >Clients</a>
                </li>
                <li>
                    <a class="nav-link" href="menu2" data-toogle="tabs">Activites</a>
                </li>
            </ul>
             
             <hr>
        
             <form action="" method="post">
           
			 <table class="table table-hover">
                <thead>
                       <div class="tab-content" class="tab-pane fade active show ">
                       <div id="home">
                       	 <h5> <img src="images/cont.png" id="image">Add product</h5>
                       </div>
                  <form action="" method="post">
                       
                    <tr>
  
    					<td>
                          
                              <input type="text" placeholder="name" name="name" class="form-control" >
                      </td>
                      <td>
                              <input type="text" placeholder="designation" name="desc" class="form-control" >
                      </td>
                      <td>
                              <input type="text"  placeholder="Price" name="price" class="form-control" >
                      </td>
                      <td>
                            <input type="text" placeholder="etat"  name="etat" class="form-control">
                      </td>
                      <td>
                         <button type="submit"  class="form-control" id="btnadd">Add</button>
                      </td>
  
                   
                      
                    </tr>
                    
                    
                    
          </thead>
          
    </table>
      </form>                  
    
            <hr>
            
          
                      <c:set  var="products" scope="session" value="${prb}"/>
            
	<table id="table_produit" class="table table-hover">
             <thead>
                    <th>Id</th>
                    <th>Name </th>
                    <th>Designation</th>
                    <th >Price</th>
                    <th>etat</th>
                </thead>
                
            <c:set  var="list" value="${products.getList().iterator()}"/>
        <c:forEach  items="${list }" var="li">
                        <tbody>
        
       			  <td>${li.id}</td>
       			  <td>${li.name}</td>
       			  <td>${li.desc}</td>
       			  <td>${li.price}</td>
       			  <td>${li.etat}</td>
       			                  </tbody>
       			  
       			  
        </c:forEach>
                               
                
                
                		
</table>


             
         
     
        
      
        
        </div>
       </body>
        </html>
        
        


