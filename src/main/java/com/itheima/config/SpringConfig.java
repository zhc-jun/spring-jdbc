package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName SpringConfig
 * @Description TODO
 * @Author 23097
 * @Data 2022/9/11 12:02
 **/
@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import(JDBCConfig.class)
public class SpringConfig {
}
