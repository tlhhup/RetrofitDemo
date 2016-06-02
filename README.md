# RetrofitDemo
 主要目的学些Retrofit开源网络请求框架以及导航菜单的学习
 1. NavigationView该组件是android 5.0以后推出的material design风格的组件，
    用于和DrawerLayout组件集合使用到达侧滑菜单效果，类似slidingMenu开源项目的侧滑菜单。
 2. NavigationView分为两部分组成，头和菜单项。其中菜单项的监听事件处理比较方便，和activity的菜单的事件处理方式一致
    通过添加NavigationItemSelectedListener(导航项选择监听器)处理点击事件。但对头部控件的处理必须
    先通过NavigationView的getHeaderView方法获取到headerView再从中获取头部的控件，进行相应的操作
 3. Retrofit：异步请求框架-->针对rest风格的api采用接口的方式进行处理：get post update delte
    1. 接口定义中带返回值的为同步请求，参数列表中带回调函数的为异步请求
    2. 完全使用主键的方式封装请求，并通过Retrofit获取请求的实例(这个类似Mybatis中的动态代理开发)
    3. Converter规范数据转换的规则，可自定义 默认采用Gson数据
    4. 在设置baseUrl的时候地址必需"/"结束，请求的地址不以"/"开头