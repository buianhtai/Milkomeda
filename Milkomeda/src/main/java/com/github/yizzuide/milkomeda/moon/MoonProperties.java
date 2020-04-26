package com.github.yizzuide.milkomeda.moon;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * MoonProperties
 *
 * @author yizzuide
 * @since 3.0.0
 * Create at 2020/03/28 17:24
 */
@Data
@ConfigurationProperties("milkomeda.moon")
public class MoonProperties {
    /**
     * 实例配置
     */
    private List<Instance> instances;

    @Data
    public static class Instance {
        /**
         * 实例名（不能与现有bean有重名)
         */
        private String name;
        /**
         * Light L2缓存实例名
         */
        private String cacheName = Moon.CACHE_NAME;
        /**
         * 环形策略（默认为PeriodicMoonStrategy）
         */
        private Class<MoonStrategy> moonStrategyClazz;
        /**
         * 自定义属性
         */
        private Map<String, Object> props;
        /**
         * 环形阶段值
         */
        private List<Object> phases;
    }
}
