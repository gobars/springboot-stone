package cn.bjca.footstone.springboot.stone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushaopeng
 * @date 2021/9/26 16:21
 */
@RestController
public class CossHealthController {

  @GetMapping(value = "/coss")
  public String check() {
    return "netWork is OK";
  }

}
