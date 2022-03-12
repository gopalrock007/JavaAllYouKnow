package com.learning.threading;
class JoinMethodExample extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 JoinMethodExample t1=new JoinMethodExample();  
 JoinMethodExample t2=new JoinMethodExample();  
 JoinMethodExample t3=new JoinMethodExample();  
 t1.start();  
 try{  
  t1.join(0);  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();
// try {
//	t2.join();
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
 t3.start();
 } 
}
