# redis-kit

## redis-kit项目是jedis的进一步封装，使得更加方便使用，使用方法  
<br>** new RedisKit("127.0.0.1",6379); //初始化Redis，只需要一次，
<br>** Redis.set("key","value");//使用如这样
<br>
<br>
<br>普通项目需要导入jar包: redis-kit 2.8.0,jedis 2.8.0,commons-pool2 2.3,
<br>maven管理只需要导入： 

<br><dependency>
 <br>   <groupId>com.iih5</groupId>
<br>    <artifactId>redis-kit</artifactId>
<br>    <version>2.8.0</version>
<br></dependency>

