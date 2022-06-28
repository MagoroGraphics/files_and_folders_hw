package com.codeclan.files_and_folders.files_and_folders;

import com.codeclan.files_and_folders.files_and_folders.repository.FileRepository;
import com.codeclan.files_and_folders.files_and_folders.repository.FolderRepository;
import com.codeclan.files_and_folders.files_and_folders.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

}
