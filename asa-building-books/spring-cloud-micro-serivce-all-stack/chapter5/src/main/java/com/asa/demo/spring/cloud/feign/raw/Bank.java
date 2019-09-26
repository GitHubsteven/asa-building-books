package com.asa.demo.spring.cloud.feign.raw;

import com.asa.demo.spring.cloud.bean.Account;
import feign.Param;
import feign.RequestLine;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 17:30 2019/9/26.
 */
public interface Bank {
    @RequestLine("POST /getAccount/{id}")
    Account getAccount(@Param("id") String id);
}