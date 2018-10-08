package edu.itstep.database.controllers;

import edu.itstep.database.dto.File;
import edu.itstep.database.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.DataOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

@Controller
@RequestMapping(value = "/file")
public class FileControllers {

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "description", required = false) String description, Model model)
            throws IOException, SQLException {
        File uploadFile = new File();
        uploadFile.setPath(fileService.setServerPath());
        uploadFile.setName(file.getOriginalFilename());
        uploadFile.setFile(file.getBytes());
        uploadFile.setDescription(description);
        fileService.saveFile(uploadFile);
        //fileService.
//        model.addAttribute()
        return "success_upload";
    }

/*    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addFile() {
        return "upload";
    }*/

/*    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getFile(@RequestParam(value = "") String description) throws IOException, SQLException {
        File file = new File();
        file.setDescription(description);
        File findfile = fileService.loadFile(file);
        DataOutputStream os = new DataOutputStream(new FileOutputStream("d:\\binout.jpg"));
        os.write(findfile.getFile());
        os.close();
        return "succsessUpload";
    }*/
}
