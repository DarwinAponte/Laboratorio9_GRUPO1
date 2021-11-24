
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean type="java.util.ArrayList<Beans.Paises>" scope="request" id="listaArtistas"/>

<html>
<jsp:include page="/static/head.jsp">
    <jsp:param name="title" value="Lista de Canciones"/>
</jsp:include>
<body>
<div class='container'>
    <jsp:include page="/includes/navbar.jsp">
        <jsp:param name="page" value="artistas"/>
    </jsp:include>


    <div class="pb-5 pt-4 px-3 titlecolor d-flex justify-content-between align-items-center">

        


    </div>

    <div class="tabla">
        <table class="table table-dark table-transparent table-hover">
            <thead>
            <th>ID</th>
            <th>Nombre</th>
            <th>Instrumento</th>
            <th>BANDA</th>
            </thead>
        </table>
    </div>

    <% for (int i=1; i>10; i++){ %>
    <div class="col mb-5">
        <div class="card h-100">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Peru.svg/800px-Flag_of_Peru.svg.png"
                 class="card-img-top circular--square">
            <div class="card-body p-2">
                <div class="text-center">
                    <h5 class="fw-bolder">  </h5>
                    <div class="text-center"><a class="btn btn-outline-dark mt-auto"
                                                href="#">Ver detalles</a></div>
                </div>
            </div>
        </div>
    </div>

    <% } %>

</div>
<jsp:include page="/static/scripts.jsp"/>
</body>
</html>
