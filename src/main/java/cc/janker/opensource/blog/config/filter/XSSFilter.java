package cc.janker.opensource.blog.config.filter;

/**
 * Created by zhiyongliu3 on 2017/8/30.
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class XSSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(
                (HttpServletRequest) request);

        chain.doFilter(xssRequest, response);
    }

    @Override
    public void destroy() {
    }

}
