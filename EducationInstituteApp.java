package com.multithreading.EducationInstituteApp;

import java.util.Scanner;

public class EducationInstituteApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		Course [] courses = new Course[3];
		courses[0] = new Course(111, "Java", 25000);
		courses[1] = new Course(222, ".Net", 25000);
		courses[2] = new Course(333, "Python", 25000);

		Offer []offers = new Offer[2];
		offers[0] = new Offer("Special discount: Get 20% off on all courses!");
		offers[1] = new Offer("Limited time offer: Enroll in any two courses and get one course free!");

		EducationInstitute e = new EducationInstitute(courses, offers);

		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Enter student name : ");
				String name = sc.nextLine();
				Student s1 = new Student(name, e);
				s1.viewCoursesAndFees();
				s1.viewOffers();
				System.out.println("Enter course Id : ");
				int courseId = sc.nextInt();			
				s1.enrollInCourse(courseId);
			}
		};

		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Enter student name : ");
				String name1 = sc.nextLine();
				name1 = sc.nextLine();
				Student s2 = new Student(name1, e);
				s2.viewCoursesAndFees();
				s2.viewOffers();
				System.out.println("Enter course Id : ");
				int courseId = sc.nextInt();			
				s2.enrollInCourse(courseId);
			}
		};

		t1.start();
		t1.join();
		t2.start();
	}
}