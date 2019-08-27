<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="../../resources/css/styles.css" rel="stylesheet" type="text/css"/>
        <title>Saisie livre</title>
    </head>
    <body>
        <div class="container text-center">
            <h1 class="text-danger">Livre à ajouté</h1>
             <body>
                <h1>Livre ajouté</h1>
                <table class="table table-striped">
                    <tr>
                        <td>Titre</td>
                        <td>${titre}</td>
                    </tr>
                    <tr>
                        <td>Auteur</td>
                        <td>${auteur}</td>
                    </tr>
                    <tr>
                        <td>Catégories</td>
                        <hr>
                        <td>
                            <c:forEach var="cat" items="${caterories}">
                                ${cat}
                            </c:forEach>
                        </td>
                        <hr>
                    </tr>
                    <tr>
                        <td>Langue</td>
                        <td>${langue}</td>
                    </tr>
                </table>

                
  
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
