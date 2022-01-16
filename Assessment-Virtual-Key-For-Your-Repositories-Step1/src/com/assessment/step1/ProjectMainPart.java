package com.assessment.step1;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class ProjectMainPart {

	public static void main(String[] args) {
		introPage();
		try {
			menuDriven();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}

	
	
	 //Function for displaying the welcome page on the console
	 
	private static void introPage() {
		
		System.out.println("\t\t   ** Welcome **"
		+"\n\n  This Application is Developed by Vishwanath Mangond");
		System.out.println("*-----------------------------------------------------*");
	}

	
	 // This function is used for keep the menu for user interaction
	 // @throws FileNotFoundException 
	 
	private static void menuDriven() throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		FileOperations obj = new FileOperations();
		int option;
		
		do {
		System.out.println("\nSelect any one of the below option: \n");
		System.out.println("1. To review the fileNames");
		System.out.println("2. File Operation menu");
		System.out.println("3. Exit\n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("File Operation menu"+"\n\nSelect any one of the below option");
			System.out.println("\n1. To add a file");
			System.out.println("2. To Delete a file");
			System.out.println("3. To Search a file");
			System.out.println("4. Exit\n");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the file opearation menu");
				break;
			default:
				System.out.println("You have entered an Invalid option");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exited from the Application");
			break;
		default:
			System.out.println("You have entered an Invalid option");
		}

		}while(option!=3);

	}
}