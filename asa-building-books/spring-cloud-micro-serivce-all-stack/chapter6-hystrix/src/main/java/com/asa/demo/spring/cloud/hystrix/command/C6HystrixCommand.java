package com.asa.demo.spring.cloud.hystrix.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 10:06 2019/9/27.
 */
public class C6HystrixCommand extends HystrixCommand<String> {
    private final String name;

    protected C6HystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        return this.name + ": " + Thread.currentThread().getName();
    }
}