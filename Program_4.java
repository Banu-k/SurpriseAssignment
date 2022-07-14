package surpriseAssignment;

public class Program_4 {
    public static void main (String[] args) {
    	int[] nums = {1,2,3,4,5,6};
        int divNum = 5;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
            	int add = nums[i] + nums[j];
         
                if (add % divNum == 0) {
                	System.out.println("Pairs (" + nums[i] + "," + nums[j] + ")");
                }
            }
        }
    }
}
 





















