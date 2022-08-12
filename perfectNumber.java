import java.lang.Math;
import java.util.*;
public class perfectNumber {
    
    public static boolean checkPerfect(double a){

        double b = 5;
        double c = 12;
        ArrayList<Integer> perfect = new ArrayList<Integer>();
        for (double i=1; i<a;i++){
            if (Math.rint(a/i)==(a/i)){
                // System.out.println("We have an int");
                // System.out.println("i: "+i);
                // System.out.println(a/i);
                perfect.add((int)i);
            }
     

        }
        // System.out.println("*************");
        int sum=0;
        for (int j=0;j<perfect.size();j++){
            // System.out.println(perfect.get(j));
            sum=sum+perfect.get(j);


        }

        // System.out.println(sum);
        if (sum==a){
            return true;

        }
        else {

            return false;
        }

    }

    public static void main(String[] args) {
       boolean solution1 = checkPerfect(6);// ➞ true



       boolean  solution2 = checkPerfect(28); //➞ true
        
        
        
       boolean  solution3 = checkPerfect(496);// ➞ true
        
        
        
       boolean  solution4 = checkPerfect(12);// ➞ false
        
        
        
       boolean  solution5 = checkPerfect(97);// ➞ false
       
       
       
        System.out.println(solution1);
        System.out.println(solution2);
        System.out.println(solution3);
        System.out.println(solution4);
        System.out.println(solution5);
    }
}
