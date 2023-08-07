package cn.bjca.footstone.springboot.stone;

import cn.bjca.footstone.springboot.stone.controller.Request;
import com.alibaba.fastjson2.JSON;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebServlet(urlPatterns = "/http/servlet")
public class PostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Request r = JSON.parseObject(req.getInputStream(), Request.class);
        resp.getWriter().print(r.getPlainText().length());
    }
}
