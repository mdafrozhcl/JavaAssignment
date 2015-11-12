package JavaOOPs;

public class Student {

	int rollNum;
	String studName;
	int mark1, mark2, mark3, totalMarks;
	
	// this is for the 3rd question
	Student(){
		//when we have parameterized constructor then it is a responsibility of a programmer to create empty constructor
	}
	
	// this is for the 3rd question
	Student(int rollNum, String studName, int... mark){
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark[0];
		this.mark2 = mark[1];
		this.mark3 = mark[2];
	}

	public void setStudDetails(int rollNum, String studName, int... mark) {
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark[0];
		this.mark2 = mark[1];
		this.mark3 = mark[2];
	}

	public void calculateTotal() {
		this.totalMarks = mark1 + mark2 + mark3;
	}

	public void displayStudDetails() {
		System.out.println("Details\n-------");
		System.out.println("Roll Number: " + rollNum);
		System.out.println("Student Name: " + studName);
		System.out.println("Total Mark: " + totalMarks);
	}
}
