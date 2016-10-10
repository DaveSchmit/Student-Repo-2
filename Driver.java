import java.util.ArrayList;

import SoftwareAssignment1.SoftwareAssignment1.course;
import SoftwareAssignment1.SoftwareAssignment1.module;
import SoftwareAssignment1.SoftwareAssignment1.student;

import org.joda.time.LocalDate;


public class Driver 
{

	 public static void main(String[] args)
	 {
		
		 student Paul = new student("Paul", 21, new LocalDate("1994-12-21"));
		 student Sam = new student("Sam", 19, new LocalDate("1996-11-02"));
		 student Mick = new student("Mick", 20, new LocalDate("1996-08-22"));
		 
		 ArrayList<module> ScienceStream = new ArrayList<module>();
		 ArrayList<module> ArtsStream = new ArrayList<module>();
		 
		 module SS404 = new module("Law","SS404");
		 module SA210 = new module("SocPaul", "SA210");
		 module BS555 = new module("Physics","BS555");
		 module BI011 = new module("Biology", "BI011");
		 ArtsStream.add(SS404);
		 ArtsStream.add(SA210);
		 ScienceStream.add(BS555);
		 ScienceStream.add(BI011);
	
		 BS555.regStudent(Paul);
		 SA210.regStudent(Mick);
		 SS404.regStudent(Sam);
		 BI011.regStudent(Mick);
		 
		 course Arts = new course("Arts Stream", new LocalDate("2016-02-09") ,new LocalDate("2017-11-11"));
		 
		 course Science = new course("Science Stream", new LocalDate("2016-10-20") ,new LocalDate("2019-08-10"));
		 System.out.println(ArtsStream);
		 System.out.println(ScienceStream);
		 System.out.println(Arts);
		 System.out.println(Science);

	 }
	
}