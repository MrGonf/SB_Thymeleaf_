package bt_01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import bt_01.configs.MySiteMeshFilter;

@SpringBootApplication
public class SbThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbThymeleafApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init (IStorageService storageService) {
//    	return (args -> {
//    		storageService.init;
//    	})
//    }
    
    @Bean
    public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter() {
        FilterRegistrationBean<MySiteMeshFilter> filterRegistrationBean =
                new FilterRegistrationBean<MySiteMeshFilter>();

        filterRegistrationBean.setFilter(new MySiteMeshFilter());
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
    
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//    	viewResolver.setViewClass(JstlView.class);
//    	viewResolver.setPrefix("/WEB-INF/views/");
//    	viewResolver.setSuffix(".jsp");
//    	return viewResolver;
//    }
}
