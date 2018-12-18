<%--
  Created by IntelliJ IDEA.
  User: Tu
  Date: 2018/12/17
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<title>电子派单系统</title>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1" name="viewport" />
<link href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js">
</script><script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js">
</script><script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js">
</script>
<%--margin:0 auto;--%>
<style>
    #wai{color: black;font-weight: 600; margin-top: 100px;margin-left:400px;text-align:center;width:610px;height:100px; border:0px solid #900; padding:0px; overflow:hidden}
    .divleft{ float:left;background:dodgerblue;atext-align:center;line-height:100px; width:200px; height:100px;border:0px solid #060}
    .divright{ float:right;background:dodgerblue;text-align:center;line-height:100px; width:200px;height:100px; border:0px solid #00F}
</style>

<body>
    <h1 align="center">智能派单系统</h1>
    <div id="wai">
        <div class="divleft"  >接单</div>
        <div class="divright" >派单</div>
    </div>
</body>