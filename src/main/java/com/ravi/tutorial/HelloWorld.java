package com.ravi.tutorial;

import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class HelloWorld
{
	private String name = "Ravi";
	
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
}
