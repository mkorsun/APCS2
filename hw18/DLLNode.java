//Maximilian Korsun
//APCS2 pd 3
//hw18 On the DLL
//2017 - 03 - 16

/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode 
{

    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _prevNode;//pointer to previous node

    // constructor -- initializes instance vars
    public DLLNode( DLLNode prev, String value, DLLNode next ) 
    {
	_cargo = value;
	_nextNode = next;
	_prevNode = prev;

    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }
    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) 
    {
	String oldCargo = _cargo;
	_cargo = newCargo;
	return oldCargo;
    }

    public DLLNode setNext( DLLNode newNext ) 
    {
	DLLNode oldNode=_nextNode;
	_nextNode = newNext;
	return oldNode;
    }
     public DLLNode setPrev( DLLNode newPrev ) 
    {
	DLLNode oldNode=_prevNode;
	_prevNode = newPrev;
	return oldNode;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) 
{

	
	//Below is an exercise in creating a linked list...

	//Create a node
	LLNode first = new LLNode( "cat", null );

	//Create a new node after the first
	first.setNext( new LLNode( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new LLNode( "cow", null ) );
	

	// A naive list traversal:
	while( first != null ) {
	    System.out.println( first );
	    first = first.getNext();
	}
	System.out.println(first);
}
}

	//Q: When head ptr moves to next node in list,
	//   what happens to the node it just left?
//A: it gets erased/deleted. 

    /*
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    //end main

//end class LLNode
