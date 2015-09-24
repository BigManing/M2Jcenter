# M2Jcenter
使用Gradle发布Library到JCenter仓库
1、在Library 下的 grandle.buil下 替换成 如下代码

https://github.com/BigManing/M2Jcenter/blob/master/jcenterlibrary/build.gradle

2、在项目根目录下（最外层的）local.properties文件下  添加如下代码
bintray.user=******    // https://bintray.com    注册的   用户名
bintray.apikey=******************************   // https://bintray.com    用户编辑的地方    有个api key  就是这个

3、在Android studio 右侧grandle  里面 要发布的library 下  有个publishing --bintrayUpload     点击运行 就可以上传library  

4、 如果ok了     https://bintray.com    ---  maven  下---- 就会看到上传的 library 
点击进去，add  to  jcenter     审核通过后（几个小时不等）  就可以直接引用了

5、例如  ：
compile 'jscenter.test.com.jcenterlibrary:jcenterlibrary:1.0.1'  

6. 经验随时交流：  lingshui2008@qq.com
