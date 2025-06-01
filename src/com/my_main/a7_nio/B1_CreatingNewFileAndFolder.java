package com.my_main.a7_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B1_CreatingNewFileAndFolder {

	public static void main(String[] args) {

		try {
			Path path = Paths.get("src/SampleCreate.txt");

			if (Files.notExists(path)) {
				Files.createFile(path);
				System.out.println("New File created.");
			} else {
				System.out.println("File was aleadry present: " + path);
			}

			System.err.println("Priniting all files.");
			Path pathOfRootProj = Paths.get("");
			Files.list(pathOfRootProj).filter(file -> !Files.isDirectory(file)).forEach(System.out::println);

			// creating new directory / folder

			Path foldername = Paths.get("TestFolder");
			if (Files.notExists(foldername)) {
				Files.createDirectories(foldername);
				System.out.println("Folder is created.");
			} else {
				System.out.println("Folder was already present: " + foldername);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
