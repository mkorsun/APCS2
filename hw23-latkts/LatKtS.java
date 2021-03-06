//Maximilian Korsun
//APCS2 pd3
//HW23 - Stack: What is it good for?
//2017 -03 - 24



/*****************************************************
 * class LatKtS (LatKeysToSuccess)
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 * SKELETON
 *****************************************************/


public class LatKtS 
{

    /**********************************************************
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **********************************************************/
    public static String flip( String s ) 
    { 
	int size = s.length();
	Latkes TBF = new Latkes(size);
	for(int i = 0; i<size;i++){
	    TBF.push(s.substring(i,i+1));
	}
	String retStr = "";
	for(int i = 0; i < size; i++){
	    retStr+= TBF.pop();
	}
	return retStr;

    }//end flip()


    /**********************************************************
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "({}[()])" )    -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **********************************************************/
    public static boolean allMatched( String s ) 
    { 
	if (s.length() <= 0){
	    return true;
	}
	if(s.length() % 2 != 0){
	    return false;
	}
	Latkes temp = new Latkes(s.length());

	String check;

	for(int i = 0; i<s.length(); i++){
	    check = s.substring(i,i+1);
	    if(check.equals("(") || check.equals("[") || check.equals("{")){
		temp.push(check);// save this thing as topmost to be checked
	    }

	    else if (check.equals(")")){
		if(temp.isEmpty()) return false;
		if(!temp.pop().equals("(")) return false;
	    }
	     else if (check.equals("}")){
		if(temp.isEmpty()) return false;
		if(!temp.pop().equals("{")) return false;
	    }
	     else if (check.equals("]")){
		if(temp.isEmpty()) return false;
		if(!temp.pop().equals("[")) return false;
	    }
	}
	return true;
	       
    }//end allMatched()


    //main method to test
    public static void main( String[] args ) { 

        
	System.out.println(flip("stressed"));
        System.out.println(allMatched( "({}[()])" )); //true
        System.out.println(allMatched( "([)]" ) ); //false
        System.out.println(allMatched( "(){([])}" ) ); //true
        System.out.println(allMatched( "](){([])}" ) ); //false
        System.out.println(allMatched( "(){([])}(" ) ); //false
        System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
          
    }

}//end class LatKtS
