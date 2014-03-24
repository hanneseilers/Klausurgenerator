package de.hanneseilers.klausurgenerator.core;

import java.util.Date;

public class Exam {
	
	private String name = "";
	private Date date = new Date();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return	{@link String} representation of this exam
	 */
	public String toString(){
		return getName();
	}

}
