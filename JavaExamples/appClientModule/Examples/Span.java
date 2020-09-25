/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

public class Span {
    public static int display(int[] x) {
        int gap = 0, max = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    gap = j;
                }
            }
            if (gap - i > max) {
                max = gap - i;
            }

        }
        return max + 1;
    }

    public static void main(String[] args) {
        
        int[] ar = {11,21,3,4,6,1,1,3};
        
        
        /*
        String s = "12.655f";
        double d = 333.4556d;
        
        Float f = Float.parseFloat(s);
      //  int num = Integer.par
*/
        
        
        System.out.println("Result: "+display(ar));
    }
    


}
