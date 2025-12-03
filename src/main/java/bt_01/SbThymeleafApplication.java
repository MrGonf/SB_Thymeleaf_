package bt_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import bt_01.configs.MySiteMeshFilter;

@SpringBootApplication
public class SbThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbThymeleafApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter() {
        FilterRegistrationBean<MySiteMeshFilter> filterRegistrationBean =
                new FilterRegistrationBean<>();

        filterRegistrationBean.setFilter(new MySiteMeshFilter());
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
