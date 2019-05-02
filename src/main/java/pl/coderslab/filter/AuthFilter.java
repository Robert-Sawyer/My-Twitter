package pl.coderslab.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpSession session = ((HttpServletRequest) req).getSession();
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            ((HttpServletResponse) resp).sendError(HttpServletResponse.SC_FORBIDDEN, "You are not authorized");
        } else {
            chain.doFilter(req, resp);
        }
    }
    //pobieramy sesję, rzutujemy na HttpServletrequest, bo nie możemy pobrać tej klasy, bo implementujemy interfejs, któ©y nie posaida metody z HttpServlet, tylko
    //z ServletRequest i ServletResponse. tworzymy Longa i pobieramy do niego z sesji Id zalogowanego usera. jeżeli nie ma id

    public void init(FilterConfig config) throws ServletException {

    }

}
