<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
        <title>Saisie livre</title>
    </head>
    <body>
        <div class="container text-center">
            <h1 class="text-danger">Livre à ajouté</h1>
            <img class="form-img" src="${pageContext.request.contextPath}/resources/img/2.jpg">
            <form:form method="POST" action="ajoutLivre">
                <div class="form-group">
                    <form:label path="titre">Titre</form:label>
                    <form:input path="titre" cssClass="form-control" type="text"></form:input>
                </div>
                
                  <div class="form-group">
                    <form:label path="auteur">Auteur</form:label>
                    <form:input path="auteur" class="form-control" type="text"></form:input>
                </div>
                
                 <div class="form-group form-check">  
                 <form:label path="categories">Categories</form:label>
                 <form:checkboxes path="categories" items="${categorieList}" itemValue="categorieId" itemLabel="categorieNom" />
                 </div>
                
                  <div class="form-group">
                      <form:label path="langue">Langue</form:label>
                    <form:select path="langue">                          
                        <form:options items="${langueList}" itemValue="langueId" itemLabel="langueNom"></form:options>
                    </form:select> 
                </div>
                    <input type="submit" class="btn btn-warning" value="Submit">
            </form:form>
                
  
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
