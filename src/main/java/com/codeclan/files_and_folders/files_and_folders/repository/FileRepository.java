package com.codeclan.files_and_folders.files_and_folders.repository;

import com.codeclan.files_and_folders.files_and_folders.models.File;
import com.codeclan.files_and_folders.files_and_folders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
