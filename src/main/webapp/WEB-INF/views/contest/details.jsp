<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<div class="contest-details">
    <h2>${contest.title}</h2>
    <img src="${contest.image}">
    <p>Start: ${contest.formattedStartDate}</p>
    <p>Koniec: ${contest.formattedEndDate}</p>
    <p>${contest.shortDescription}</p>
</div>
<jsp:include page="../template/doc_footer.jsp"/>
