package com.springboot.projects.springbootswaggerexample.resource;

public class User {

		private String userName;
		private Long salary;
		
		public User(String string, long l) {
			// TODO Auto-generated constructor stub
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public Long getSalary() {
			return salary;
		}
		public void setSalary(Long salary) {
			this.salary = salary;
		}
		
}
