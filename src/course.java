package src;

import java.io.Serializable;
import java.util.ArrayList;

public class course implements Serializable{
	private String nameOfCourse;
	private int periodOfCourse;

	mark ma = new mark();
    ArrayList<mark> markList = new  ArrayList<mark>();
    
	public void setCourseName(String name) {
		this.nameOfCourse = name;
	}

	public String getCourseName() {
		return nameOfCourse;
	}

	public void setTimeOfCourse(int courseTime)

	{
		this.periodOfCourse = courseTime;

	}

	public int getTimeOfCourse() {

		return periodOfCourse;
	}
}
