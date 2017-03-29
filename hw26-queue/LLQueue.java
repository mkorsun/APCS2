//Max Korsun
//APCS2 pd3
//HW26 - The english do not wait in line
//2017 - 03 - 29


/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

//import java.util.NoSuchElementException;
//import java.lang.RuntimeException;

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;

    // default constructor creates an empty queue
    public LLQueue()
 { 
     _front = new LLNode<T>(null,null);
     _end = _front;
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) 
{
    if(_front.getValue() == null){
	_front.setValue(enQVal);
	_end = _front;
    }
    else{
	_end.setNext(new LLNode<T>(enQVal, null));
	_end = _end.getNext();
    }
    }//O(1)


    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
{
    T retT = _front.getValue();
    _front = _front.getNext();
    return retT;

    }//O(1)


    // means of peeking at thing next in line for removal
    public T peekFront() 
{
    return _front.getValue();

    }//O(1)


    public boolean isEmpty() 
{
    return _front == null;
    }//O(1)


    // print each node, separated by spaces
      public String toString() 
{
    String retStr = "";
    LLNode<T> it = new LLNode<T>(null,_front);
    it = it.getNext();
    while(it.getValue() != null){
	retStr += it+ " ";
	it = it.getNext();
    }
    return retStr;
 
   

    }//O(n)



    public static void main( String[] args ) {

	
	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( LLQueuelJ.dequeue() );
	  

    }//end main

}//end class LLQueue
