package com.asa.demo.spring.cloud.feign.conf;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 16:40 2019/9/26.
 */
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
    /**
     * Called for every request. Add data using methods on the supplied {@link RequestTemplate}.
     *
     * @param template
     */
    @Override
    public void apply(RequestTemplate template) {
        //business code
    }
}