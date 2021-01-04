package com.shashi.test;

import com.shashi.beans.Student;

public class Tester {
public static void main(String[] args) {
	// this is the tester class  
	//now i am creating the object for the student class in the devloper computer
	Student st= new Student();
	//  now just call the method 
	String s=st.studentDetail(10, "shashi");
System.out.println(s);
}
}
