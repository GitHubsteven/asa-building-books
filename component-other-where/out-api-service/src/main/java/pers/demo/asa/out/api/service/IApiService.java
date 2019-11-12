package pers.demo.asa.out.api.service;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 18:15 2019/10/30.
 */
public interface IApiService {
    String api();

    /**
     * @param name 名字
     * @return 结果
     */
    String testApi(String name);
}