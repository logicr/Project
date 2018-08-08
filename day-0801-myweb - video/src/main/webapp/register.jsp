<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0105)http://www.17sucai.com/preview/742804/2018-04-04/%E9%A1%B9%E7%9B%AE%E7%99%BB%E5%BD%95%E9%A1%B5/index.html -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

    <title>Login</title>
    <link rel="icon" href="http://www.17sucai.com/preview/742804/2018-04-04/%E9%A1%B9%E7%9B%AE%E7%99%BB%E5%BD%95%E9%A1%B5/loginSpecial/images/favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="http://www.17sucai.com/preview/742804/2018-04-04/%E9%A1%B9%E7%9B%AE%E7%99%BB%E5%BD%95%E9%A1%B5/loginSpecial/images/favicon.ico" type="image/x-icon">
    <link href="/asserts/css/default.css" rel="stylesheet" type="text/css">
    <!--必要样式-->
    <link href="/asserts/css/styles.css" rel="stylesheet" type="text/css">
    <link href="/asserts/css/demo(1).css" rel="stylesheet" type="text/css">
    <link href="asserts/css/loaders.css" rel="stylesheet" type="text/css">
    <script src="asserts/js/jquery-2.1.1.min.js"></script>

    <style type="text/css">
        .tb960x90 {display:none!important;display:none}</style>
    <link id="layuicss-skinlayercss" rel="stylesheet" href="asserts/css/layer.css" media="all"><link rel="stylesheet" href="asserts/css/layer(1).css" id="layui_layer_skinlayercss"><link type="text/css" rel="stylesheet" href="asserts/css/layer.min.css"></head>
<body><canvas class="pg-canvas" width="1362" height="834"></canvas>
<div class="login">

    <!--<img class="MyLogo" src="loginSpecial/images/logo01.png" alt="   LOGO">-->
    <div class="login_title">
        <span>欢迎登录</span>
    </div>
    <!--登录-->
    <form action="/register" method="post" id="register">
        <div class="login_fields">
            <div class="login_fields__user">
                <div class="icon">

                    <img alt="" src="asserts/img/user_icon_copy.png">
                </div>
                <input name="username" placeholder="用户名" maxlength="16" class="username" type="text" autocomplete="off"
                       value="">
                <div class="validation">
                    <img alt="" src="asserts/img/tick.png">
                </div>
            </div>
            <div class="login_fields__password">
                <div class="icon">
                    <img alt="" src="asserts/css/lock_icon_copy.png">
                </div>
                <input name="password" ty class="passwordNumber" placeholder="密码" maxlength="16" type="password"
                       autocomplete="off">
                <div class="validation">
                    <img alt="" src="asserts/img/tick.png">
                </div>
            </div>

            <div class="login_fields__password">
                <div class="icon">
                    <img alt="" src="asserts/css/lock_icon_copy.png">
                </div>
                <input name="repassword" ty class="passwordNumber" placeholder="确认密码" maxlength="16" type="password"
                       autocomplete="off">
                <div class="validation">
                    <img alt="" src="asserts/img/tick.png">
                </div>
            </div>
            <div class="login_fields__password">
            </div>
            <div class="login_fields__submit">
                <input type="button" value="登录" onclick="document:location='userLogin'">
                <input type="button" value="注册" onclick="document:register.submit()">
            </div>
            <%--占位的--%>
            <div class="login_fields__password">
            </div>
        </div>
    </form>


    <div class="success">
    </div >
    <p style="color: yellow">${error}</p>
</div>


<div class="authent">
    <div class="loader" style="height: 60px;width: 60px;margin-left: 28px;margin-top: 40px">
        <div class="loader-inner ball-clip-rotate-multiple">
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>
</div>
<div class="OverWindows"></div>
<link href="asserts/css/layui.css" rel="stylesheet" type="text/css">
<!--<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>-->
<script type="text/javascript" src="asserts/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="asserts/js/stopExecutionOnTimeout.js"></script>
<script src="asserts/js/layui.js" type="text/javascript"></script>
<script src="asserts/js/Particleground.js" type="text/javascript"></script>
<script src="asserts/js/Treatment.js" type="text/javascript"></script>
<script src="asserts/js/jquery.mockjax.js" type="text/javascript"></script>
<script src="asserts/js/controlLogin.js" type="text/javascript"></script>


<div class="layui-layer-move"></div></body></html>