<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<!-- main -->

<main role="main-inner-wrapper" class="container">


    <div class="row">


        <section class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">

            <article role="pge-title-content">

                <header style="padding: 0;">

                    <h2>${contest.title}</h2>

                </header>
                <a href="<c:url value="${contest.image}"/>">
                    <img src="<c:url value="${contest.image}"/>" width="500" style="display: inline-block;">
                </a>
            </article>

        </section>


        <section class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

            <article class="about-content">
                <h4>Czas trwania konkursu:</h4>
                <p>${contest.formattedStartDate} - ${contest.formattedEndDate}</p>

                <h4>Opis:</h4>
                <p>${contest.description}</p>

                <h4>Do wygrania:</h4>
                <p>${contest.rewardDescription}</p>

                <span>Organizator: ${contest.organizer}</span><br>
                <span><a href="<c:url value="${contest.contestLink}"/>">Strona konkursu</a></span><br>
                <span><a href="<c:url value="${contest.rulesLink}"/>">Regulamin konkursu</a></span><br>

                <hr>
                <span>Kategoria: ${contest.category.name}</span>

                <hr>
                <span>Tagi:
                <c:forEach items="${contest.tags}" var="tag">
                    ${tag.name}
                </c:forEach>
                </span>

                <hr>
                <span>Rodzaje nagród:
                <c:forEach items="${contest.rewardTypes}" var="rewardType">
                    ${rewardType.name}
                </c:forEach>
                </span>

            </article>

        </section>


    </div>

    <!-- thumbnails -->


    </div>

</main>

<!-- main -->


<%--<div class="contest-details">--%>
<%--<h2>${contest.title}</h2>--%>
<%--<img src="${contest.image}" width="500" style="display: inline-block;">--%>
<%--<article>--%>
<%--<p>Start: ${contest.formattedStartDate}</p>--%>
<%--<p>Koniec: ${contest.formattedEndDate}</p>--%>
<%--<p>${contest.shortDescription}</p>--%>
<%--</article>--%>
<%--</div>--%>
<jsp:include page="../template/doc_footer.jsp"/>
