
package Examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Distance {

    public static double minimumDistance(float x2, float y2, ArrayList<ArrayList<Integer>> coords) {
        double distance = 0, smallestDistance = 0;
        int x1 = 0, y1 = 0;

        for (int i = 0; i < coords.size(); i++) {
            int arraysize = coords.size();
            for (int j = 0; j < arraysize; j++) {
                x2 = coords.get(i).get(0);
                y2 = coords.get(i).get(1);
                distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
                if(smallestDistance == 0){smallestDistance = distance;}
                
                System.out.printf("\n distance= " + distance);
                if (distance < smallestDistance ) {
                    smallestDistance = distance;
                }
                i++;
            }
        }
         return smallestDistance;
    }

    public Distance() {
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> array = new ArrayList(3);

        ArrayList<Integer> c1 = new ArrayList<Integer>();
        c1.add(9);
        c1.add(20);

        ArrayList<Integer> c2 = new ArrayList<Integer>();
        c2.add(7);
        c2.add(8);

        ArrayList<Integer> c3 = new ArrayList<Integer>();
        c3.add(5);
        c3.add(6);

        array.add(c1);
        array.add(c2);
        array.add(c3);

        System.out.printf("\n minimumDistance= " + minimumDistance(4,5,array) + "\n");
        
        /*
          for (int i = 0; i < array.size(); i++) {
            int arraysize = array.size();
            for (int j = 0; j < arraysize; j++) {

                System.out.printf(" x= " + array.get(i).get(0) + "\n");
                System.out.printf(" y= " + array.get(i).get(1) + "\n");
                i++;
            }
        }
        
         */
    }

}
