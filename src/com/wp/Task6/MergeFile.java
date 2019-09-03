package com.wp.Task6;//to merge  files

import java.io.*;

public class MergeFile {
	public static void main(String[] args) throws IOException {

		// PrintWriter object for file3.txt
		PrintWriter pw = new PrintWriter("E:/C/Merge.txt");

		// BufferedReader object for file1.txt

		BufferedReader br1 = new BufferedReader(new FileReader("E:/C/file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("E:/C/file2.txt"));
		BufferedReader br3 = new BufferedReader(new FileReader("E:/C/file3.txt"));
		BufferedReader br4 = new BufferedReader(new FileReader("E:/C/file4.txt"));
		BufferedReader br5 = new BufferedReader(new FileReader("E:/C/file5.txt"));

		String line1 = br1.readLine();
		String line2 = br2.readLine();
		String line3 = br3.readLine();
		String line4 = br4.readLine();
		String line5 = br5.readLine();
		// loop to copy lines of
		// file1.txt and file2.txt
		// to file3.txt alternatively
		while (line1 != null || line2 != null || line3 != null || line4 != null || line5 != null) {
			if (line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}

			if (line2 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}

			if (line3 != null) {
				pw.println(line2);
				line3 = br3.readLine();
			}

			if (line4 != null) {
				pw.println(line2);
				line4 = br4.readLine();
			}

			if (line5 != null) {
				pw.println(line5);
				line5 = br5.readLine();
			}
		}

		pw.flush();
		pw.flush();

		// closing resources
		br1.close();
		br2.close();
		br3.close();
		br4.close();
		br5.close();
		pw.close();

		System.out.println("Merged file");
	}
}
