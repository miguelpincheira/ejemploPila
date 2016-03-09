package org.gradle.cl.ubb;

import java.util.ArrayList;




public class Stack {

	private ArrayList<Integer> elements;
	private int maximunCapacity;
	
	public Stack(int size) {
		// TODO Auto-generated constructor stub
		maximunCapacity = size;
		elements = new ArrayList<Integer>(size);
	}

	public Boolean isEmpty() {
		
		return (elements.size()==0);
	}

	public void push(int numero) throws StackException{
		// TODO Auto-generated method stub
		if(elements.size()==maximunCapacity)
			throw new StackException();
		elements.add(numero);		
	}

	public Integer capacity() {
		// TODO Auto-generated method stub
		return elements.size();
	}

	public Integer pop() throws StackException{
		// TODO Auto-generated method stub
		if(elements.size()==0)
			throw new StackException();
		
		int topNumber = elements.get( (elements.size()-1) );
		elements.remove((elements.size()-1) );
		
		return topNumber;
		
	}

	public Integer top() {
		// TODO Auto-generated method stub
		return elements.get( (elements.size()-1) );
	}

	
	

	
}
