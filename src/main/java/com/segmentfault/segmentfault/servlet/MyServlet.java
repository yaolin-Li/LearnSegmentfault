package com.segmentfault.segmentfault.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(
        name="myServlet",
        urlPatterns = "/myservlet",
        initParams = {
                @WebInitParam(name = "myname", value = "myvalue")
        }
)
public class MyServlet extends HttpServlet {

    private String value;
    public void init(ServletConfig servletConfig){
        value = servletConfig.getInitParameter("myname");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer = resp.getWriter();
        writer.write("<html><body>hello,my value = "+value+"</body></html>");
    }
}
