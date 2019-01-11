<%@ page import="java.time.LocalDate" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- footer -->

<footer role="footer">

    <!-- logo -->

    <h1>

        <a href="<c:url value="/"/>"><img src="<c:url value="/images/logo.png"/>" width="75"/></a>

    </h1>

    <!-- logo -->

    <!-- nav -->

    <nav role="footer-nav">

        <ul>

            <li><a href="<c:url value="/"/>">Strona główna</a></li>

            <li><a href="<c:url value="/adminpanel"/>">Ukryty panel admina</a></li>

        </ul>

    </nav>

    <!-- nav -->

    <ul role="social-icons">

        <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>

        <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>

        <li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>

        <li><a href="#"><i class="fa fa-flickr" aria-hidden="true"></i></a></li>

    </ul>

    <p class="copy-right">&copy; <%=LocalDate.now().getYear()%> Michał Hordyjewicz</p>

</footer>

<!-- footer -->


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<script src="<c:url value="/js/jquery.min.js"/>" type="text/javascript"></script>

<!-- custom -->

<script src="<c:url value="/js/nav.js"/>" type="text/javascript"></script>

<script src="<c:url value="/js/custom.js"/>" type="text/javascript"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->

<script src="<c:url value="/js/bootstrap.min.js"/>" type="text/javascript"></script>

<script src="<c:url value="/js/effects/masonry.pkgd.min.js"/>" type="text/javascript"></script>

<script src="<c:url value="/js/effects/imagesloaded.js"/>" type="text/javascript"></script>

<script src="<c:url value="/js/effects/classie.js"/>" type="text/javascript"></script>

<script src="<c:url value="/js/effects/AnimOnScroll.js"/>" type="text/javascript"></script>

<script src="<c:url value="/js/effects/modernizr.custom.js"/>"></script>

<!-- jquery.countdown -->

<script src="<c:url value="/js/html5shiv.js"/>" type="text/javascript"></script>

</body>

</html>