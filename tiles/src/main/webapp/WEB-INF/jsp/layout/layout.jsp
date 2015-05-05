<%--
    Created by IntelliJ IDEA.
    User: m
    Date: 02.05.2015
    Time: 17:40
    To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title><tiles:insertAttribute name="title" ignore="true"/></title>
    <link rel="stylesheet" href="/resources/css/style.css">
    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
<tiles:insertAttribute name="header"/>
<tiles:insertAttribute name="navigation"/>
<div class="content">
    <div style="position: absolute; top: 250px">
        <tiles:insertAttribute name="body"/>
    </div>
</div>
<tiles:insertAttribute name="footer"/>
</body>
</html>