package golf.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Apr 26, 2023
 */

@Entity
@Data
public class Course {
	@Id
	@GeneratedValue
	private long id;
	private String courseName;
	private String city;
	private String publicPrivate;
	private int holeAmount;
	
	/*
	// default no-arg constructor
	public Course() {
		super();
	}
	
	// other constructors
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	public Course(String courseName, String city, String publicPrivate) {
		super();
		this.courseName = courseName;
		this.city = city;
		this.publicPrivate = publicPrivate;
	}
	
	public Course(String courseName, String city, String publicPrivate, int holeAmount) {
		super();
		this.courseName = courseName;
		this.city = city;
		this.publicPrivate = publicPrivate;
		this.holeAmount = holeAmount;
	}

	public Course(int id, String courseName, String city, String publicPrivate, int holeAmount) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.city = city;
		this.publicPrivate = publicPrivate;
		this.holeAmount = holeAmount;
	}
	
	// getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPublicPrivate() {
		return publicPrivate;
	}

	public void setPublicPrivate(String publicPrivate) {
		this.publicPrivate = publicPrivate;
	}

	public int getHoleAmount() {
		return holeAmount;
	}

	public void setHoleAmount(int holeAmount) {
		this.holeAmount = holeAmount;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", city=" + city + ", publicPrivate=" + publicPrivate
				+ ", holeAmount=" + holeAmount + "]";
	}
	*/
}
