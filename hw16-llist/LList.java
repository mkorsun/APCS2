/*****************************************************
 * class LList
 * skeleton
 * Implements a linked list of LLNodes.
 *****************************************************/

public class LList implements List 
{ //your homemade List.java must be in same dir

    //instance vars
    private LLNode _head;
    private int _size;

    // constructor -- initializes instance vars
    public LList( ) 
    {
	_size = 0;
	_head= new LLNode(null,null);


    }


    //--------------v  List interface methods  v--------------

    public boolean add(String x){
	if(_size == 0){
	    _head = new LLNode(x,null);
	}
	else{
	    _head = new LLNode(x,_head);
	}
	_size +=1;
	return true;
    }
	/*	if (_size == 0){
	    _head = new LLNode(x,null);
	    
	}
	else{
	    LLNode temp = _head;
	    while(temp.getNext()!= null){
		temp = temp.getNext();
	    }
	    temp.setNext(new LLNode(x,null));
	    	    
	}
	_size +=1;
	return true;
	}*/

    public String get(int i){
	if(_size == 0){
	    throw new IndexOutOfBoundsException();
	}
	LLNode temp = _head;
	for(int k = 0; k < i; k++){
	    temp = temp.getNext();
	    if(temp == null){
		throw new IndexOutOfBoundsException();
	    }
	}
	return temp.getCargo();
    }

    public String set(int i, String x){
	if(_size == 0){
	    throw new IndexOutOfBoundsException();
	}
	LLNode temp = _head;
	for(int k = 0; k < i; k++){
	    temp = temp.getNext();
	    if(temp == null){
		throw new IndexOutOfBoundsException();
	    }
	}
	String old = temp.getCargo();
	temp.setCargo(x);
	return old;
    }
    public void add(int i, String x){
	if(_size == 0){
	    throw new IndexOutOfBoundsException();
	}
	LLNode temp = _head;
	for(int k = 0; k < i; k++){
	    temp = temp.getNext();
	    if(temp == null){
		throw new IndexOutOfBoundsException();
	    }
	}
	
	temp.setNext(new LLNode(x,temp.getNext()));
	
	}

    public String remove(int index){
	if(_size == 0 || _size == index -1){
	    throw new IndexOutOfBoundsException();
	}
        
	
	for(int k = 0; k < i-1; k++){
	    temp = temp.getNext();
	    if(temp == null){
		throw new IndexOutOfBoundsException();
	    }
	}
	String old = _head.getCargo();
	temp.setNext(temp.getNext().getNext());
	return old;
    }
<<<<<<< HEAD
    public String add(int i, String x){
	if(_size == 0){
	    throw new IndexOutOfBoundsException();
	}
	LLNode temp = _head;
	for(int k = 0; k < i-1; k++){
	    temp = temp.getNext();
	    if(temp == null){
		throw new IndexOutOfBoundsException();
	    }
	}
	String old = temp.getCargo();
	temp.setNext(new LLNode(x,temp.getNext()));
	return old;
    }
    public String remove(int i){
	if(_size == 0){
	    throw new IndexOutOfBoundsException();
	}
	LLNode temp = _head;
	for(int k = 0; k < i-1; k++){
	    temp = temp.getNext();
	    if(temp == null){
		throw new IndexOutOfBoundsException();
	    }
	}
	String old = temp.getCargo();
	temp.setNext(new LLNode(temp.getNext().getNext().getCargo(),temp.getNext().getNext().getNext()));
	_size -=1;
	return old;
    }
=======
	
	
	
>>>>>>> f3f558f0546db6936deda06dc3ed8f3dc6e9079d

    


	 
    
			    
	
    
	    
		
	    
	 
	    

    //return number of nodes in list
    public int size() { return _size; } 

    //--------------^  List interface methods  ^--------------


    // override inherited toString
    public String toString() { 
	String retStr = "HEAD->";
	LLNode tmp = _head; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args ) 
    {

	LList james = new LList();

	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("beat");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("a");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("need");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("I");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	System.out.println( "2nd item is: " + james.get(1) );

	james.remove(1);
	System.out.println( "...and now 2nd item is: " + james.get(1) );

	System.out.println( james );
		/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class LList



