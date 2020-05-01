package com.enki.concepts.immutable;

final class Person{
	private final  int id;
	private final String name;
	private final Age age;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Age getAge() {
		Age clonedAge = new Age();
		clonedAge.setDay(age.getDay());
		clonedAge.setMonth(age.getMonth());
		clonedAge.setYear(age.getYear());
		return clonedAge;
	}
	
	public Person(int id,String name,Age age) {
		this.id=id;
		this.name=name;
		Age clonedAge = new Age();
		clonedAge.setDay(age.getDay());
		clonedAge.setMonth(age.getMonth());
		clonedAge.setYear(age.getYear());
		this.age=clonedAge;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
public class ImmutableClassEg {

	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(10);
		age.setMonth(12);
		age.setYear(1992);
		var immu = new Person(1,"Ankit",age);
		
		System.out.println("before modification"+immu);
		age.setYear(2000);
		System.out.println("after modification"+immu);
		
		System.out.println("before modification"+immu);
		immu.getAge().setYear(2000);;
		System.out.println("after modification"+immu);
		

	}

}
