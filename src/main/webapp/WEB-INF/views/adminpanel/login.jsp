<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:include page="../template/doc_header.jsp"/>--%>
<c:if test="${param.error != null}">
    <p style="color: red;">
        Invalid username and password.
    </p>
</c:if>
<c:if test="${param.logout != null}">
    <p style="color: green;">
        You have been logged out.
    </p>
</c:if>
<form method="post">
    <p><input type="text" id="username" name="username" placeholder="Login"> (admin)</p>
    <p><input type="password" id="password" name="password" placeholder="Hasło"> (myPassword)</p>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <p><input type="submit" value="Zaloguj"></p>
</form>
<%--<jsp:include page="../template/doc_footer.jsp"/>--%>