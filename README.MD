

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
