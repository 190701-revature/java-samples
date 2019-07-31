package com.revature.generics;

public class MyBox {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	
	public static void main(String[] args) {
		MyBox myBox = new MyBox();
		myBox.setObject("Hello");
		
		// 5 minutes later
		
		String myString = (String) myBox.getObject();
		
		System.out.println(myString);
	}
}
