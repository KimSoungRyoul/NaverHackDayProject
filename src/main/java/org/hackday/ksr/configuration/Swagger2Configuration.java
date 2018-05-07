package org.hackday.ksr.configuration;


import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@Configuration
@EnableSwagger2
//@EnableAutoConfiguration
//@Import(BeanValidatorPluginsConfiguration.class)
public class Swagger2Configuration {

	@Bean
	public Docket swaggerSpringMvcPlugin() {

		return new Docket(DocumentationType.SWAGGER_2)

				.apiInfo(apiInfo())
				.select()
				   			
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.ant("/api/v1/**"))

				//.paths(PathSelectors.any())
				.build();
				
	}

	private ApiInfo apiInfo() {
		Contact contact=new Contact("Naver Campus HackDay", "https://github.com/NAVER-CAMPUS-HACKDAY/smart-contact", "KimSoungRyoul@gmail.com");
		String license="No License...";
		String licenseUrl="......";
		String title="스마트 주소록  ";
		String description=" api 설계 프로토 타입";
		
		
		
		return new ApiInfoBuilder()
		.contact(contact)
		.license(license)
		.licenseUrl(licenseUrl)
		.title(title)
		.description(description)
		.version("version1.0")
		.termsOfServiceUrl("2018-05-06")
		.build();
		
		
	}













	
}