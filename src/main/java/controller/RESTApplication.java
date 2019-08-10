package controller;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;


public class RESTApplication extends ResourceConfig {

    public RESTApplication() {

        //想让jersey托管的部分需要加入扫描,或者使用register指定托管类也可以
        this.packages("controller");
        //加载日志包
        register(LoggingFilter.class);
        //加载json转换器
        register(JacksonJsonProvider.class);
        System.out.println("加载RESTApplication");
    }
}


