<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<jsp:include page="/WEB-INF/jsp/fragments/headTag.jsp"/>
<body>
<jsp:include page="/WEB-INF/jsp/fragments/bodyHeader.jsp"/>
<br>
<section>
    <form method="post" action="users">
        <spring:message code="app.login"/>: <select name="userId">
        <option value="100000" selected>User</option>
        <option value="100001">Admin</option>
    </select>
        <button type="submit"><spring:message code="common.select"/></button>
    </form>
</section>
<jsp:include page="/WEB-INF/jsp/fragments/footer.jsp"/>
</body>
</html>