package al.fatjon.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//public class AuthService extends SpringBootServletInitializer implements WebApplicationInitializer {
public class AuthService  {
	
	public static void main(String[] args) {
		SpringApplication.run(AuthService.class, args);
	}
	
	@Bean
	public Docket swaggerSettings() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo())
				.pathMapping("/");
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("auth-service")
				.description("Authentication server oauth2")
				.version("1.0")
				.build();
	}
	
}
