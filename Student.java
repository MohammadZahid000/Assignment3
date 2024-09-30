package module6;

public class Student {
	
	private int rollNo;
	private String name;
	private double score;
	
	public Student() {
//	System.out.println(" this is default constructor");
		rollNo=0;
		name="";
		score=0.0;
	
	}
	public Student(int rollNo, String name, double score) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.score = score;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
//	public void display() {
//		System.out.println("rollNo is "+rollNo);
//		System.out.println("name is "+name);
//		System.out.println("score is "+score);
//	}
	
	public void markAttendance() {
		System.out.println("Attendace is fair");
		
	}
	

}
