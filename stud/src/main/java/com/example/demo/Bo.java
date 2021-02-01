package com.example.demo;

public class Bo {
	public void read() {
		Pojo op=new Pojo();
		
		op.setSuid("01");
		op.setSuname("As");
	    Bo.display(op);
	}
	public static void display(Pojo a) {
		System.out.println(a);
	}
}
