package com.zyn.pumpkinmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //接口分组名称
                .groupName("controller")
                .apiInfo(apiInfo())
                //查询所有接口
                .select()
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //这些是页面额外的信息，稍微做个了解即可，等下看运行后的页面
                .title("HTTP API")
                .description("管理端接口")
                .termsOfServiceUrl("http://springfox.io")
                .contact("zyn")
                .license("Apache license Version 2.0")
//                .licenseUrl("https://github.com/springfox/springfox/")
                .version("2.0")
                .build();
    }
}
