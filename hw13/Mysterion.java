/*Maximilian Korsun
APCS pd3
HW13 -- We Be Dem SV
2017-03-17*/

public class Mysterion{

    public static void swap(int[] arr,int a, int b){
	int c= arr[a];
	arr[a]=arr[b];
	arr[b]=c;
    }
	

    public static int sortofsort(int[] arr, int a, int b, int c){
	int v= arr[c];
	swap(arr,c,b);
	int s = a;
	for(int i = a; i < b; i++){
	    if(arr[i]<v){
		swap(arr,s,i);
		s+=1;
	    }
	}
	swap(arr,b,s);
	return s;
    }
    /* Although I messed around with it and still couldnt figure it out, I did find out something.

The number returned is the number of values between position a and position b-1 less than the value in position c.

The list is "sorted" inso much as that those values between a and b-1 which are < value of c are ordered whithin that space as good as possible
    */

   private static void printArray(int[] anArray) {
      for (int i = 0; i < anArray.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(anArray[i]);
      }
   }

   
    public static void main(String[] args){
	int[] array = {1,4982,33,28,37};
	System.out.println(sortofsort(array,0,4,4));
	printArray(array);
    }
}

    

	
