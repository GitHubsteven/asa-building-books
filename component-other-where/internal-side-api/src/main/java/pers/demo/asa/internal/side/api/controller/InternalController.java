package pers.demo.asa.internal.side.api.controller;

import com.google.common.collect.Lists;
import org.checkerframework.common.value.qual.IntRange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.demo.asa.auto.create.api.AutoController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 10:13 2019/10/30.
 */
@RestController
@RequestMapping("/internal")
public class InternalController {
    @GetMapping("/api1")
    public String api1() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("item" + i);
        }
        List<List<String>> partition = Lists.partition(list, 3);
        return partition.size() + "partition";
    }
}