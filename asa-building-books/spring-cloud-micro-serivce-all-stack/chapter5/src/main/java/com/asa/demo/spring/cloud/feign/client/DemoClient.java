package com.asa.demo.spring.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 16:28 2019/9/26.
 */
@FeignClient
public interface DemoClient {
    String hello();
}