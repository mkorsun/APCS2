/*****************************************************
 * class BST
 * <<< skeleton >>>
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT) 
 * A BST maintains the invariant that, for any node N with value V, 
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value, 
 *  and any value in its right subtree must be greater.)
 * This BST only holds ints (its nodes have int cargo)
 *****************************************************/

public class BST 
{
    //instance variables / attributes of a BST:


    /*****************************************************
     * default constructor
     *****************************************************/
    BST( ) 
    {
	root = null;
    }

 /*****************************************************
     * overloaded constructor
     *****************************************************/
    BST(TreeNode val){
	root = val;
    }

    /*****************************************************
     * void insert( int ) 
     * Adds a new data element to the tree at appropriate location.
     *****************************************************/
    public void insert( int newVal ) 
    {

	
     	if(root == null){
	    root = new TreeNode(newVal);
	}
	else{
	    if (newVal <= root.getValue()){
		if(root.getLeft() == null){
		    root.setLeft(new TreeNode(newVal));
		}
		else{
		    BST leftsub = new BST(root.getLeft());
		    leftsub.insert(newVal);
		}
	    }
	    else{
		if(root.getRight() == null){
		    root.setRight(new TreeNode(newVal));
		}
		else{
		    BST rightsub = new BST(root.getRight());
		    rightsub.insert(newVal);
		}
	    }
	}
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

    // each traversal should simply print to standard out 
    // the nodes visited, in order

     public void preOrderTrav() 
    {
        if(root == null){
	    return;
	}
	else{
	    System.out.print(root.getValue() + " ");
	    BST leftsub = new BST(root.getLeft());
	    BST rightsub = new BST(root.getRight());
	    leftsub.preOrderTrav();
	    rightsub.preOrderTrav();
	}
	    
	    
    }

    public void inOrderTrav() 
    {
	if(root == null){
	    return;
	}
	BST leftsub = new BST(root.getLeft());
	leftsub.inOrderTrav();
	System.out.print(root.getValue() + " ");
	BST rightsub = new BST(root.getRight());
	rightsub.inOrderTrav();
	
        
    }

    public void postOrderTrav() 
    {
       	if(root == null){
	    return;
	}
	BST leftsub = new BST(root.getLeft());
	leftsub.postOrderTrav();
       	BST rightsub = new BST(root.getRight());
	rightsub.postOrderTrav();
	System.out.print(root.getValue() + " ");
      
    }
    //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
    }




    //main method for testing
    public static void main( String[] args ) 
    {
	/*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
	  BST arbol = new BST();

	  arbol.insert( 4 );
	  arbol.insert( 2 );
	  arbol.insert( 5 );
	  arbol.insert( 6 );
	  arbol.insert( 1 );
	  arbol.insert( 3 );

	  System.out.println( "\npre-order traversal:" );
	  arbol.preOrderTrav();

	  System.out.println( "\nin-order traversal:" );
	  arbol.inOrderTrav();
	
	  System.out.println( "\npost-order traversal:" );
	  arbol.postOrderTrav();	

	  //insert your new test calls here...
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class
