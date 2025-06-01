package com.my_main.a7_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B2_CopyFiles {

	public static void main(String[] args) throws IOException {

		Path srcFile = Paths.get("src/sample.txt");
		Path newCopiedFile = Paths.get("TestFolder/sample-copied-file.txt");

		if (Files.notExists(newCopiedFile)) {
			Files.copy(srcFile, newCopiedFile);
			System.out.println("File Copied");
		} else {
			System.out.println("File was already there. ");
		}

	}

}
