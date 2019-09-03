package com.wp.Task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Delete {
	public static void main(String args[]) throws Exception {
		File f = new File("E:\\C\\file2.txt");
		BufferedReader bt = new BufferedReader(new FileReader(f));
		String st;
		while ((st = bt.readLine()) != null) {
			System.out.println(st);
//System.out.println("Line--- " + line);

		}
		bt.close();
		Path path = Paths.get("E:\\C\\file2.txt");

		if (Files.deleteIfExists(path)) {
			System.out.println("file deleted");
		}
	}
}
