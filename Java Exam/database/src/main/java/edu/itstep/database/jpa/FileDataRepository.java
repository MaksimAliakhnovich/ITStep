package edu.itstep.database.jpa;


import edu.itstep.database.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileDataRepository extends JpaRepository<FileData,Integer> {
    List<FileData> findByDescription(String description);
}
