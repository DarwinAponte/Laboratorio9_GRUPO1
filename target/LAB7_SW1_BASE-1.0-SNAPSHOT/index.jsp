<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <!--Colocar como value: nombre de la presente página -->
    <jsp:include page="/static/head.jsp">
        <jsp:param name="title" value="Bienvenido"/>
    </jsp:include>
    <body>
        <div class='container'>
            <!--Colocar como value: artistas, canciones, bandas, tours o tpc  (dependiendo de la pagina a la que corresponda) -->
            <jsp:include page="/includes/navbar.jsp">
                <jsp:param name="page" value=""/>
            </jsp:include>
            <div class="pb-5 pt-4 px-3 titlecolor d-flex justify-content-between align-items-center">
                <div class="col-lg-6">
                    <h1 class='text-light'>
                        Experiencias de intercambio estudiantil

                    </h1>
                </div>
            </div>
            <img src="https://i1.wp.com/codigoespagueti.com/wp-content/uploads/2018/10/mit-universidad.jpg?resize=1080%2C608&quality=80&ssl=1">
            <div class="tabla">
                <div class="row tm-row" style="padding-top: 100px">
                    <article class="col-12 col-md-6 tm-post">
                        <hr class="tm-hr-primary">
                        <a class="effect-lily tm-post-link tm-pt-60">
                            <center>                 <h2 class="tm-pt-30 tm-color-primary tm-post-title" style="color: darkgrey">PUCP</h2>
                            </center>
                        </a>
                        <p class="tm-pt-30" style="color: white">
                            Es una larga lista en la que entraron 1.000 universidades a la clasificación. Sin embargo, la tabla que observarás a continuación incluye solo las 500 mejores, dentro de las cuales se encuentran 88 universidades latinoamericanas. A continuación tienes nuestro ranking con las universidades, su país y puesto ocupado.                        </p>
                        </p>

                        <hr>
                        <div   >
                            <div style="float: left">
                                <a class="btn btn-primary" href="index.html" style="margin-left: 80px; margin-top: 30px; background-color: green" >VER MAS</a>
                            </div>

                        </div>

                    </article>
                    <article class="col-12 col-md-6 tm-post">
                        <hr class="tm-hr-primary">
                        <a class="effect-lily tm-post-link tm-pt-60">
                            <center>                 <h2 class="tm-pt-30 tm-color-primary tm-post-title" style="color: darkgrey">MIT</h2>
                            </center>
                        </a>
                        <p class="tm-pt-30" style="color: white">
                            Es una larga lista en la que entraron 1.000 universidades a la clasificación. Sin embargo, la tabla que observarás a continuación incluye solo las 500 mejores, dentro de las cuales se encuentran 88 universidades latinoamericanas. A continuación tienes nuestro ranking con las universidades, su país y puesto ocupado.                        </p>
                        </p>

                        <hr>
                        <div   >
                            <div style="float: left">
                                <a class="btn btn-primary" href="index.html" style="margin-left: 80px; margin-top: 30px; background-color: green" >VER MAS</a>
                            </div>

                        </div>

                    </article>
                    <article class="col-12 col-md-6 tm-post">
                        <hr class="tm-hr-primary">
                        <a class="effect-lily tm-post-link tm-pt-60">
                            <center>                 <h2 class="tm-pt-30 tm-color-primary tm-post-title" style="color: darkgrey">Harvard University</h2>
                            </center>
                        </a>
                        <p class="tm-pt-30" style="color: white">
                            Es una larga lista en la que entraron 1.000 universidades a la clasificación. Sin embargo, la tabla que observarás a continuación incluye solo las 500 mejores, dentro de las cuales se encuentran 88 universidades latinoamericanas. A continuación tienes nuestro ranking con las universidades, su país y puesto ocupado.                        </p>
                        </p>

                        <hr>
                        <div   >
                            <div style="float: left">
                                <a class="btn btn-primary" href="index.html" style="margin-left: 80px; margin-top: 30px; background-color: green" >VER MAS</a>
                            </div>

                        </div>

                    </article>
                    <article class="col-12 col-md-6 tm-post">
                        <hr class="tm-hr-primary">
                        <a class="effect-lily tm-post-link tm-pt-60">
                            <center>                 <h2 class="tm-pt-30 tm-color-primary tm-post-title" style="color: darkgrey">UPV</h2>
                            </center>
                        </a>
                        <p class="tm-pt-30" style="color: white">
                            Es una larga lista en la que entraron 1.000 universidades a la clasificación. Sin embargo, la tabla que observarás a continuación incluye solo las 500 mejores, dentro de las cuales se encuentran 88 universidades latinoamericanas. A continuación tienes nuestro ranking con las universidades, su país y puesto ocupado.                        </p>
                        </p>

                        <hr>
                        <div   >
                            <div style="float: left">
                                <a class="btn btn-primary" href="index.html" style="margin-left: 80px; margin-top: 30px; background-color: green" >VER MAS</a>
                            </div>

                        </div>

                    </article>







                </div>

            </div>
        </div>
        <jsp:include page="/static/scripts.jsp"/>
    </body>
</html>
