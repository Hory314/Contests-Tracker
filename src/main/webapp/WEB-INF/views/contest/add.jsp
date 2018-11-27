<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<form:form modelAttribute="newContest" method="post">
    <p><form:input path="title" placeholder="Tytuł"/><form:errors path="title" cssClass="form-error"/></p>
    <%--fixme set good type for date/time--%>
    <p><form:input path="startDate" placeholder="Data i czas rozpoczęcia"/><form:errors path="startDate"
                                                                                        cssClass="form-error"/></p>
    <p><form:input path="endDate" placeholder="Data i czas zakończenia"/><form:errors path="endDate"
                                                                                      cssClass="form-error"/></p>
    <p><form:textarea path="shortDescription" placeholder="Krótki opis konkursu"/><form:errors path="shortDescription"
                                                                                               cssClass="form-error"/></p>
    <p><form:textarea path="description" placeholder="Opis konkursu"/><form:errors path="description"
                                                                                   cssClass="form-error"/></p>
    <p><form:input path="organizer" placeholder="Nazwa organizatora"/><form:errors path="organizer"
                                                                                   cssClass="form-error"/></p>
    <p><form:input path="contestLink" placeholder="Link do konkursu"/><form:errors path="contestLink"
                                                                                   cssClass="form-error"/></p>
    <p><form:input path="rulesLink" placeholder="Link do regulaminu"/><form:errors path="rulesLink"
                                                                                   cssClass="form-error"/></p>
    <p><form:textarea path="rewardDescription" placeholder="Nagrody"/><form:errors path="rewardDescription"
                                                                                   cssClass="form-error"/></p>
    <p>Kategoria:<br>
        <form:select path="category.id" items="${categories}" itemLabel="name" itemValue="id"/><form:errors
                path="category"
                cssClass="form-error"/></p>
    <p>Tagi:<br>
        <form:checkboxes path="tags" items="${tags}" itemLabel="name" itemValue="id"/><form:errors path="tags"
                                                                                                   cssClass="form-error"/>
    </p>
    <p>Rodzaj nagrody:<br>
        <form:checkboxes path="rewardTypes" items="${rewardTypes}" itemLabel="name" itemValue="id"/><form:errors
                path="rewardTypes" cssClass="form-error"/></p>
    <p><input type="submit" value="Dodaj"></p>
</form:form>
<jsp:include page="../template/doc_footer.jsp"/>
