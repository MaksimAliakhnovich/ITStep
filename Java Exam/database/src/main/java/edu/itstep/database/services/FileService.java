package edu.itstep.database.services;


import edu.itstep.database.dto.File;
import edu.itstep.database.entity.FileData;
import edu.itstep.database.jpa.FileDataRepository;
import org.aspectj.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    @Autowired
    FileDataRepository fileDataRepository;

    public String setServerPath() {
        Path path = Paths.get("D:\\tmp\\");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }

//        new java.io.File("D:\\tmp").mkdir();
        return path.toString();
    }

    public FileData saveFile(File file) throws SQLException {
        FileData fileData = new FileData();
        fileData.setName(file.getName());
        fileData.setPath(file.getPath());
        fileData.setDescription(file.getDescription());

        try {
            OutputStream out = new FileOutputStream(new java.io.File(file.getPath() + "\\" + file.getName()));
            out.write(file.getFile());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileDataRepository.save(fileData);
    }

    public List<FileData> getAllFile() {
        return fileDataRepository.findAll();
    }

/*    public File loadFile(File file) {
        List<FileData> newFileData = fileDataRepository.findByDescription(file.getDescription());
        FileData tmp = newFileData.stream().findFirst().get();
        return new File(tmp.getDescription());
    }*/
}
