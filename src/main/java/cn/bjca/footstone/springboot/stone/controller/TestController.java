package cn.bjca.footstone.springboot.stone.controller;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/servlet")
    public int servlet(HttpServletRequest request) throws IOException {
        String s = Streams.asString(request.getInputStream());
        Request r = objectMapper.readValue(s, Request.class);
        return r.plainText.length();
    }
    @RequestMapping("/postJSON")
    public int raw(@Validated @RequestBody Request request) {
        return request.plainText.length();
    }

    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


    @RequestMapping("/jackson")
    public int jackson(@Validated @RequestBody String request) throws IOException {
        Request r = objectMapper.readValue(request, Request.class);
        return r.plainText.length();
    }

    @RequestMapping("/fastjson2")
    public int fastjson(@Validated @RequestBody String request) {
        Request r = JSON.parseObject(request, Request.class);
        return r.plainText.length();
    }

    @RequestMapping("/getJSONRaw")
    public Map<String, Object> getJSON() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "OK");
        result.put("status", 200);
        return result;
    }

    @RequestMapping("/postString")
    public int postString(@RequestBody String request) {
        return request.length();
    }

    @RequestMapping("/getString")
    public String getString() {
        return "OK";
    }

}
