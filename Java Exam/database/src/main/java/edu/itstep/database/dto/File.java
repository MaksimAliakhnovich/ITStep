package edu.itstep.database.dto;

public class File {

    byte[] file;
    String name;
    String path;
    String description;

    public File() {
    }

    public File(byte[] file, String name, String path, String description) {
        this.file = file;
        this.name = name;
        this.path = path;
        this.description = description;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
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
