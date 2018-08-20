### [网站链接](http://119.23.35.81/)
##### 业务逻辑
* 前端JSP（HTML主体）＋SpringMVC+SpringJDBC
##### 2018.08.09 修改本文档格式：请在所有修改前加上时间，方便查阅
##### 基本业务
* 在线观看视频
* 登录
* 注册
* 

###### 待实现业务：
* 弹出式提示登录框、登录成功后提示，提示用户级别 
* 动态展示页面，____________动态的将上传的资源生成页面 AJAX？
* 显示当前用户状态，在线离线 已实现√
* 添加 退出功能 已实现√
* 头像：在主界面，如果当前用户头像数据库信息为空，显示默认头像
* 添加导航栏 已实现√
* 添加观影记录 
* 播放加界返回主页功能 已实现√
* 搜索功能 
* 用户注册 已实现√
* 上线提示：欢迎回来 
* 设置网站图标 已实现√
* 设置密码长度 （20180809）已实现√
* 页面资源归纳整理，思路：将资源链接放到数据库中；通过在jsp中嵌入java代码动态展示资源
* 管理员权限 思路：设计管理员页面：在页面添加数据库操作进行用户管理，结合资源管理进行资源替换
* 添加关于页面，给我发送信息 已实现√
* 邮箱验证登录、注册（登录、注册重构）//动态接收验证码 代码逻辑，调用上一条
* （2018.08.10）jsp目录整理 已实现√
* （2018.08.11）添加定时提醒功能（具体用来干嘛还没想好，只是觉得有意思）思路：使用Spring的Task添加    @Scheduled(cron = "*/5 * * * * ?")注解（去了解一下cron表达式）
	* 思路1：给用户自定义，设定提醒内容（内部使用邮件发送，...）
* （2018.08.12）添加错误页面 已实现√
* （2018.08.12）添加关闭当前网页功能（网页太丑，不想看了=.=）     实现：js实现 <a href="logout" onclick="Document:window.close()">关闭网页</a> 已实现√
* （2018.08.20）添加一个非常魔性的时钟






##### 问题&bug
* 当前有一个问题需要修复，点击视频之后应该跳转至播放，而我写成了登录 已经修复√
* 拦截器需要重写，之前的拦截器是让导演写的，没有使用真的拦截器	已经修复√
* （优化选项）重复代码控制：播放拦截页面有大量重复代码，如何实现代码复用？使用AOP？
* 阻止外部直接通过名字.jsp访问播放页面：将jsp文件移动到WEB-INF中，但是又要考虑思源文件链接问题 项目重构 已经修复√
* 注册乱码问题 解决：new String（username.getByte（”ISO-8859-1“）,"UTF-8"）;已经修复√
* 状态显示 乱码 已经修复√
* 手机端下拉菜单被挡住：找到原因：因为前端页面使用了多个模板，导致里面元素属性重复定义；解决：修改下拉菜单style="z-index: 9999" 遮挡层style="z-index: 1" 
（z-index 属性设置元素的堆叠顺序。拥有更高堆叠顺序的元素总是会处于堆叠顺序较低的元素的前面。）已经修复√
* 如何将项目改成SpringBoot项目? 没必要
* 异常管理，出现访问异常时不能暴露出Tomcat的错误信息 （2018.08.09）页面改好了，但是无法捕获 通过在web.xml中添加<error-page>（2018.08.12）已经修复√
* （2018.08.10）异常管理页面不能捕获异常界面
* （2018.08.10）配置邮件配置之后无法启动问题：未在web.xml中关联上下文
* （2018.08.10）代码正常，发送邮件：Handler dispatch failed; nested exception is java.lang.NoClassDefFoundError: com/sun/mail/util/FolderClosedIOException  包要使用sun的，已经修复√
* （2018.08.10）代码正常，发送邮件：Could not connect to SMTP host: smtp.qq.com, port: 465, 原因：必须要设置  <prop key="mail.smtp.socketFactory.class">javax.net.ssl.SSLSocketFactory</prop>已经修复√
* （2018.08.10）关于页面没有返回按钮 已经修复√
* （2018.08.10）提交到我邮箱信息乱码问题 已经修复√
* （2018.08.18）有反馈说有错别字 已经修复√（项目未上传）


##### 知识点
* 前端知识点 如何实现块元素并排显示成为导航栏？float
* 如何实现下拉菜单 利用 display: none; 在根据鼠时间修改display: block;
* 如何设置网站图标：将ico图标放到项目根目录（48X48）
* 时钟代码 <embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf"
               quality="high" bgcolor="#ffffff" width="160" height="48.8" name="honehoneclock"
               align="middle" allowscriptaccess="always" type="application/x-shockwave-flash"
               pluginspage="http://www.macromedia.com/go/getflashplayer">
