<%--
  Created by IntelliJ IDEA.
  User: 唐复星
  Date: 2020/9/25
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <% pageContext.setAttribute("APP_PATH",request.getContextPath()); %>
    <link rel="stylesheet" href="${APP_PATH}/layui/css/layui.css">
    <script src="${APP_PATH}/layui/layui.js"></script>
</head>
<body>

<div class="container" style="color:#c2c2c2">
    <%-- 导航栏   --%>
    <div class="row">
        <ul class="layui-nav " style="text-align:center" lay-filter="">
            <li class="layui-nav-item"><a href="">首页</a></li>
            <li class="layui-nav-item layui-this"><a href="">1</a></li>
            <li class="layui-nav-item"><a href="">2</a></li>
            <li class="layui-nav-item"><a href="">3</a></li>
            <li class="layui-nav-item"><a href="">4</a></li>
            <li class="layui-nav-item"><a href="">5</a></li>
            <i class="layui-icon layui-icon-search"></i>
            <li><input type="text" style="width:200px;float:right;height:30px;" id="title"  placeholder="请输入" autocomplete="off" class="layui-input"></li>
            <button type="button" class="layui-btn">登录</button>
            <button type="button" class="layui-btn">注册</button>
            <li class="layui-nav-item"><a href=""><i class="layui-icon layui-icon-username" style="font-size: 30px; color: #1E9FFF;"></i></a></li>
        </ul>
    </div>

    <%--  轮播图  --%>
    <div class="row " style="text-align: center">
        <div class="layui-carousel layui-inline"  id="test1">
            <div carousel-item>
                <div>条目1</div>
                <div>条目2</div>
                <div>条目3</div>
                <div>条目4</div>
            </div>
        </div>
    </div>

    <div class="row">

    </div>

    <div class="row">

    </div>
</div>

</body>
<script>
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;

        //…
    });
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            ,width: '75%' //设置容器宽度
            ,arrow: 'always' //始终显示箭头
            //,anim: 'updown' //切换动画方式
        });
    });
</script>
</html>
