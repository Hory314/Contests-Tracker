<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../template/doc_header.jsp"/>
<form:form modelAttribute="newContest" method="post">
    <form:input path="title" placeholder="Tytuł"/><form:errors path="title" cssClass="form-error"/>
    <form:input path="startDate" type="date"/><form:errors path="startDate" cssClass="form-error"/>
    <form:input path="endDate" type="date"/><form:errors path="endDate" cssClass="form-error"/>
    <form:textarea path="shortDescription" placeholder="Krótki opis konkursu"/><form:errors path="shortDescription"
                                                                                            cssClass="form-error"/>
    <form:textarea path="description" placeholder="Opis konkursu"/><form:errors path="description"
                                                                                cssClass="form-error"/>
    <form:input path="organizer" placeholder="Nazwa organizatora"/><form:errors path="organizer" cssClass="form-error"/>
    <form:input path="contestLink" placeholder="Link do konkursu"/><form:errors path="contestLink"
                                                                                cssClass="form-error"/>
    <form:input path="rulesLink" placeholder="Link do regulaminu"/><form:errors path="rulesLink" cssClass="form-error"/>
    <form:textarea path="rewardDescription" placeholder="Nagrody"/><form:errors path="rewardDescription"
                                                                                cssClass="form-error"/>
    Kategoria:<br>
    <form:select path="category" items="${categories}" itemLabel="name" itemValue="id"/><form:errors path="category"
                                                                                                     cssClass="form-error"/>
    Tagi:<br>
    <form:checkboxes path="tags" items="${tags}" itemLabel="name" itemValue="id"/><form:errors path="tags"
                                                                                               cssClass="form-error"/>
    Rodzaj nagrody:<br>
    <form:checkboxes path="rewardTypes" items="${rewardTypes}" itemLabel="name" itemValue="id"/><form:errors
        path="rewardTypes" cssClass="form-error"/>
    <input type="submit" value="Dodaj">
</form:form>
<jsp:include page="../template/doc_footer.jsp"/>
