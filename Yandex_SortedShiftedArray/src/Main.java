public class Main {

    public static void main(String[] args) {

        int[] nums = new int[] {0,2,2,8,9};

        int left = 0;
        int right = nums.length - 1;

        int count = 0;

        while (left < right) {
            int mid = (int) Math.floor((left + right) / 2);

            if (nums[left] <= nums[mid]) {
                left = mid;
            } else {
                right = mid;
            }

            count = count + 1;

            if (right - left == 1) {
                if (nums[left] < nums[right]) {
                    System.out.println(nums[right]);
                } else {
                    System.out.println(nums[left]);
                }
                break;
            }
        }
        System.out.println("number of iterations is: " + count);
    }
}
