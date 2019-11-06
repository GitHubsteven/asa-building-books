package pers.demo.asa.out.api.service;

import org.springframework.stereotype.Service;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 18:16 2019/10/30.
 */
@Service
public class ApiServiceImpl implements IApiService {
    @Override
    public String api() {
        return "service api result";
    }
}