package com.asa.demo.spring.cloud.feign.raw;

import feign.Feign;
import feign.Logger;
import feign.Request;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 17:38 2019/9/26.
 */
public class RestApiCallUtils {
    public static <T> T getRestClient(Class<T> type, String url) {
        return Feign.builder()
                .logger(new Logger.JavaLogger(type))
                .logLevel(Logger.Level.FULL)
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .client(new OkHttpClient())
                .options(new Request.Options(1000, 1000))
                .retryer(new Retryer.Default())
                .target(type, url);
    }
}