<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<c:forEach items="${contests}" var="contest">
    <div class="contest">
        <h2><a href="<s:url value='/contest/${contest.id}/${contest.simpleTitle}'/>">${contest.title}</a></h2>
        <img src="${contest.image}">
        <p>Start: ${contest.formattedStartDate}</p>
        <p>Koniec: ${contest.formattedEndDate}</p>
        <p>${contest.shortDescription}</p>
    </div>
</c:forEach>
<jsp:include page="../template/doc_footer.jsp"/>
