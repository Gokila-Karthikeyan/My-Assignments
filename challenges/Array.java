package challenges;
public class Array {
	  public int singleNumber(int[] nums) {
	        int singleNumber = 0;
	        for (int num : nums) {
	            singleNumber ^= num;
	        }
	        return singleNumber;
	    }
	    public static void main(String[] args) {
	        Array solution = new Array();
	        int[] nums1 = {2, 2, 1};
	        System.out.println(solution.singleNumber(nums1)); 
	        int[] nums2 = {4, 1, 2, 1, 2};
	        System.out.println(solution.singleNumber(nums2));
	        int[] nums3 = {1};
	        System.out.println(solution.singleNumber(nums3));
	    }
}
