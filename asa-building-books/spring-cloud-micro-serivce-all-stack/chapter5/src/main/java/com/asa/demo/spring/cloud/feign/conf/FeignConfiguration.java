package com.asa.demo.spring.cloud.feign.conf;

import feign.Contract;
import feign.Logger;
import feign.Request;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.json.Jackson2JsonDecoder;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 16:35 2019/9/26.
 */
@Configuration
public class FeignConfiguration {
    /**
     * logger level: none, basic, headers, full
     *
     * @return logger level
     */
    @Bean
    Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Contract contact() {
        return new feign.Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("username", "password");
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 1000);
    }

    @Bean
    public Decoder decoder() {
        return new Decoder.Default();
    }

    @Bean
    public Encoder encoder() {
        return new Encoder.Default();
    }
}