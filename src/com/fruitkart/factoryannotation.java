package com.fruitkart;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;



public class factoryannotation {
	@Test
	@Factory
	public Object[] RunTests() {
		return new Object[] {new TestBrowserKart(),new main()};
		
	}

}
