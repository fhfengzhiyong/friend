package com.straw.test;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.junit.Test;

public class Common {
	@Test
	public void arrayBlockingQueue(){
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(2);
		queue.add(2);
		boolean b = queue.offer(5);
		System.out.println(b);
		//queue.put(2);
		System.out.println("队列长度:"+queue.size());
		//queue.poll();//顶部元素,队的顶部，先进去的，
	//	queue.poll();
		Integer poll = queue.poll();
		System.out.println(poll);
		boolean a = queue.remove(3);
		System.out.println(a);
		Integer element = queue.element();
		Iterator<Integer> iterator = queue.iterator();
		for(Iterator<Integer> iteratosr = iterator;iterator.hasNext();){
			
		}
	}
	@Test
	public void testFor(){
	  //  Queue<Integer> que = 	new ConcurrentLinkedDeque<Integer>();
	    
	}
	
	
	/*
	@Test
	public void t(){
		Person p = new Person();
	}
	@Test
	public void t1(){
		Person p = new Person();
		p.setAge(20);
		 t2(p);
		System.out.println(p.getAge());
	}
	private void t2(Person p) {
		p.setAge(2);
	}
	@Test
	public void t3(){
		Map<String,Object> map = new HashMap<String,Object>();
		Double a = 10d;
		map = t4(a);
		System.out.println(map.get("a"));
	}
	private Map t4(Double a) {
		a=  15d;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("a", a);
		return map;
	}
	@Test
	public void t5(){
		String OS = System.getProperty("os.name").toLowerCase();
		System.out.println(OS);
	}
	
*/}

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
