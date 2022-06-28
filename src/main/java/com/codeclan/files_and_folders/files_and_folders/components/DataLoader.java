package com.codeclan.files_and_folders.files_and_folders.components;

import com.codeclan.files_and_folders.files_and_folders.models.File;
import com.codeclan.files_and_folders.files_and_folders.models.Folder;
import com.codeclan.files_and_folders.files_and_folders.models.Person;
import com.codeclan.files_and_folders.files_and_folders.repository.FileRepository;
import com.codeclan.files_and_folders.files_and_folders.repository.FolderRepository;
import com.codeclan.files_and_folders.files_and_folders.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Person person1 = new Person("Person1");
        personRepository.save(person1);

        Person person2 = new Person("Person2");
        personRepository.save(person2);

        Person person3 = new Person("Person3");
        personRepository.save(person3);



        Folder folder1 = new Folder("Folder1", person1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Folder2", person1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Folder3", person1);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Folder4", person2);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("Folder5", person2);
        folderRepository.save(folder5);

        Folder folder6 = new Folder("Folder6", person3);
        folderRepository.save(folder6);



        File file1 = new File("file1",".txt",64, folder1);
        fileRepository.save(file1);

        File file2 = new File("file2",".svg",640, folder1);
        fileRepository.save(file2);

        File file3 = new File("file3",".jpg",256, folder2);
        fileRepository.save(file3);

        File file4 = new File("file4",".pdf",512, folder2);
        fileRepository.save(file4);

        File file5 = new File("file5",".png",56, folder3);
        fileRepository.save(file5);

        File file6 = new File("file6",".doc",512, folder4);
        fileRepository.save(file6);

        File file7 = new File("file7",".java",320, folder4);
        fileRepository.save(file7);

        File file8 = new File("file8",".rb",768, folder5);
        fileRepository.save(file8);

        File file9 = new File("file9",".py",350, folder5);
        fileRepository.save(file9);

        File file10 = new File("file10",".iso",64, folder6);
        fileRepository.save(file10);

        File file11 = new File("file11",".dll",16, folder6);
        fileRepository.save(file11);

        folder1.addFile(file1);
        folder1.addFile(file2);

        folder2.addFile(file3);
        folder2.addFile(file4);

        folder3.addFile(file5);

        folder4.addFile(file6);
        folder4.addFile(file7);

        folder5.addFile(file8);
        folder5.addFile(file9);

        folder6.addFile(file10);
        folder6.addFile(file11);



    }
}
