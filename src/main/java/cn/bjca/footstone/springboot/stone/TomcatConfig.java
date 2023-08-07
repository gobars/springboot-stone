package cn.bjca.footstone.springboot.stone;

import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

public class TomcatConfig {
    /*
    // spring boot 1.x
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
        TomcatEmbeddedServletContainerFactory f = new TomcatEmbeddedServletContainerFactory();
        f.addConnectorCustomizers((c) -> {
            ProtocolHandler h = c.getProtocolHandler();
            if (h instanceof Http11NioProtocol) {
                Http11NioProtocol p = (Http11NioProtocol) h;
                p.setKeepAliveTimeout(60000);// millisecond
                p.setMaxKeepAliveRequests(60000);
            }
        });
        return f;
    }*/
}
