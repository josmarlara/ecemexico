package com.tutosoftware.ecemexico.config;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tutosoftware.ecemexico")
public class ECEMexicoConfig implements WebMvcConfigurer {
	
private static final Charset UTF8 = Charset.forName("UTF-8");
	
	
	
	@Bean(name="EceMexico")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
	@Bean(name="EceMexicoPdf")
	public ViewResolver viewResolver2() {
		ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
		viewResolver.setOrder(1);
	    viewResolver.setBasename("views");
		
		return viewResolver;
	}
	
	
	
	 public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	      StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
	      stringConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "plain", UTF8)));
	      converters.add(stringConverter);
	      
	      
	       converters.add(new MappingJackson2HttpMessageConverter());
	 
	      // Add other converters ...
	  }
	 
	 
	 
	 
	 
	  // Static Resource Config
	  // equivalents for <mvc:resources/> tags
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
		  registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31556926);
	      registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
	      registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
	      registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
	  }
	 
	  // Equivalent for <mvc:default-servlet-handler/> tag
	  @Override
	  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	      configurer.enable();
	  }
	  
	  
	  
	  
	  @Bean
	   public MessageSource messageSource() {
	      ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	      source.setBasename("messages");
	      return source;
	   }

	   @Override
	   public Validator getValidator() {
	      LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
	      validator.setValidationMessageSource(messageSource());
	      return validator;
	   }

}
