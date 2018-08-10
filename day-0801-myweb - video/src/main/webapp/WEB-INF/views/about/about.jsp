<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>关于</title>

<link rel="stylesheet" type="text/css" href="../../../asserts/css/about-main.css" />

<style type="text/css">
.demo{margin:50px auto 0 auto; width:600px}
.demo span{color:#666; margin-left:10px}
textarea {display:block; width:450px;height:100px;border: 1px solid #ccc;}
.post{width: 230px;border: 1px solid #ccc;background: #ececec; padding: 10px; margin: 10px 0;}
button {border: 1px solid #ccc; background: #ececec;-webkit-border-radius: 3px;
-moz-border-radius: 3px;margin-top: 10px;padding: 5px 20px; cursor:pointer}
</style>

</head>

<body>


<div id="main">
   <h2 class="top_title"><a href="#">如有侵权或其他问题，请在下方提交</a></h2>
   <div class="demo">
		<div id="result"></div>
	   <h3 style="color: #162934 ;margin-bottom:  10px ;">${msg}</h3>
	   <form action="mail" method="post">
		   <textarea name="text" id="msg" placeholder="输入内容" autofocus></textarea>
		   <button type="submit">提 交</button><span></span>
		   <button type="button" onclick="document:location='video'" >返回首页</button>
	   </form>

   </div>
<div style="text-align:center;margin:100px 0; font:normal 14px/24px 'MicroSoft YaHei';">

</div>
</div>

<script type="text/javascript" src="../../../asserts/js/about-jquery-1.7.2.min.js"></script>
<script type="text/javascript">
$.fn.ctrlEnter = function (btns, fn) {
     var thiz = $(this);
     btns = $(btns);
        
     function performAction (e) {
         fn.call(thiz, e);
     };
     thiz.bind("keydown", function (e) {
        if (e.keyCode === 13 && e.ctrlKey) {
            performAction(e);
            e.preventDefault();
        }
     });
     btns.bind("click", performAction);
}
 
// $("#msg").ctrlEnter("button", function () {
       // $("<p class='post'></p>").append(this.val().replace(/\n/g, "<br/>")).fadeIn('slow').appendTo("#result");
       // this.val("");
// });
</script>

</body>
</html>