package edu.itstep.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "file_data")
public class FileData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="file_id")
    Integer fileId;
    String name;
    String path;
    String description;

    public FileData() {
    }

    public FileData(String name, String path, String description) {
        this.name = name;
        this.path = path;
        this.description = description;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
