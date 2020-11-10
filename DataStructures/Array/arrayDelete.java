class ArrayDelete{
public static void main(String args[]) {
   int LA[] = {1,3,5,7,8};
   int k = 3, n = 5;
	
   for(int i = 0; i<n; i++) {
      System.out.print(LA[i]);
   }


   for(int j = k; j < n; j++){
   		LA[j-1] = LA[j];
   }
	
   n = n -1; 

   System.out.println(" ");
	
   for(int i = 0; i<n; i++) {
      System.out.print(LA[i]);
   }
}
}

