package Examples;

class EquilibriumIndex { 
    int equilibrium(int[] arr, int n) 
    { 
        int i=0, j=0; 
        int leftsum, rightsum; 
  
        // Check for indexes until the equilibrium index is found 
        for (i = 0; i < n; i++) { 
  
            // left sum 
            leftsum = 0;   
            for (j = 0; j < i; j++) 
                leftsum += arr[j]; 
  
            // right sum
            rightsum = 0; 
            for (j = i + 1; j < n; j++) 
                rightsum += arr[j]; 
  
            // if leftsum == rightsum returns 
            if (leftsum == rightsum) 
                return i; 
        } 
        // return -1 if equilibrium index is not found
        return -1; 
    } 

    public static void main(String[] args) 
    { 
        EquilibriumIndex ei = new EquilibriumIndex(); 
        int array[] = { -1, 3, -4, 5, 1, -6, 2, 1 }; 
        int array_size = array.length; 
        System.out.println(ei.equilibrium(array, array_size)); 
    } 
} 
