package com.assessment.step1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations implements FileInfo  {
	
	List<String> retrieve= new ArrayList<String>();
	
	File[] files = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Assessment-Virtual-Key-For-Your-Repositories-Step1").listFiles();

	@Override
	public void showAllFiles() {
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				retrieve.add(file.getName());
			}
		}
		retrieve.forEach(System.out::println);
	}

	@Override
	public void addFile() {
		
		System.out.println("Enter the file which you want to add:");
		
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		
		try {
			if(F.createNewFile()) {
				System.out.println(filename+" file added successfully");
				Desktop.getDesktop().edit(F);
			}
			else {
				System.out.println("This file is already present");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	

	}

	@Override
	public void deleteFile() {
		
		System.out.println("Enter the file which you want to delete: \n");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		
		if(F.delete())
			System.out.println(filename+" got Deleted \n");
		else
			System.out.println("File Not Found\n");
		System.out.println("------------------------------------------");
	}
	
	@Override
	public void searchFile() {
		
		try {	
			Scanner scan= new Scanner(System.in);
			
			File directory = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Assessment-Virtual-Key-For-Your-Repositories-Step1");

			System.out.println("Enter the file name which you want to search: \n");
			String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                	
        				File f= new File(fileName);
        				Scanner sc1 = new Scanner(f);
        				while(sc1.hasNextLine()) {
        					
        				System.out.println(sc1.nextLine());
        				}
        			flag=1;	
                }
			}
            
        if(flag==0) {
        	System.out.println("File not found\n");
        	System.out.println("---------------------------------------");
        }

		}
		catch(FileNotFoundException ex) {
			System.out.println("file not found\n");
			System.out.println("-----------------------------------------");
		}

	}
}
