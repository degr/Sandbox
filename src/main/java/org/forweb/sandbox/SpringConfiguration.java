package org.forweb.sandbox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {
        AppInitializer.BASE_PACKAGE,
        AppInitializer.BASE_PACKAGE + ".controller",
        "org.forweb.database"
})
@EnableJpaRepositories(AppInitializer.BASE_PACKAGE + ".dao")
@EnableWebMvc
public class SpringConfiguration {

    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver out = new CommonsMultipartResolver();
        out.setMaxUploadSize(10000000);
        return out;
    }
}
