package com.asa.demo.spring.cloud.feign.raw;

import com.asa.demo.spring.cloud.bean.Contributor;
import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 17:23 2019/9/26.
 */
public interface Github {
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

    @Headers("Content-Type:application/json")
    @RequestLine("PUT / api /{key}")
    void put(@Param("key") String value);

    @RequestLine("POST /")
    @Headers("Content-Type:application/json")
    @Body("%7B\"user_name\":\"{user_name\"}%7D")
    void json(@Param("user_name") String username);
}