package springjavamvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/").setViewName("home");
	}
		@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver bean = new InternalResourceViewResolver();
			bean.setViewClass(JstlView.class);
			bean.setPrefix("/WEB-INF/views/");
			bean.setSuffix(".jsp");
			return bean;
			
		
	}

	
}
