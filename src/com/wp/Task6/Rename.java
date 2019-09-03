package com.wp.Task6;

import java.io.File;
import java.util.Scanner;

public class Rename {
	static String path = "E:\\eclipse-workspace\\Task-06\\";

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file you want to change the name");
		String o = sc.nextLine().trim();
		File old = new File(o);
		System.out.println("Enter the name you want to give to your file");
		String n = sc.nextLine().trim();
		File newFile = new File(n);
		boolean oldExists = old.exists();
		System.out.println(oldExists);
		boolean newExist = newFile.exists();
		long size = old.length();
		if (oldExists == true) {
			System.out.println("Yes..this file exists");
			boolean isf = old.isFile();
			if (isf == true) {
				System.out.println(old + " " + "is a txt file");
				if (newExist == true) {
					System.out.println("File already exist please five another name");
				} else {

					if (size < 500) {
						old.renameTo(newFile);
						System.out.println("Succssfully changed the name to " + newFile);
					} else {
						System.out.println("The file is too large to be renamed");
					}

				}

			} else {
				System.out.println(old + " is not a valid txt file");
			}

		} else {
			File f1 = new File(path + o+".txt");
			f1.createNewFile();
			System.out.println("file created");
		}

	}

}
