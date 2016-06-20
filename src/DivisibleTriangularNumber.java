import java.util.ArrayList;
import java.util.List;

public class DivisibleTriangularNumber {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        boolean found = false;
        
        //factors(28).stream().forEach(n -> System.out.println(n));
        
        int n = 1;
        int triangular = 0;
        
        while(!found) {
            triangular = triangular + n;
            if(factors(triangular).size() > 500)
                found = true;
            n++;
        }
        
        System.out.println("result : " + triangular);
        
        long end = System.currentTimeMillis();
        System.out.println("time : " + (end - start) + "ms");
    }

    private static int triangular(final int n) {
        int result = 0;
        for(int i = 1 ; i <= n; i++)
            result = result + i;
        
        return result;
    }
    
    private static List<Integer> factors(final int n) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        int max = n;
        int count = 1;
        
        while(count < max) {
            if(n % count == 0) {
                int m = n / count;
                result.add(count);
                result.add(m);
                max = m;
            }
            count++;
        }
        
        return result;
    }
}
