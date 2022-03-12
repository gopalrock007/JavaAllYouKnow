package com.learning.threading;

import java.util.LinkedList;
import java.util.Random; 

public class ThreadExample<T> { 

	// Create a list shared by producer and consumer Size of list is 2. 
	LinkedList<T> list = new LinkedList<>(); 
	int capacity = 2; 

	public ThreadExample(int capacity){
		super();
		this.capacity= capacity;
	}

	// Function called by producer thread 
	public void produce(T element) throws InterruptedException 
	{ 
		while (true) { 
			synchronized (this) 
			{ 
				// producer thread waits while list is full 
				while (list.size() == capacity) {
					wait(); 
				}

				System.out.println("Producer produced-"+ element); 
				// to insert the jobs in the list 
				list.add(element); 

				// notifies the consumer thread that now it can start consuming 
				notify(); 
				// makes the working of program easier to understand  
			} 
		} 
	} 

	// Function called by consumer thread 
	public T consume() throws InterruptedException 
	{ 
		while (true) { 
			synchronized (this) 
			{ 
				// consumer thread waits while list is empty 
				while (list.size() == 0) {
					wait(); 
				}

				// to retrive the ifrst job in the list 
				T element = list.removeFirst(); 

				System.out.println("Consumer consumed-"+ element); 

				// Wake up producer thread 
				notify(); 
				return element; 
			} 
		} 
	} 

	public static void main(String[] args) throws InterruptedException 
	{ 
		// Object of a class that has both produce() and consume() methods 
		ThreadExample<Integer> commonQueue = new ThreadExample<>(2);

		// Create producer thread 
		Thread producer = new Thread(new Runnable() {
			Random random = new Random();
			@Override
			public void run() 
			{ 
				try { 
					while(true){
						int element = random.nextInt(1000);
						commonQueue.produce(element); 
						Thread.sleep(3000);
					} 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 

		// Create consumer thread 
		Thread consumer = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					while(true){
						int element = commonQueue.consume(); 
						//System.out.println(element);
					} 
				}catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 

		// Start both threads 
		producer.start(); 
		consumer.start(); 

		// t1 finishes before t2 
		producer.join(); 
		consumer.join(); 
	}

}