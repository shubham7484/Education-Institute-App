package com.multithreading.EducationInstituteApp;

public class Student 
{
	String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) 
	{
		super();
		this.name = name;
		this.institute = institute;
	}
	public void viewCoursesAndFees()
	{
		System.out.println("Available Courses");
		Course[] courses = institute.getCourses();
		
		for(Course course : courses)
		{
			System.out.println(course);
		}
		System.out.println("============================================");
	}
	
	public void viewOffers()
	{
		System.out.println("Avaialable Offers");
		Offer[] offers = institute.getOffers();
		for(Offer offer : offers)
		{
			System.out.println(offer);
		}
		System.out.println("============================================");
	}
	
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
	}	
}