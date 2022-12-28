package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class whileCondition {

	public static void main(String[] args) {

	
		boolean condition = true;
		boolean condation1 = true;
		boolean condation2 = true;

		 // to let the user insert the values 
		Scanner SC = new Scanner(System.in);
        Stack<String>StackList= new Stack();
        
// arrayListDepartment
		ArrayList<Department> departmentArray = new ArrayList<Department>();

		while (condition) {
//each number in this condition will do something
			System.out.println("press 1 to fill questions");
			System.out.println("press 2 to exit the page");
			System.out.println("press 3 to print the results ");
			System.out.println("press 4 to print the history ");
			System.out.println("press 5 to search the history ");
			
			int input = SC.nextInt();
			
			if (input == 1) {
				
				//This is the first constract
				Department de = new Department();
				System.out.println("Enter the Department ID");
				int idOfDepartment =SC.nextInt();
				de.setIdOfDepartment(idOfDepartment);
			    String iddep= Integer.toString(idOfDepartment);
				StackList.push(iddep);
                
				
				System.out.println("Enter the Department NAME");
				String nameString = SC.next();
				de.setNameOfDepartment(nameString);
				StackList.push(nameString);
				 
				//condition 1 to enter teacher details

				condation1 = true;

				while (condation1) {
					teacher te = new teacher();
					System.out.println("Enter the name of teacher");
					String tName = SC.next();
					te.setteName(tName);
					StackList.push(tName);


					System.out.println("Enter the age of teacher");
					Integer age=SC.nextInt();
					te.setteAge( age);
					StackList.push(age.toString());

					//condition 2 to enter student details
                     condation2=true;
					while (condation2) {
						Student st = new Student();
						System.out.println("Enter the student name");
						String sName=SC.next();
						st.setName(sName);
						StackList.push(sName);
					

						System.out.println("Enter the gender of student");
						String gStudent=SC.next();
						st.setStugender(gStudent);
						StackList.push(gStudent);

						
						
						

						boolean condation3 = true;
						while (condation3) {
							course co = new course();
							
							System.out.println(" Enter the name of the course");
							String nCourse=SC.next();
							co.setCourseName(nCourse);
							StackList.push(nCourse);
							
							
							System.out.println(" Enter the period of the course");
							Integer yy=SC.nextInt();
							co.setTimeOfCourse(yy);
							StackList.push(yy.toString());

							boolean condation4 = true;
							while (condation4) {
								mark ma = new mark();
								System.out.println(" Enter the math mark please");
								Integer mMArk=SC.nextInt();
								ma.setMathMark(mMArk);
								StackList.push(mMArk.toString());
								
								
								System.out.println(" Enter the IT mark please");
								Integer itMark=SC.nextInt();
								ma.setITMark(itMark);
								StackList.push(itMark.toString());
								co.markList.add(ma);

								System.out.println("Do you want to add mark again yes / no");
								String w = SC.next();

								if (w.equals("yes")) {
									System.out.println("Enter the details of the mark");
								} else if (w.equals("no")) {
									condation4 = false;
								}

							}
							st.courseList.add(co);
							System.out.println("Do you want to add others course yes / no");
							String ww = SC.next();
							
							if (ww.equals("yes")) {
								System.out.println("Enter the details of course");
							} else if (ww.equals("no")) {
								condation3 = false;
							}

						}

						System.out.println("Do you want add another student yes / no ");

						String zz = SC.next();
						te.studentList.add(st);
						if (zz.equals("yes")) {
							System.out.println("Enteryhe details of student");
						} else if (zz.equals("no")) {

							condation2 = false;
						}
						
						//Testing git

					}

					de.teacherArray.add(te);

					System.out.println("Do you want add another teacher yes / no ");
					String z = SC.next();
					if (z.equals("yes")) {

						System.out.println("Enter the new teacher details ");

					} else if (z.equals("no")) {
						condation1 = false;
					}

				}
				departmentArray.add(de);
				System.out.println("Do you want add another department yes / no ");
				String z = SC.next();

				if (z.equals("no")) {
					input = 1;
				}

			
			}

			if (input == 2) {
				System.out.println("goodbye");
				condition = false;

			}

			else if(input ==4)
			{
				System.out.println("the hisotry");
				for(String s:StackList )
				{
					System.out.println(s);
				}
				
				
				try 
				{
					BufferedWriter writer= new BufferedWriter(new FileWriter("output.txt"));
					writer.write("\nthis is your history list");
					for(String v :StackList )
					{
						writer.write("\n" + v);
					}
					writer.close();
				}
				catch (IOException o) 
				{
					o.printStackTrace();
				}
			}
			
				else if(input == 5) {
				
					try {
					BufferedReader br= new BufferedReader(new FileReader("output.txt"));
					System.out.println("Enter the word to search");
					String searchWord =SC.next();
					String s;
					int count=0;
					
					while((s=br.readLine())!=null)
					{
						if(s.equals(searchWord))
						{
							count++;
						}
						
					}
				if(count!=0)
				{
					System.out.println("The given word is present for " +count+ " Times in the file");
				}
				else
				{
					System.out.println("the given word is not present in the file");
				}
				br.close();
			}
					catch(IOException except)
					{
						except.printStackTrace();
					}
				}
			
			
		
			
			else if (input == 3) {

				for (Department element : departmentArray) {
					System.out.println("---------- department Details ------------");
					System.out.println("the Department name is " + element.getNameOfDepartment());
					System.out.println("the Department ID is " + element.getIdOfDepartment());
					System.out.println("---------------<>---------------");

					
					for (teacher elementT : element.teacherArray) {
						System.out.println("---------- Techer Details -------------");
						System.out.println("The Teacher name is: " + elementT.getteName());
						System.out.println("The Teacher age is: " + elementT.getteAge());
						System.out.println("---------------<>---------------");

						
						
						for (Student elementS : elementT.studentList) {
							System.out.println("---------- Student Details -------------");
							System.out.println("The Name of student is " + elementS.getName());
							System.out.println("The gender of student is " + elementS.getStugender());
							System.out.println("---------------<>---------------");


							for (course elementSS : elementS.courseList) {
								System.out.println("---------- Course Details -------------");
								System.out.println("The course name is " + elementSS.getCourseName());
								System.out.println("The period of course is " + elementSS.getTimeOfCourse());
								System.out.println("---------------<>---------------");


								for (mark elementsR : elementSS.markList) {
									System.out.println("---------- mark Details -------------");

									System.out.println("The math mark is " + elementsR.getMathMark());
									System.out.println("The IT mark is " + elementsR.getITMark());
									System.out.println("---------------<>---------------");


								}

							}

						}

					}
				}
			}

		}
	}
}
