# spring boot cloud 的上手项目

spring boot 使用的日志框架为 slf4j + logback , 其余框架的日志
比如log4j，commons-logging，java-uniform-logging 都会被桥接到
slf4j上来

关于mvnw 是 maven wrapper，保持maven构建工具版本一直的工具
只需要运行命令mvn -N io.takari:maven:wrapper既可生成这些文件
https://github.com/takari/maven-wrapper

spring boot 所有的start的管理pom在这个依赖里
```
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starters</artifactId>
      <version>1.5.9.RELEASE</version>
  </dependency>
```
  