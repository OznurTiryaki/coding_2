package day39_May6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TextFileToList{

	public static void main(String[] args) {

	    List<String> lineLst = getTextFileAsList("hero2.txt");
	    System.out.println(lineLst);
	    
	    System.out.println(lineLst.size());
	   
	    //xls  doc  ppt  pdf  gow we can know which kind of file
	   String s = "erat_quisque_erat.xls";
        //how do we just get file extention
	   
	   String fileExtention= s.substring(s.indexOf(".")+1);
	   
	   System.out.println(fileExtention);   // it gave us xls
	   
	   int count=0;
	   for (String each :lineLst) {
		   
		 //  System.out.println(each);  //to see item without Array
		  
		   String fileExt= each.substring(each.indexOf(".")+1);
		   
		   if(fileExt.equals("xls")) {   //or u can use endsWith Method
			                              //if we use contains it will us confused
			                              //like pdfdocpptxls.pdf de olabilir bunu iceriyor ama pdf file
			   count++;
		   }
	   }
		   System.out.println("Excel count is : "+ count);
		   
		//Task 2, find out the longest file Name
		   
		   String longest = lineLst.get(0);
		   
		   for (String eachs  :lineLst ) {
		   if(eachs.length()>longest.length()) {
		   longest= eachs;
		   
		   }   
	   }
		 System.out.println("Longest file name : " + longest );
	
	
	//Task 3 : Find out Longest Excel FIle 
	
	String longestExcel= ""; //lineLsr.get (0);
	 for (String each  :lineLst ) {
		 if(each.endsWith(".xlx")&& (each.length() >longestExcel.length())) {
			 longestExcel =each;
		 }
	 }
	    System.out.println(longestExcel);
	
	
	    
	  /*
	   * DO NOT MODIFY AND JUST USE IT
	   * Method name : getTextFileAsList
	   * @parameter  location of text file as String
	   *   if your file is at root path (right under project folder)
	   *  you may directly path your filename.txt
	   *  if not pass /your/own/folder/name/filename.txt as String to method
	   * 
	   * @return List of String that contain each line as per element

	   */
}
	  public static List<String> getTextFileAsList(String filePath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(filePath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

	  }
	}