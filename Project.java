package com.mphasis.basis;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) throws IOException {
		int opration =0;
     
		Scanner sc =new Scanner(System.in);
		String path="C:\\Users\\hp\\eclipse-jyoti\\package com.mphasis.basics\\src\\com\\mphasis\\basis\\";
		while(true) {
			System.out.println("-----------------Welcome in LookMe.com----------------");
			System.out.println("If you want create File..       :    Press 1");
			System.out.println("If you want delete file         :    Press 2");
			System.out.println("if you want to display file     :    press 3 ");
			System.out.println("if you want to search file      :    press 4 ");
			System.out.println("If you want to close the System :    press 5");
			System.out.println();
			opration=sc.nextInt();
			
			switch(opration )
			{
			//create a file 

			case 1:
			{
				  
				  Scanner sc1=new Scanner(System.in);

				  ArrayList<String> al=new ArrayList<>();
				    while(true) {
				   System.out.println("Enter the file name to create");
				   String filename=sc.next();
				   String finalname=path+filename;
				   System.out.println(finalname);

			

				   File f=new File(finalname);
				   boolean b=f.createNewFile();
				    if(b!=true) {
					System.out.println("The file not created");
				         }
				  else {
					al.add(filename);
					System.out.println("File is created");
					break;
				    }

				System.out.println("Your file list is... "+ al);
				    }
			}
				   break;
			
			     
	case 2:
	{
		//delete file
	
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the file name to be deleted");
		String filname=sc.next();
		String finalfile=path+filname;
		File file=new File(finalfile);
		file.delete();
		System.out.println("file deleted");
	}
             break;
	
	case 3:
	{
		//display file
	
		File f=new File(path);
		File filename[]=f.listFiles();
		System.out.println("Your File List.......");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
	}
		break;
		

	
	case 4:
	{
		//search file
		
		File f1=new File(path);
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the file name to search");
		String filsearchname=sc.next();
		File filename1[]=f1.listFiles();
		int flag=0;
		for(File ff:filename1) {
			if(ff.getName().equals(filsearchname)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
			
			}

		if(flag==1) {
			System.out.println("Found the file");
		}
		else {
			System.out.println("File is not found");
		}
	}
		
			break;
			
	

	case 5:
		{
			System.out.println("System close...");
			
		}
	       break;
		
      default:System.out.println("check ur choice");
	      break;

		}
	}
}

}		
			
	
		

	

