package com.develhope.Interceptor.Middleware1.Configurations;

import com.develhope.Interceptor.Middleware1.Component.BasicController;
import com.develhope.Interceptor.Middleware1.Component.LegacyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private BasicController basicController;
    @Autowired
    private LegacyController legacyController;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(basicController);
        registry.addInterceptor(legacyController);

    }
}
