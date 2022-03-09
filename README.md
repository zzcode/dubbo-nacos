# dubbo-nacos
dubbo 通过nacos注册中心实现RPC服务 spring 实现
# https://nacos.io/en-us/docs/use-nacos-with-dubbo.html
1.安装nacos服务
2.sh startup.sh -m standalone 启动服务
3.http://49.234.118.50:8848/nacos/index.html 
4.启动dubbo服务端
5.启动dubbo客户端 消费调用服务
6.启动多个dubbo服务的时候 可以看到 nacos实现了负载均衡 调用了不同的端口
7.个人博客 https://www.qdcto.com/



