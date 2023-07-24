package sample;

public class MoveZeroes {
	
	     public static void moveZeroes(int[] arr) {
	 
	         int len = arr.length;
	         int count = 0;
	         for(int i = 0; i < len; i++) {
	             if(arr[i] != 0) {
	                arr[count++] = arr[i];
	              }
	          }
	          while(count < len) {
	             arr[count++] = 0;
	          }
	         
	          for(int j = 0; j < len; j++) {
	             System.out.print(arr[j] + " ");
	          }
	     }
	 
	 
	   public static void main(String[] args) {
	 
	        int arr[] = {0,1,0,3,12};
	        moveZeroes(arr);
	    }

}
