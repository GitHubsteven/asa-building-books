package pers.demo.asa.sub.module.service;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 14:54 2019/11/1.
 */
public class TestMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            numbers.add(i);
        }
        List<List<Integer>> parts = Lists.partition(numbers, 2);
    }
}