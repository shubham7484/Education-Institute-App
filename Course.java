package com.multithreading.EducationInstituteApp;

public class Course 
{
	private int courseId;
	private String name;
	private double fee;
	
	public Course(int courseId, String name, double fee) 
	{
		super();
		this.courseId = courseId;
		this.name = name;
		this.fee = fee;
	}

	public int getCourseId() 
	{
		return courseId;
	}

	public String getName() 
	{
		return name;
	}

	public double getFee() 
	{
		return fee;
	}

	@Override
	public String toString() 
	{
		return "Course [courseId=" + courseId + ", name=" + name + ", fee=" + fee + "]";
	}	
}