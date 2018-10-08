package org.itstep.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doLogin(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doLogin(req, resp);
    }

    private void doLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getSession().setAttribute("auth", false);
        resp.setCharacterEncoding("UTF-8");

        final String LOGIN_ALLOW = "mk.92@mail.ru";
        final String PASSWORD_ALLOW = "1";

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if ((LOGIN_ALLOW.equals(login)) && (PASSWORD_ALLOW.equals(password))) {
            req.getSession().setAttribute("auth", true);
            resp.sendRedirect("/jsp/upload.jsp");
        } else {
            req.setAttribute("auth_error", "Неверный логин или пароль.");
            getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
        }
    }
}
