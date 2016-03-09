package org.gradle.cl.ubb;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack myStack;
	
	@Before
	public void setup() throws Exception {
		myStack = new Stack(3);
	}
	
	@Test
	public void newStackIsEmpty() {
		
		assertThat(myStack.isEmpty(), is(true));
	}
	
	@Test
	public void afterPushOneNumberIsNotEmpty() throws StackException{
		
		myStack.push(1);
		
		assertThat(myStack.isEmpty(), is(false));
		
	}
	
	@Test
	public void afterPushTwoNumbersIsNotEmpty() throws StackException{
		
		myStack.push(1);
		myStack.push(2);
		
		assertThat(myStack.isEmpty(), is(false));
		
	}
	
	@Test
	public void afterPushTwoNumbersCapacityIsTwo() throws StackException{
		
		myStack.push(1);
		myStack.push(2);
		
		assertThat(myStack.capacity(), is(2));
		
	}
	
	@Test
	public void afterPushNumberOnePopReturnNumberOne() throws StackException{
		
		myStack.push(1);
		
		assertThat(myStack.pop(), is(1));
		
	}
	
	@Test
	public void afterPushOneNumberPopReturnSameNumber() throws StackException{
		
		myStack.push(4);
		
		assertThat(myStack.pop(), is(4));
		
	}
	
	@Test
	public void afterPushOneAndTwoTwoAndOneArePopped() throws StackException{
		
		myStack.push(1);		
		myStack.push(2);
		
		assertThat(myStack.pop(), is(2));		
		assertThat(myStack.pop(), is(1));
		
	}
	
	@Test (expected=StackException.class)
	public void popEmptyStackThrowsError() throws StackException {
				
		assertThat(myStack.pop(), is(2));		
		assertThat(myStack.pop(), is(1));
		
	}	
	
	@Test (expected=StackException.class)
	public void pushFullStackThrowsError() throws StackException {
				
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);		
		myStack.push(4);
		
	}	
	
	@Test 
	public void afterPushNumberOneTopReturnsOne() throws StackException{
		
		myStack.push(1);
		
		assertThat(myStack.top(),is(1));
	}
	
	@Test 
	public void afterPushNumbersOneAndTwoTopReturnsTwo() throws StackException{
		
		myStack.push(1);
		myStack.push(2);
		
		assertThat(myStack.top(),is(2));
	}
	
	@Test 
	public void afterPushNumbersOneAndTwoAndThenPopTopReturnsOne() throws StackException{
		
		myStack.push(1);
		myStack.push(2);
		myStack.pop();
		assertThat(myStack.top(),is(1));
	}
	
}
