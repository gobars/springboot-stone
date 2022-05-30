package cn.bjca.footstone.springboot.stone.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @RequestMapping
  public Map<String, Object> test() {
    Map<String, Object> result = new HashMap<>();
    result.put("message", "OK");
    result.put("status", 200);
    result.put("data", 1);
    return result;
  }

}
