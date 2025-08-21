package com.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:constant.properties"),
        @PropertySource("classpath:common.properties"),
        @PropertySource(value="classpath:common-${spring.profiles.active}.properties",ignoreResourceNotFound = true)
})
public class PropertiesConfig {
}
