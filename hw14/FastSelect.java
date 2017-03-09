/*Maximilian Korsun
APCS pd3
HW14 -- So So Fast
2017-03-08*/

public class FastSelect{

    public static void swap(int[] arr,int a, int b){
	int c= arr[a];
	arr[a]=arr[b];
	arr[b]=c;
    }
	

    public static int partition(int[] arr, int a, int b, int c){
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

    public static int fastFind(int[] arr, int lower, int upper, int y){
	int part = partition(arr, lower, upper, (lower + upper)/2);
	if(upper < lower){
	    return -1;
	}
	if(part == y){
	    return arr[y];
	}
	else if(part < y){
	    return fastFind(arr, part +1, upper, y);
	}
	else{
	    return fastFind(arr, lower, part-1, y);
	}
        
    }
    /* Essentially binary sort. Find the partition point. The C point is arbittraty since it refers to index rather than value, putting it inbetween should be the most efficient however. Then, if the partition point is the number you are loking for, return the value at that index. If the partition index is lower than the index you want, run the method again with the lower bound being partition _ 1. If its greater, upper bound becomes partition -1.*/

    
    public static void main(String[] args){
	int[] array = {3,94,6,2,5,97,54,86};
	System.out.println(fastFind(array, 0, 7, 5));
    }
}
	
	    
	    
	
	
