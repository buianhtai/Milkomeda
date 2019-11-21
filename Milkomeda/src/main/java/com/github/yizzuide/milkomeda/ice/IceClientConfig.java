package com.github.yizzuide.milkomeda.ice;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * IceClientConfig
 *
 * @author yizzuide
 * @since 1.15.2
 * Create at 2019/11/21 11:21
 */
@Configuration
@ConditionalOnClass(RedisTemplate.class)
@AutoConfigureAfter(RedisAutoConfiguration.class)
@EnableConfigurationProperties(IceProperties.class)
public class IceClientConfig extends IceBasicConfig {
    @Bean
    public IceContext iceContext() {
        return new IceContext();
    }
}
