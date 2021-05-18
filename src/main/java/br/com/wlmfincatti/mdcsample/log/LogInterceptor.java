package br.com.wlmfincatti.mdcsample.log;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class LogInterceptor implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        MDC.put("request.ip", servletRequest.getRemoteAddr());
        MDC.put("request.id", httpRequest.getHeader("x-request-id"));
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
