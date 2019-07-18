package com.spring.DemoCore1;

public class Student {

	private int id;
	private String name;
	private Book book;
	
	public Student(int id,String name,Book book){
		this.id=id;
		this.name=name;
		this.book=book;
	}
	
	public void show(){
		System.out.println("id: "+this.id+"name:"+this.name);
	}
	
    
}
