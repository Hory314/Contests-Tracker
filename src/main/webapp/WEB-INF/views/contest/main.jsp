<%@ page import="pl.mhordyjewicz.service.Utils" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<%--<c:forEach items="${contests}" var="contest">--%>
<%--<div class="contest">--%>
<%--<h2><a href="<s:url value='/contest/${contest.id}/${contest.simpleTitle}'/>">${contest.title}</a></h2>--%>
<%--<img src="${contest.image}">--%>
<%--<p>Start: ${contest.formattedStartDate}</p>--%>
<%--<p>Koniec: ${contest.formattedEndDate}</p>--%>
<%--<p>${contest.shortDescription}</p>--%>
<%--</div>--%>
<%--</c:forEach>--%>

<!-- main -->

<main role="main-home-wrapper" class="container">


    <div class="row">


        <section class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">

            <article role="pge-title-content">

                <header>

                    <h2><span>Konkursy</span> dla Ciebie!</h2>

                </header>

                <p>Śleź konkursy razem z nami i daj sobie szansę na wygraną!</p>

            </article>

        </section>


        <section class="col-xs-12 col-sm-6 col-md-6 col-lg-6 grid">

            <figure class="effect-oscar" style="background-color: <%=Utils.randomColor()%>">

                <img src="/images/gift-main-big.jpeg" alt="" class="img-responsive"/>
                <%--<img src="/images/home-images/image-1.jpg" alt="" class="img-responsive"/>--%>

                <figcaption>

                    <h2>Dodaj nowy <span>konkurs</span></h2>

                    <p>Daj znać innym o konkursie!</p>

                    <a href="/add">Dodaj nowy konkurs</a>

                </figcaption>

            </figure>

        </section>


        <div class="clearfix"></div>


        <section class="col-xs-12 col-sm-6 col-md-6 col-lg-6 grid">

            <ul class="grid-lod effect-2" id="grid">
                <%--<c:forEach items="${contests}" var="contest">--%>
                <c:forEach begin="0" step="2" items="${contests}" var="contest">

                    <li>
                            <%--<h2 class="c-title">${contest.title}</h2>--%>
                        <figure class="effect-oscar" style="background-color: <%=Utils.randomColor()%>">

                            <img src="${contest.image}" alt="${contest.title}" class="img-responsive"/>

                            <figcaption>


                                    <%--<h2 style="background-color: red;">${contest.title}</h2>--%>

                                <p>
                                    <span class="contest-title">${contest.title}</span>
                                        ${contest.shortDescription}
                                </p>

                                <a href="<s:url value='/contest/${contest.id}/${contest.simpleTitle}'/>">${contest.title}</a>


                            </figcaption>

                        </figure>

                    </li>
                </c:forEach>

            </ul>

        </section>

        <%-- 2nd section --%>
        <section class="col-xs-12 col-sm-6 col-md-6 col-lg-6 grid">

            <ul class="grid-lod effect-2" id="grid">
                <%--<c:forEach items="${contests}" var="contest">--%>
                <c:forEach begin="1" step="2" items="${contests}" var="contest">

                    <li>
                            <%--<h2 class="c-title">${contest.title}</h2>--%>
                        <figure class="effect-oscar" style="background-color: <%=Utils.randomColor()%>">

                            <img src="${contest.image}" alt="${contest.title}" class="img-responsive"/>

                            <figcaption>


                                    <%--<h2 style="background-color: red;">${contest.title}</h2>--%>

                                <p>
                                    <span class="contest-title">${contest.title}</span>
                                        ${contest.shortDescription}
                                </p>

                                <a href="<s:url value='/contest/${contest.id}/${contest.simpleTitle}'/>">${contest.title}</a>


                            </figcaption>

                        </figure>

                    </li>
                </c:forEach>

            </ul>

        </section>

        <div class="clearfix"></div>

    </div>

</main>

<!-- main -->
<jsp:include page="../template/doc_footer.jsp"/>