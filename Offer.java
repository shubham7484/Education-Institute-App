package com.multithreading.EducationInstituteApp;

public class Offer 
{
	String offerText;

	public Offer(String offerText) 
	{
		super();
		this.offerText = offerText;
	}
	
	public String getOfferText()
	{
		return offerText;
	}

	@Override
	public String toString() {
		return "Offer [offerText=" + offerText + "]";
	}	
	
	
}