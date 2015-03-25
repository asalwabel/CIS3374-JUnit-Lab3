package com.lab3.admiterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class admiteratorTest {

	@Test
	@parameters( Method = "method_for_params")
	public void test(Type parameter1, Type param2) {
		fail("Not yet implemented");
	}
	
	
	private Object method_for_params() {
		
		return new Object[][]{arg1_for_run1, arg2_for_run1, etc...},
				{arg1_for_run2, arg2_for_run2};
				
	}

}
