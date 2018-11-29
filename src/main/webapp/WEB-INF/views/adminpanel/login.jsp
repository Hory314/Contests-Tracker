<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:include page="../template/doc_header.jsp"/>--%>
<%--<c:form method="post">--%>
<%--<form:input path="login"/>--%>
<%--<form:input path="password" type="password"/>--%>
<%--<input type="submit" value="Zaloguj">--%>
<%--</c:form>--%>
<c:if test="${param.error != null}">
    <p>
        Invalid username and password.
    </p>
</c:if>
<c:if test="${param.logout != null}">
    <p>
        You have been logged out.
    </p>
</c:if>
<form method="post">
    <c:if test="${param.error != null}">
        <p>
            Invalid username and password.
        </p>
    </c:if>
    <c:if test="${param.logout != null}">
        <p>
            You have been logged out.
        </p>
    </c:if>
    <p><input type="text" id="username" name="username" placeholder="Login"></p>
    <p><input type="password" id="password" name="password" placeholder="Hasło"></p>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <p><input type="submit" value="Zaloguj"></p>
</form>
<%--<jsp:include page="../template/doc_footer.jsp"/>--%>