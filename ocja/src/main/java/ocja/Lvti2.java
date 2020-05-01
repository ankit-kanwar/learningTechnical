package ocja;

import java.util.ArrayList;

class Student{
	String name;
	int rollNo;
	
	Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String toString() {
		return "Name :"+this.name+",Roll No :"+this.rollNo;
	}
}
public class Lvti2 {

	public static void main(String[] args) {
		new Lvti2().info();

	}

	private void info() {
		var students = new ArrayList<>();
		students.add(new Student("Ankit",101));
		students.add(new Student("Amit",102));
		for(var student:students) {
			//System.out.println("Name :"+student.name+",Roll No :"+student.rollNo);
			System.out.println(student);
		}
	}

}
