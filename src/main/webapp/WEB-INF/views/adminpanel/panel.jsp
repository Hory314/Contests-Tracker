<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<h1>Panel Admina</h1>

<c:forEach items="${contests}" var="contest">
    <hr>
    <div style="border: 1px solid black;">
        <table border="1" id="contest-${contest.id}">
            <tr>
                <td>ID</td>
                <td>
                        ${contest.id}<br>
                    <a href="/adminpanel/delete/${contest.id}">Usuń</a><br>
                    <a href="/adminpanel/edit/${contest.id}">Edytuj</a>
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                        ${contest.email}<br>
                    <a href="<s:url value='/adminpanel/request-edit/${contest.id}'/>">Poproś o edycję</a>
                    <br><a href="/contest/edit?hash=${contest.editHash}">User edit link</a>
                </td>
            </tr>
            <tr>
                <td>Zaakceptowany</td>
                <td style="background-color:
                <c:if test='${contest.accepted}'>#53CE08</c:if>
                <c:if test='${not contest.accepted}'>#E21F22</c:if>;">
                    <a href="<s:url value='/adminpanel/toggle/${contest.id}'/>">Przełącz</a>
                </td>
            </tr>
            <tr>
                <td>Plakat</td>
                <td>
                    <a target="_blank" href="<s:url value='${contest.image}'/>">
                        <img width="200" src="${contest.image}">
                    </a>
                </td>
            </tr>
            <tr>
                <td>Data rozpoczęcia</td>
                <td>${contest.startDate}</td>
            </tr>
            <tr>
                <td>Data zakończenia</td>
                <td>${contest.endDate}</td>
            </tr>
            <tr>
                <td>Tytuł</td>
                <td>${contest.title}</td>
            </tr>

            <tr>
                <td>Krótki opis</td>
                <td>${contest.shortDescription}</td>
            </tr>
            <tr>
                <td>Długi opis</td>
                <td>${contest.description}</td>
            </tr>
            <tr>
                <td>Opis nagrody</td>
                <td>${contest.rewardDescription}</td>
            </tr>
            <tr>
                <td>Organizator</td>
                <td>${contest.organizer}</td>
            </tr>
            <tr>
                <td>Link do konkursu</td>
                <td>${contest.contestLink}</td>
            </tr>
            <tr>
                <td>Link do regulaminu</td>
                <td>${contest.rulesLink}</td>
            </tr>
            <tr>
                <td>Kategoria</td>
                <td>
                        ${contest.category.name}
                </td>
            </tr>
            <tr>
                <td>Tagi</td>
                <td>
                    <c:forEach items="${contest.tags}" var="tag"> <%-- fixme --%>
                        ${tag.name}
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td>Rodzaj nagrody</td>
                <td>
                    <c:forEach items="${contest.rewardTypes}" var="rewardType"> <%-- fixme --%>
                        ${rewardType.name}
                    </c:forEach>
                </td>
            </tr>
        </table>
    </div>
</c:forEach>
<jsp:include page="../template/doc_footer.jsp"/>