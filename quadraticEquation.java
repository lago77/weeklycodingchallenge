import java.lang.Math;
public class quadraticEquation {
    
    public static int quadratic(int a, int b, int c){
        int term = b*b - 4*a*c;
        double numerator = -b+(Math.sqrt(term));
        int denom = 2*a;
        int sol = (int)(numerator/denom);
        return sol;

    }

    public static void main(String[] args) {
       int solution1 = quadratic(1,2,-3);
       int solution2 = quadratic(2, -7, 3);

 

       int solution3 = quadratic(1, -12, -28);
       
       
       
        System.out.println(solution1);
        System.out.println(solution2);
        System.out.println(solution3);
    }
}
