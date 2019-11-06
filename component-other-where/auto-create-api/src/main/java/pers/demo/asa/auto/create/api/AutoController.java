package pers.demo.asa.auto.create.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 11:11 2019/10/30.
 */
@RestController
@RequestMapping("/auto")
public class AutoController {
    @GetMapping("/api1")
    public String api1() {
        return "auto api1";
    }
}