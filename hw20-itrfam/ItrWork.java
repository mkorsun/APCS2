
/*Maximilian Korsun
APCS2 pd3
HW20 - Deiteratour
2017-03-20*/

/*****************************************************
 * class ItrWork -- skeleton
 * Allows for familiarization with iterators
 *****************************************************/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork 
{
    //using FOREACH loop
    //returns a boolean to indicate whether key is present in L
    public static boolean foundA( Integer key, List<Integer> L ) 
    {
	
	boolean found = false;		    
	for(Integer each: L){
	    if(each == key){
		found = true;// if during the loop it find the key, return true
	    }
	}
	return found;//if it doesnt find it,return false
	    
	    
    }


    //explicitly using an iterator
    //returns a boolean to indicate whether key is present in L
    public static boolean foundB( Integer key, List<Integer> L ) 
    {
	
	Iterator it = L.iterator();
	while(it.hasNext()){
	    if(it.next() == key){
		return true;
	    }
	  
	}
	return false;
	    
    }


    //using FOREACH loop
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsA( List<Integer> L ) 
    { 
	List<Integer> odds = new ArrayList<Integer>();
	for(Integer each : L){
	    if(each % 2 == 1){
		odds.add(each);
	    }
	}
	return odds;
	    
    }


    //explicitly using an iterator
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsB( List<Integer> L ) 
    { 
        Iterator it = L.iterator();
	List<Integer> odds = new ArrayList<Integer>();
	while(it.hasNext()){
	    Integer check = (Integer) it.next();
	    if(check % 2 == 1){
		odds.add(check);
	    }
	    
	}
	return odds;   				            	
    }


    //explicitly using an iterator
    //modifies L s.t. it contains no evens
    public static void removeEvens( List<Integer> L ) 
    {
	Iterator it = L.iterator();
	while(it.hasNext()){
	    if((Integer)it.next() % 2 == 0){
		it.remove();
	    }
	    
	}
    }
	    					            	              
    public static void main( String [] args ) 
    {

	//var type: List   obj type: ArrayList	
	List<Integer> L = new ArrayList<Integer>();

	for( int i = 0; i < 10; i++ )
	    L.add(i);


	// TASK: write code to print the contents of ArrayList L...

	
	// a) using a FOREACH loop
	for(int each : L){
	    System.out.println(each+" ");
	}
	


	// b) explicitly using an iterator
	Iterator it = L.iterator();
	while(it.hasNext()){
	    System.out.println(it.next());
	    
	}


	System.out.println("\nTesting foundA...");
	System.out.println("9 in L? -> " + foundA(9,L) );
	System.out.println("13 in L? -> " + foundA(13,L) );

	System.out.println("\nTesting foundB...");
	System.out.println("9 in L? -> " + foundB(9,L) );
	System.out.println("13 in L? -> " + foundB(13,L) );

	System.out.println("\nTesting oddsA...");
	List<Integer> A = oddsA(L);
	for( int n : A ) System.out.println(n);

	System.out.println("\nTesting oddsB...");
	List<Integer> B = oddsB(L);
	for( int n : B ) System.out.println(n);

	System.out.println("\nTesting removeEvens...");
	removeEvens(L);
	for( int n : L ) System.out.println(n);
	

    }//end main

}//end class ItrWork

