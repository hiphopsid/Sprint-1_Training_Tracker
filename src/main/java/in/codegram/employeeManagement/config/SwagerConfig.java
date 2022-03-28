//package in.codegram.employeeManagement.config;
//
//import java.util.ArrayList;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@Configuration
//public class SwagerConfig 
//{
//	
//	@Bean
//	public Docket productApi()
//	{
//			return new Docket(DocumentationType.SWAGGER_2)
//					.select().apis(RequestHandlerSelectors.basePackage("in.codegram.employeeManagement.web"))
//					.paths(PathSelectors.regex("/api.*"))
//					.build()
//					.apiInfo(metoInfo());
//	}
//	
//	private ApiInfo metoInfo()
//	{
//		ApiInfo apiInfo=new ApiInfo(
//				"Employee Management API",
//				"EmployeeManagement API Created by Codegram",
//				"1.0",
//				"Terms of service",
//				new Contact("Siddhant gupta","https://www.codegram.in", "siddhant.ranipur@gmail.com"),
//				"Codegram License V1.0", 
//				"https://www.codegram.in",
//				new ArrayList<>());
//			return apiInfo;
//	}
//}
