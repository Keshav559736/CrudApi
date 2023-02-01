/*
 * package com.demo.crud.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * springfox.documentation.builders.ApiInfoBuilder; import
 * springfox.documentation.builders.PathSelectors; import
 * springfox.documentation.builders.RequestHandlerSelectors; import
 * springfox.documentation.service.ApiInfo; import
 * springfox.documentation.spi.DocumentationType; import
 * springfox.documentation.spring.web.plugins.Docket; import
 * springfox.documentation.swagger2.annotations.EnableSwagger2;
 * 
 * @Configuration
 * 
 * @EnableSwagger2 public class SwaggerConfig {
 * 
 * @Bean public Docket api() { return new
 * Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"
 * ))
 * .apis(RequestHandlerSelectors.basePackage("com.demo.crud")).build().apiInfo(
 * apiInfo()); }
 * 
 * private ApiInfo apiInfo() { return new
 * ApiInfoBuilder().title("CRUD API Documentation")
 * .description("This is the API documentation for the CRUD operations for Customer and Product."
 * ) .version("1.0.0").build(); } }
 */