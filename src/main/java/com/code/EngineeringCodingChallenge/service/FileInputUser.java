package com.code.EngineeringCodingChallenge.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInputUser {
	public static List<String> fileFromUser() {
		List<String> s = new ArrayList<String>();
		try {
			File myObj = new File(
					"C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\EngineeringCampCoding\\src\\items1.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				s.add(data);

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return s;
	}
}
