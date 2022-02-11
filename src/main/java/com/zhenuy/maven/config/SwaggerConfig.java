package com.zhenuy.maven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {

//    @Autowired
//    private ProConfig proConfig;

    /**
     * 注意点：为避免扫描过多controller导致假死
     * 按如下方式配置扫描，通过分组方式，扫描到具体包而非泛型扫描
     * 每多一个包增加一个bean
     */

    @Bean
    public Docket createRestApi1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(apiInfo())
                .groupName("demo")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sinosdx.demo_maven.controller"))
                .paths(PathSelectors.any())
                .build();
    }

//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .paths(PathSelectors.any())
//                .build();
//    }


//    @Bean
//    public Docket createRestApi2(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .enable(proConfig.isSwagger())
//                .apiInfo(apiInfo())
//                .groupName("shop")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.bdb.crm.member.web.newMem.control.cws"))
//                .paths(PathSelectors.any())
//                .build();
//    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("sinosdx swagger api")
                .description("for more information please visit:www.sinosdx.com")
                .version("1.0")
                .build();
    }

    /**
     * 防止@EnableMvc把默认的静态资源路径覆盖了，手动设置的方式
     *
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 解决静态资源无法访问
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        // 解决swagger无法访问
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        // 解决swagger的js文件无法访问
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

    }

}
