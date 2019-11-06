package pers.demo.asa.out.side.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.demo.asa.out.api.service.IApiService;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 10:27 2019/10/30.
 */
@RestController
@RequestMapping("/outside")
public class OutSideController {
    private final IApiService iApiService;

    public OutSideController(IApiService iApiService) {
        this.iApiService = iApiService;
    }

    @GetMapping("/api1")
    public String api1() {
        return "outside api1" + "from service result: " + iApiService.api();
    }
}