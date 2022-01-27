package com.assessment.step1;

import java.io.FileNotFoundException;

public interface FileInfo {

	public void showAllFiles();
	public void addFile();
	public void deleteFile();
	abstract void searchFile() throws FileNotFoundException;
}