package com.greetingapp.model;

public class Greeting {
	public long id;
	public String name;
	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "id ="+this.id+", name ="+this.name;
	}

}
