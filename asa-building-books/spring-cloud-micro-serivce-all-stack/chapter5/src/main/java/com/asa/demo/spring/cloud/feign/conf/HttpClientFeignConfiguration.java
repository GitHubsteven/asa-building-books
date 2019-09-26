package com.asa.demo.spring.cloud.feign.conf;

import feign.Client;
import feign.httpclient.ApacheHttpClient;
import org.apache.http.client.HttpClient;
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
@ConditionalOnClass(ApacheHttpClient.class)
@ConditionalOnMissingClass("com.netflix.loadbalancer.ILoadBalancer")
@ConditionalOnProperty(value = "feign.httpclient.enabled", matchIfMissing = true)
public class HttpClientFeignConfiguration {
    @Autowired(required = false)
    private HttpClient httpClient;

    @Bean
    @ConditionalOnMissingBean(Client.class)
    public Client feignClient() {
        if (httpClient != null) {
            return new ApacheHttpClient(this.httpClient);
        }
        return new ApacheHttpClient();
    }
}