/**
 * 
 */
package com.ss.java.sept15;

import java.io.File;
import java.io.IOException;

/**
 * @author jswen
 *
 */
public class DirectoryList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DirectoryList listDir = new DirectoryList();
		try {
			//had to search this up, but allows me to get the canonical (not absolute) path
			String currentDirectory = new File(".").getCanonicalPath();
			File currentDir = new File(currentDirectory); //create File instance in your current directory
			File [] listFiles = currentDir.listFiles(); //generates a list of all file objects in current location
			listDir.printDirectory(listFiles,0); //method i wrote
		} catch (IOException e) { // in case the path does not exist
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printDirectory(File[] fileList, Integer spacing) {
		for(Integer position = 0; position<fileList.length; position++) {
			for(int k=0; k<spacing; k++) { //mostly used spacing for neatness/ to help myself
				System.out.print("      "); // keep track of sub-directories
			}
			if(fileList[position].isFile()) { //if the current index of fileList is an actual file
				System.out.println("--" + fileList[position].getName());//just print out the file's name using getName();
			}
			else if(fileList[position].isDirectory()) {//if the current index of fileList is a directory
				System.out.println("[]" + fileList[position].getName());//print out the directory name
				printDirectory(fileList[position].listFiles(), spacing+1);//recurse through this method,
																		  //using the new directorie's 
																		  //listFiles and 1 addition spacing
			}
		}
	}
}
