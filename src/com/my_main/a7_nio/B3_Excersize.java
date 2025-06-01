package com.my_main.a7_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B3_Excersize {

	// Create empty file example.txt inside FolderA.
	// Copy file to FolderB
	// List of the contents of folderB to check that your file is there.

	public static void main(String[] args) {

		Path folderA = Paths.get("src/FolderA");
		Path folderB = Paths.get("src/FolderB");

		Path exampleFile = Paths.get("example.txt");

		Path srcFilePath = Paths.get(folderA.toString(), exampleFile.toString());
		Path destinationFilePath = Paths.get(folderB.toString(), exampleFile.toString());

		try {
			if (Files.notExists(folderA)) {
				Files.createDirectory(folderA);
			}

			if (Files.notExists(srcFilePath)) {
				Files.createFile(srcFilePath);
			}

			if (Files.notExists(folderB)) {
				Files.createDirectory(folderB);
			}

			if (Files.notExists(destinationFilePath)) {
				Files.copy(srcFilePath, destinationFilePath);
			}

			Files.list(folderB).forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
