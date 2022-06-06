## 创建 springboot 测试工程步骤

### 进入 `https://start.spring.io/`

[https://start.spring.io/](https://start.spring.io/)

### 输入项目信息

输入项目信息后，点击`GENERATE`生成并下载项目（zip）

![img.png](img.png)

### 修改 `spring-boot` 版本号

修改版本号和脚手架所使用的 spring-boot 一致

```xml

<parent>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-parent</artifactId>
  <version>2.7.0</version>
  <relativePath/> <!-- lookup parent from repository -->
</parent>
```

<center>&darr;&darr;&darr;</center>

```xml

<parent>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-parent</artifactId>
  <version>>1.5.22.RELEASE</version>
  <relativePath/> <!-- lookup parent from repository -->
</parent>
```

### 引入 spring-boot-starter-web

```xml

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

### 创建测试接口

```java

@RestController
@RequestMapping("/test")
public class TestController {

  @RequestMapping
  public Map<String, Object> test() {
    Map<String, Object> result = new HashMap<>();
    result.put("message", "OK");
    result.put("status", 200);
    result.put("data", 1);
    return result;
  }

}

```

### 修改端口号

在配置文件[applicaiton.properties](./src/main/resources/application.properties) 中增加配置项

```shell
server.port=18081
```

### 打包

```shell
 mvn clean package -Dmaven.test.skip=true
```

## 测试方法

### 启动程序

```shell
java -server -jar springboot-stone-0.0.1-SNAPSHOT.jar -Xmx4g
```

### 启动测试程序

[berf](https://github.com/bingoohuang/berf) 是黄老师研发的测试工具，简单易用，效率高。

```shell
/tmp/berf 192.168.112.175:18081/test -qps=100000 -c 1500 -d 1m
```
