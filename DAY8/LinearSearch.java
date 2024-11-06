public class LinearSearch {
	
	public static int linearSearch(int[] arr, int key) {
     		for (int i = 0; i < arr.length; i++) {
        		if (arr[i] == key) {
                		return i;  // Return the index of the found element
            		}
        	}
        	return -1;  // Return -1 if the element is not found
    	}
	
	public static void main(String []args){

		int[] a1= {10, 20, 30, 40, 50};
		int key = 30;
		System.out.println(key + " is found index: " + linearSearch(a1,key));
	}
}