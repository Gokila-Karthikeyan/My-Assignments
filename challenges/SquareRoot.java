package challenges;
	public class SquareRoot {
		 public int mySqrt(int x) {
		        if (x == 0 || x == 1) {
		            return x;
		        }
		        long left = 1;
		        long right = x;
		        long result = 0;
		        
		        while (left <= right) {
		            long mid = left + (right - left) / 2;
		            long square = mid * mid;
		            
		            if (square == x) {
		                return (int) mid;
		            } else if (square < x) {
		                result = mid;
		                left = mid + 1;
		            } else {
		                right = mid - 1;
		            }
		        }
		        
		        return (int) result;
		    }
		    public static void main(String[] args) {
		        SquareRoot solution = new SquareRoot();
		        System.out.println(solution.mySqrt(4)); 
		        System.out.println(solution.mySqrt(8)); 
		    }
}
