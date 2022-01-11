package br.com.example.testeapi.token;

import org.apache.catalina.util.ParameterMap;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Map;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RefreshTokenCookiePreProcessorFilter implements Filter {

    public static final String URL_TOKEN_OAUTH = "/oauth/token";
    public static final String PARAMETRO_REFRESH_TOKEN = "refresh_token";
    public static final String PARAMETRO_GRANT_TYPE = "grant_type";
    public static final String COOKIE_REFRESH_TOKEN = "refreshToken";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        if (URL_TOKEN_OAUTH.equalsIgnoreCase(request.getRequestURI())
                && PARAMETRO_REFRESH_TOKEN.equals(obterValorGrantType(request))
                && request.getCookies() != null) {

            for (Cookie cookie : request.getCookies()) {
                if (COOKIE_REFRESH_TOKEN.equals(cookie.getName())) {
                    String refreshToken = cookie.getValue();
                    request = new MyServletRequestWrapper(request, refreshToken);
                }
            }
        }
        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {

    }

    private String obterValorGrantType(HttpServletRequest request) {
        return request.getParameter(PARAMETRO_GRANT_TYPE);
    }

    static class MyServletRequestWrapper extends HttpServletRequestWrapper {

        private String refreshToken;

        public MyServletRequestWrapper(HttpServletRequest request, String refreshToken) {
            super(request);
            this.refreshToken = refreshToken;
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            ParameterMap<String, String[]> parameterMap = new ParameterMap<>(getRequest().getParameterMap());
            parameterMap.put(PARAMETRO_REFRESH_TOKEN, new String[] { refreshToken });
            parameterMap.setLocked(true);
            return parameterMap;
        }
    }
}
