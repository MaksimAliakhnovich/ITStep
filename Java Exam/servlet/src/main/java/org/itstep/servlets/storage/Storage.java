package org.itstep.servlets.storage;

import java.util.TreeMap;
import java.util.concurrent.atomic.LongAdder;

public class Storage {

    private static Storage instance;

    private LongAdder longAdder = new LongAdder();

    TreeMap<Integer, StorageFile> storageBase = new TreeMap<>();

    private Storage() {
    }

    private StorageFile addFile(String filePath, String fileName, String fileDescription) {
        StorageFile storageFile = new StorageFile();
        storageFile.setFilePath(filePath);
        storageFile.setFileName(fileName);
        storageFile.setFileDescription(fileDescription);
        return storageFile;
    }

    public void addPosition(String filePath, String fileName, String fileDescription) {
        instance.longAdder.increment();
        int tempKey = Storage.instance.longAdder.intValue();
        storageBase.put(tempKey, addFile(filePath, fileName, fileDescription));
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

}
