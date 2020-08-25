package com.learning.kafka.model;

public class Customer {
	
	// required parameters
	private String firstName;
	private String lastName;
	
	//optional parameters
	private Integer age;
	private Boolean automatedMail;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getAutomatedMail() {
		return automatedMail;
	}
	public void setAutomatedMail(Boolean automatedMail) {
		this.automatedMail = automatedMail;
	}
	
	private Customer(CustomerBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.automatedMail = builder.automatedMail;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((automatedMail == null) ? 0 : automatedMail.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (automatedMail == null) {
			if (other.automatedMail != null)
				return false;
		} else if (!automatedMail.equals(other.automatedMail))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", automatedMail="
				+ automatedMail + "]";
	}
	
	// Builder class
	public static class CustomerBuilder{
		//required parameters
		private String firstName;
		private String lastName;
		
		//optional parameters
		private Integer age;
		private Boolean automatedMail;
		
		public CustomerBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public CustomerBuilder setAge(Integer age) {
			this.age = age;
			return this;
		}
		
		public CustomerBuilder setAutomatedMail(Boolean automatedMail) {
			this.automatedMail = automatedMail;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
			}
	}
}
