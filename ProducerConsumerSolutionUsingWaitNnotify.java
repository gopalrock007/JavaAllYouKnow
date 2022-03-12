package com.learning.threading;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random; 

/** * Producer Consumer Problem solution using BlockingQueue in Java. 
 * * BlockingQueue not only provide a data structure to store data 
 * * but also gives you flow control, require for inter thread communication. 
 * */ 

public class ProducerConsumerSolutionUsingWaitNnotify 
{ 
	public static void main(String[] args) 
	{ 
		Queue<Integer> sharedQ = new LinkedList<>(); 
		int maxSize =10;
		Producer1 p = new Producer1(sharedQ,maxSize,"Producer"); 
		Consumer1 c = new Consumer1(sharedQ,maxSize,"Consumer"); 
		p.start(); 
		c.start(); 
	} 
} 

class Producer1 extends Thread 
{ 
	private Queue<Integer> sharedQueue; 
	private int maxSize; 

	public Producer1(Queue<Integer> sharedQ, int maxSize, String name) { 
		super(name); 
		this.maxSize=maxSize;
		this.sharedQueue = sharedQ; 
	}

	public void run() {
		while(true){
			synchronized(sharedQueue){
				while(sharedQueue.size()==maxSize){
					System.out.println("QUEUE is Full");
					try{
						sharedQueue.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				Random random = new Random();
				int i= random.nextInt();
				System.out.println("Produces : "+i);
				sharedQueue.add(i);
				sharedQueue.notifyAll();
			}
		}
	}
}

class Consumer1 extends Thread 
{ 
	private Queue<Integer> sharedQueue; 
	private int maxSize;

	public Consumer1(Queue<Integer> aQueue,int size,String name) 
	{ 
		super(name); 
		this.maxSize=size;
		this.sharedQueue = aQueue; 
	} 

	public void run() {
		while(true){
			synchronized(sharedQueue){
				while(sharedQueue.isEmpty()){
					System.out.println("QUEUE is Empty");
					try{
						sharedQueue.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				System.out.println("Consume : "+sharedQueue.remove());
				sharedQueue.notifyAll();
			}
		}
	} 
}