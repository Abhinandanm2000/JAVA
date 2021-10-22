import java.util.*;


public class Assign {

	public static void main(String[] args) {
    
		// simple program to print in sorted way
	
	/*	
		 List<Integer> numbers= new ArrayList<>();
          numbers.add(102);
          numbers.add(434);
          numbers.add(323);
          numbers.add(543);
          numbers.add(123);
          
          
          Collections.sort(numbers);
          for(Object i : numbers) {
        	  System.out.println(i);
          }
          
		*/
		
		
		
		// program using get remove and other functions
	
		
	/*  	LinkedList<Integer>numbers=new LinkedList<>();
		 numbers.addFirst(10);
		  numbers.add(25);
		  numbers.add(30);
		  numbers.add(82);
		  numbers.addLast(20);
		  
		  
		  
		  
		  Iterator<Integer> it=numbers.iterator();
		  
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  
		  
		  System.out.println(numbers.get(2));
		  System.out.println(numbers.remove(1));
		  
		  */
		
		
		//hshset 
	  
		/* HashSet<String> a = new HashSet<String>();      
	     a.add("bmw");      
	     a.add("audi");      
	     a.add("honda");       
	     a.add("maruthi");       
	     System.out.println(a);      
	     System.out.println(" contains bmw or not:"  + a.contains("bmw"));      
	     a.remove("audi");  
	     System.out.println("List after removing Audi:" + a);  
	     System.out.println("the  list:");    
	     Iterator<String> i = a.iterator();     
	     while (i.hasNext())          
	    	 System.out.println(i.next());
		  
		  }  */
		
		
		
		
		//array deque

		
		/*
		Deque<String> names = new ArrayDeque<String>();  
		names.add("darshan");  
		names.add("danu");  
		names.add("yash");  
	 
		for (String str :names) {  
		System.out.println(str);  
		}  
		
		*/
		
		
		
	Stack<Integer> stack1 = new Stack<Integer>();    
     stack1.push(11);  
	stack1.push(18);   
	stack1.push(32);   
	stack1.push(34);  
	stack1.push(42);   
	stack1.push(23); 
	stack1.push(35); 
	stack1.push(35); 
	
	System.out.println(" size of the stack is: " +stack1.size() );  
	System.out.println(" stack contains: " + stack1); 
	

		
		
		
		
		}  
		}  
		  
          

	


