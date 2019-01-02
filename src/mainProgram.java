import java.io.*; // for File 
import java.util.Arrays;
import java.util.Scanner;
public class mainProgram {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		Scanner course = new Scanner(new File("AllCourse"));
	
		String input = "";
		String courseid = " ";
		String id = " ";
		String studentinfo= " ";
		String line = " ";
		int count = 0;
		
//		File folder = new File("src/StudentInfo");
//		File[] listOfFiles = folder.listFiles();
		/*while(course.hasNextLine()){
			courseid = course.nextLine();
			Scanner lineScan = new Scanner(courseid);
			id = lineScan.next();
//			System.out.println(id);
		} */
		
	do {
		System.out.println("***************Courses Information Systems***************");
		System.out.println("Enter [d] : display all taking courses in this term ");
		System.out.println("Enter [n] : to see the courses will be open next term");
		System.out.println("Enter [s] : to see the student information");
		System.out.println("Enter [e] : to exit the program");
		System.out.println("*********************************************************");
		Scanner console = new Scanner(System.in);
		System.out.print("What you want to do? : ");
		input = console.next();
			//display all of courses that taking by each student in this term
		 if (input.equals("d")) {
			File folder = new File("src/StudentInfo");
			File[] listOfFiles = folder.listFiles();
				for (File a : listOfFiles){
					Scanner student = new Scanner(a);
					while(student.hasNextLine()){	
							studentinfo = student.nextLine();
							studentinfo = studentinfo.replaceAll("\"", "");

							String[] wordlist = studentinfo.split(",");
//							System.out.println(Arrays.toString(wordlist));
							 if(wordlist.length > 7)
								if(!wordlist[7].contains("CODE") && wordlist[7].contains("ITE") && !wordlist[11].contains("F")&& !wordlist[11].contains("W"))
									System.out.println(wordlist[7] + wordlist[11]);
							}		
					}	 
		 	//display the courses that will be opened next term
		 } else if (input.equals("n")) {
				System.out.println("Course that open next term");
			
			
			
			//display each student information, such as grade, taken courses,by input the student id 
		} else if (input.equals("s")){
				System.out.println("+++++Student information+++++");
				System.out.println("What you want to see?");
				System.out.println("Type [c] : to see enrolled courses");
				System.out.println("Type [y] : to see courses not registered yet");
				System.out.print("Type [c] or [y] : ");
				String enroll = console.next();
				
				if(enroll.equals("c")){
					System.out.println("Type Student ID: ");
					console.nextLine();
//					int studentid = console.nextInt();
					// add code here to check the student id
				
				
				} else if(enroll.equals("y")) {
					System.out.print("Type Student ID: ");
					int studentid = console.nextInt();
					// add code here to check the student id
				}	
		} else if (input.equals("e")){
				System.out.print("");
		} else 
				System.out.println("Sorry Please Type the Letter Correctly");
		 	
		}	while (!(input.equals("e")));
		System.out.println("Thank you, see you next time :)");
	}
}






















		/*for (int i = 0; i < listOfFiles.length; i++) {
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".txt")) {
		    String content = FileUtils.readFileToString(file);
		    // do something with content
		  } 
		}*/
//			while(student.hasNextLine()){
//				
//				studentinfo = student.nextLine();
//				Scanner scanStudent = new Scanner(studentinfo);
//				line = scanStudent.nextLine();
////				System.out.println(line);
//				String[] wordlist = line.split(",");
//						
//				if(wordlist.length > 7)
//					if(!wordlist[7].contains("CODE") && wordlist[7].contains("ITE") && !wordlist[11].contains("F")&& !wordlist[11].contains("W"))
//						System.out.println(wordlist[7] + wordlist[11]);
//				}	
//	}

