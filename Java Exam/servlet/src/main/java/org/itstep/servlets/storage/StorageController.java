package org.itstep.servlets.storage;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@MultipartConfig(location = "D:\\tmp")
@WebServlet(value = "/jsp_storage")
public class StorageController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Part uploadFile = req.getPart("uploadFile");
        String fileName = uploadFile.getSubmittedFileName();
        String filePath = "D:\\tmp\\" + fileName;
        String fileDescription = req.getParameter("fileDescription");
        uploadFile.write(fileName);

        Storage storage = Storage.getInstance();
        storage.addPosition(filePath, fileName, fileDescription);

        req.setAttribute("storageList", storage.storageBase);
        getServletContext().getRequestDispatcher("/jsp/upload.jsp").forward(req, resp);

    }
}
