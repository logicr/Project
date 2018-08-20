<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" data-blockbyte-bs-uid="90586"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>精选视频</title>
<link href="/asserts/css/style.css" rel="stylesheet" type="text/css">
<link href="/asserts/css/headstyle.css" rel="stylesheet" type="text/css">

<style class="blockbyte-bs-style" data-name="content">body>div#blockbyte-bs-indicator>div{opacity:0;pointer-events:none}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-visible,body>iframe#blockbyte-bs-overlay.blockbyte-bs-visible{opacity:1;pointer-events:auto}body.blockbyte-bs-noscroll{overflow:hidden !important}body>div#blockbyte-bs-indicator>div{position:absolute;transform:translate3d(-40px, 0, 0);top:0;left:0;width:40px !important;height:100%;background:rgba(0,0,0,0.5);border-radius:0 10px 10px 0;transition:opacity 0.3s, transform 0.3s;z-index:2}body>div#blockbyte-bs-indicator>div>span{-webkit-mask:no-repeat center/32px;-webkit-mask-image:url(chrome-extension://jdbnofccmhefkmjbkkdkfiicjkgofkdh/img/icon-bookmark.svg);background-color:#ffffff;position:absolute;display:block;top:0;left:0;width:100%;height:100%}body>div#blockbyte-bs-indicator[data-pos='right']{left:auto;right:0}body>div#blockbyte-bs-indicator[data-pos='right']>div{transform:translate3d(40px, 0, 0);left:auto;right:0;border-radius:10px 0 0 10px}body>div#blockbyte-bs-indicator.blockbyte-bs-fullHeight>div{border-radius:0}body>div#blockbyte-bs-indicator.blockbyte-bs-hover>div{transform:translate3d(0, 0, 0);opacity:1}body>div#blockbyte-bs-indicator[data-pos='left'].blockbyte-bs-has-lsb{height:100% !important;top:0 !important}body>div#blockbyte-bs-indicator[data-pos='left'].blockbyte-bs-has-lsb>div{background:transparent}body>div#blockbyte-bs-indicator[data-pos='left'].blockbyte-bs-has-lsb>div>span{-webkit-mask-position-y:20px}body>iframe#blockbyte-bs-sidebar{width:350px;max-width:none;height:0;z-index:2147483646;background-color:rgba(255,255,255,0.8) !important;border:none;display:block !important;transform:translate3d(-350px, 0, 0);transition:width 0s 0.3s, height 0s 0.3s, opacity 0.3s, transform 0.3s}body>iframe#blockbyte-bs-sidebar[data-pos='right']{left:auto;right:0;transform:translate3d(350px, 0, 0)}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-visible{width:calc(100% + 350px);height:100%;transform:translate3d(0, 0, 0);transition:opacity 0.3s, transform 0.3s}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-hideMask{background:none !important}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-hideMask:not(.blockbyte-bs-hover){width:calc(350px + 50px)}body>iframe#blockbyte-bs-overlay{width:100%;max-width:none;height:100%;z-index:2147483647;border:none;background:rgba(0,0,0,0.5) !important;transition:opacity 0.3s}
</style></head>
<body class="channle" style="background-color: #242645;">


<!-- 頁頭 -->
 <!-- 導航tab選項 -->
<div>
<ul class="myul">
    <li><a class="active" href="../video">主页</a></li>
    <li><a href="#news"></a></li>
    <li><a href="#news"></a></li>
    <li><a href="#news"></a></li>
    <li><a href="#news"></a></li>



    <div class="dropdown">

        <a href="#" class="dropbtn">个人中心[
            <%
                Object user = session.getAttribute("current_user");
                if (null == user) {
                    out.println("未登录");
                } else {
                    out.println("你好，"+user.toString());
                }
            %>
            ]</a>
        <div class="dropdown-content" style="z-index: 9999">
            <a href="userLogin">登录</a>
            <a href="register">注册</a>
            <a href="#">观影记录</a>
            <a href="test">测试免登录（后期请删除）</a>
            <a href="logout">退出登录</a>
            <a href="logout" onclick="Document:window.close()">关闭网页（实验）</a>
            <a href="about">关于&反馈</a>
        </div>
    </div>
    <div style="float:right" >
        <embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf"
               quality="high" bgcolor="#ffffff" width="160" height="48.8" name="honehoneclock"
               align="middle" allowscriptaccess="always" type="application/x-shockwave-flash"
               pluginspage="http://www.macromedia.com/go/getflashplayer">
    </div>
</ul>
</div>




<div align="center" style="z-index: 1;">

<div class="box movie2_list" style="background-color: #242645; z-index: 1">
		
<ul>

    <li><a href="xihongshi" target="_blank"><img src="http://88.meenke.com/img_buyhi/201807/2018072948065881.jpg"><h3>西虹市首富</h3></a></li>
    <li><a href="direnjie" target="_blank"><img src="http://88.meenke.com/img_buyhi/201807/2018073102365081.jpg"><h3>狄仁杰之四大天王</h3></a></li>
    <li><a href="xie" target="_blank"><img src="https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2526297221.webp"><h3>邪不压正</h3></a></li>
    <li><a href="sousuo" target="_blank"><img src="http://88.meenke.com/img_buyhi/201207/2012071251254033.jpg"><h3>搜索</h3></a></li>
    <li><a href="dongwushijie" target="_blank"><img src="http://88.meenke.com/img_buyhi/201807/2018071074369097.jpg"><h3>动物世界</h3></a></li>
    <li><a href="fuchouzhe3" target="_blank"><img src="http://88.meenke.com/img_buyhi/201805/2018050655535917.jpg"><h3>复仇者联盟3</h3></a></li>

</ul>
</div>

</div>



    
    
    





<audio controls="controls" style="display: none;"></audio><div id="blockbyte-bs-indicator" class="blockbyte-bs-fullHeight" style="width: 2px; height: 100%; top: 0%;"></div><style type="text/css">#yddContainer{display:block;font-family:Microsoft YaHei;position:relative;width:100%;height:100%;top:-4px;left:-4px;font-size:12px;border:1px solid}#yddTop{display:block;height:22px}#yddTopBorderlr{display:block;position:static;height:17px;padding:2px 28px;line-height:17px;font-size:12px;color:#5079bb;font-weight:bold;border-style:none solid;border-width:1px}#yddTopBorderlr .ydd-sp{position:absolute;top:2px;height:0;overflow:hidden}.ydd-icon{left:5px;width:17px;padding:0px 0px 0px 0px;padding-top:17px;background-position:-16px -44px}.ydd-close{right:5px;width:16px;padding-top:16px;background-position:left -44px}#yddKeyTitle{float:left;text-decoration:none}#yddMiddle{display:block;margin-bottom:10px}.ydd-tabs{display:block;margin:5px 0;padding:0 5px;height:18px;border-bottom:1px solid}.ydd-tab{display:block;float:left;height:18px;margin:0 5px -1px 0;padding:0 4px;line-height:18px;border:1px solid;border-bottom:none}.ydd-trans-container{display:block;line-height:160%}.ydd-trans-container a{text-decoration:none;}#yddBottom{position:absolute;bottom:0;left:0;width:100%;height:22px;line-height:22px;overflow:hidden;background-position:left -22px}.ydd-padding010{padding:0 10px}#yddWrapper{color:#252525;z-index:10001;background:url(chrome-extension://eopjamdnofihpioajgfdikhhbobonhbb/ab20.png);}#yddContainer{background:#fff;border-color:#4b7598}#yddTopBorderlr{border-color:#f0f8fc}#yddWrapper .ydd-sp{background-image:url(chrome-extension://eopjamdnofihpioajgfdikhhbobonhbb/ydd-sprite.png)}#yddWrapper a,#yddWrapper a:hover,#yddWrapper a:visited{color:#50799b}#yddWrapper .ydd-tabs{color:#959595}.ydd-tabs,.ydd-tab{background:#fff;border-color:#d5e7f3}#yddBottom{color:#363636}#yddWrapper{min-width:250px;max-width:400px;}</style></body></html>