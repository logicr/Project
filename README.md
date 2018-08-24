### [网站链接](http://119.23.35.81/)
##### 业务逻辑
* 前端JSP（HTML主体）＋SpringMVC+SpringJDBC
* （2018.08.21）应该把详细的业务逻辑写出来，不然过几天就忘了。
* （2018.08.24）搭建框架：
	* pom.xml中添加各种相关依赖（记得改为war包，不然没有点）。
	* 建立与Java同级的webapp目录，以及WEB-INF路径。
	* web.xml至关重要，关联上下文，将Servlet与Spring联系的纽带，以及各种配置，导演拦截和错误页面都在这里。
* resources文件配置：
	* application-context.xml是Spring相关的配置，数据源啊、事务啊、扫描啊、JDBC等。
	* application-servlet.xml是Servlet相关的配置文件，视图解析器、包扫描、启用SpringMVC注解、防过滤、定时任务也在这里。
	* application-mail.xml 发邮件相关业务的配置，要加到web.xml的上下文里才能生效。
* 页面：
	* 页面通通都放到WEN-INF中，以防有人越过导演直接访问资源。
	* 主页展示网站资源，前端真是好玩又花样多，大部分时间都花在怎么改前端页面上，虽然是jsp页面，但是也就仅仅是加了个头而已，99%都是HTML。
* 写表现层的control：
	* 这里包含了所有业务层的代码：需要记住几个注解：@Controller注解标注是一个类是Web控制器，其和@Component注解等价，只不过在Web层使用，其便于区分类 的作用，经常结合配置@RequestMapping注解使用。
	* @RequestMapping是Spring Web应用程序中最常被用到的注解之一。这个注解会将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上。

	* WelcomeControl：欢迎页面的控制页面，通过注解将没有指定请求（GET）的拦截过来，返回一个欢迎页面。
	* LoginController：用户登录控制界面，这里用了@Autowired注解，自动注入，用自动注入看起来代码真是和蔼可亲...这里就要跟DAO层数据交互了，怎么交互问题交给Service来处理，只需要注入接口就好，面向接口真是好啊，另外，这里的请求有GET（要页面）/POST（提交页面），返回也可以返回页面，也可以是视图（ModelAndView），逻辑：将用户提交的密码和用户名与数据库中数据进行比较，成功添加Session。
	* LogoutController：退出登录，简单，清除Session。
	* RegisterController：注册功能，这里用了@RequestParam注解，使用@RequestParam注解可以将请求参数传递给请求方法，其中value是参数名，required是参数是否必须，默认 true 表示请求参数必须包含对应参数，若不存在，将抛出异常。逻辑：参数进来先做各种参数校验，密码长度啊用户名之类的，然后扔给服务层去跟DAO层做数据处理。
	* PlayFilterController：播放控制，逻辑：进行Session检测，没有登录就不能看，想法来自于某色情网站（不充钱就不给你看，当然，充了也不给看的）；所有的视频播放的页面都在这里进行处理。
	* TestController：测试免登陆的，逻辑：直接不做校验添加一个Session，每次调试都要登录，我自己都觉得烦。
	* AboutController：关于和反馈的页面，将用户的信息提交之后后台通过邮件发送到我的邮箱，这里面有个坑：添加依赖可不是mail-api包而因该是sun的mail包，这可害人了，还好StackOverflow有人踩坑。逻辑：使用Spring的JavaMailSender创建对象，再用sun的MimeMessage来处理邮件发送业务。
	* TimeTaskController：定时任务，定时给我或者指定用户发送邮件：这里使用Spring的@Scheduled注解直接帮我解决了定制执行的问题（有了Spring感觉什么都可以直接搬轮子了），这里在@Scheduled里使用的是CRON表达式，跟正则一样的；逻辑：使用@Scheduled开启定时任务，再使用之前的关于反馈的发送邮件轮子改造一下实现订阅之类的功能。
* 服务层Service：
	* 这里都是些DAO访问层的方法，有两个注解@Service服务层自然用它了，@Transactional进行事务管理，这两个注解都是放在实现类上的，可不是接口上的。
* 数据访问层DAO层：
	* 这里就和数据直接打交道了，使用了@Repository注解声明这是DAO，自动注入了JdbcTemplate使用SpringJDBC来操作sql语句，同样这里也是面向接口的。
* 实例类entity：
	* 用来携带用户数据，方便处理。





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
* （2018.08.20）添加一个非常魔性的时钟 已实现√
* （2018.08.24）资源有点少了，改天添加点资源






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
* （2018.08.21）关闭网页好像不行，本地测试可以关闭，上传之后就嗝屁了。

##### 知识点
* 前端知识点 如何实现块元素并排显示成为导航栏？float
* 如何实现下拉菜单 利用 display: none; 在根据鼠时间修改display: block;
* 如何设置网站图标：将ico图标放到项目根目录（48X48）
* 时钟代码 /<embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf"
               quality="high" bgcolor="#ffffff" width="160" height="48.8" name="honehoneclock"
               align="middle" allowscriptaccess="always" type="application/x-shockwave-flash"
               pluginspage="http://www.macromedia.com/go/getflashplayer"/>
