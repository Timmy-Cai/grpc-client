# GRPC 客户端

引入重要依赖
````
<dependency>
    <groupId>net.devh</groupId>
    <artifactId>grpc-client-spring-boot-starter</artifactId>
    <version>2.14.0.RELEASE</version>
</dependency>
````

1. 若使用MacOS M1芯片电脑，protobuf插件版本os.detected.classifier可以先使用osx-x86_64
2. 先启动grpc-server工程
3. GET http://localhost:8081/hi?name=timmy 获取结果
