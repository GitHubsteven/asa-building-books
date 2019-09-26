package com.asa.demo.spring.cloud.feign.conf;

import feign.Client;
import feign.httpclient.ApacheHttpClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 16:49 2019/9/26.
 */
@Configuration
@ConditionalOnClass(OkHttpClient.class)
@ConditionalOnMissingClass("com.netflix.loadbalancer.ILoadBalancer")
@ConditionalOnProperty(value = "feign.okhttp.enabled", matchIfMissing = true)
public class OkHttpFeignConfiguration {
    @Autowired(required = false)
    private okhttp3.OkHttpClient okHttpClient;

    @Bean
    @ConditionalOnMissingBean(Client.class)
    public Client feignClient() {
        if (okHttpClient != null) {
            return new feign.okhttp.OkHttpClient(this.okHttpClient);
        }
        return new feign.okhttp.OkHttpClient();
    }
}