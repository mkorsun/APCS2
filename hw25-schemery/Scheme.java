//Max Korsun
//APCS2 pd3
//HW25 -What A rAcket
//2017-03-28



/*****************************************************
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *
 * Parse throug hthe string once as an array. 
IF a nest is found, then evaluate that next.
Place th rrresultingvalue where it was. 
Then continue to work on the outer sections until completed.
 * 
 * STACK OF CHOICE: ALStack
 * b/c it doesnt matter much either way
 ******************************************************/

public class Scheme 
{

    /****************************************************** 
     * precond:  Assumes expr is a valid Scheme (prefix) expression,
     *           with whitespace separating all operators, parens, and 
     *           integer operands.
     * postcond: Returns simplified value of expression, as a String
     * eg,
     *           evaluate( "( + 4 3 )" ) -> 7
     *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
     ******************************************************/
    public static String evaluate( String expr ) 
    {
	String retVal = "";
	String[] exprArr = expr.split("\\s+"); //split on whitespace
	ALStack<String> stack = new ALStack<String>();
	int sect1=0;
	int sect2=0;
	String nestVal = "";
	expArr = exprArr[1,exprArr.length];
	ogArr = expArr;
        for(int i = expArr.length-1; i >= 0; i--){
	    stack.push(expArr[i]);
	    if(stack.peek.equals("(")){
		    sect1 = i;
		}
	    else if(sect1 !=0 && stack.peek().equals(")")){
		sect2 = i;
		nestVal = evaluate(Arrays.toString(expArr[sect1,sect2]));
		expArr = concat(expArr[0,sect1], [nestVal]);
		expArr = concat(expArr, ogArr[sect2,ogArr.length]);
		    }
	}
	for(int i = expArr.length - 1; i >=0;i--){
	    stack.push(expArr[i]);
	}

	String op = stack.pop();
	if(op.equals("+")) return unload(1,stack);
	else if(op.equals("-")) return unload(2,stack);
	else return unload(3,stack);
    }

	
				   
		
		
		    
		    
	}
	stack.pop();
	String op = stack.pop();
	
	
	
	    
    }
    public static String[] concat(String[] Arr1, String[] Arr2){
	int length = 0;
	length = Arr1.length + Arr2.length;
	String[] ret = new String[length];
	int pos = 0;
	for(int i = 0; i < Arr1.length; i++){
	    ret[i] = Arr1[i];
	    pos+=1;
	}
	for(int i = 0; i <Arr2.length; i ++){
	    ret[i+pos] = Arr2[i];
	    pos +=1;
	}
	return ret;
    }

	

    /* public String op(String operator, String num1, String num2){
	if(operator = "+"){
	    return Integer.valueOf(num1) + Integer.valeOf(num2);
	}
	else if(operator = "-"){
	    return Integer.valueOf(num1) - Integer.valeOf(num2);
	}

	else if(operator = "*"){
	    return Integer.valueOf(num1) * Integer.valeOf(num2);
	}

	else{
	    return Integer.valueOf(num1) / Integer.valeOf(num2);
	}
	}*/


    /* public String evalHelp(ALStack<String> stack){
	stack.pop();
	String operator = stack.pop();
	String currentNum = stack.pop();
	while(!stack.peek().equal(")")){
	    if(stack.peek() == "("){
		evalHelp(
	    currentNum = op(operator, currentnum, stack.pop());
	    
	}
	stack.pop();
	return currentNum;
	}*/
	    
	    


    /****************************************************** 
     * precond:  Assumes top of input stack is a number.
     * postcond: Performs op on nums until closing paren
     *           is seen thru peek().
     *           Returns result of applying operator to
     *           sequence of operands.
     *           Ops: + is 1, - is 2, * is 3
     ******************************************************/
    public static String unload( int op, Stack<String> numbers ) 
    {
	int total = 0;
	int totalm = 1;//for multiplaction case
	int current = 0;
	if (op == 2){
	    total = Integer.parseInt(numbers.pop());
	}

	while(!numbers.peek().equals(")")){
	    current = Integers.parseInt(numbers.pop());
	    if( op == 1){
		total += current;
	    }
	    else if(op == 2){
		total -= current;
	    }
	    else{
		totalm*= current;
	    }
	}
	if (totalm > 1){
	    return Integer.toString(totalm);
	}
	return Integer.toString(total);
			
    }


    /*
    //optional check-to-see-if-its-a-number helper fxn:
    public static boolean isNumber( String s ) {
        try {
	    Integer.parseInt(s);
	    return true;
	}
        catch( NumberFormatException e ) {
	    return false;
	}
    }
    */


    //main method for testing
    public static void main( String[] args ) 
    {
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	String zoo1 = "( + 4 3 )";
	System.out.println(zoo1);
	System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
	//...7

	String zoo2 = "( + 4 ( * 2 5 ) 3 )";
	System.out.println(zoo2);
	System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
	//...17

	String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
	System.out.println(zoo3);
	System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
	//...29

	String zoo4 = "( - 1 2 3 )";
	System.out.println(zoo4);
	System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
	//...-4
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//main

}//end class Scheme
