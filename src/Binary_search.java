public class Binary_search {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 4;
        System.out.println(search(nums, target));

    }

    /**
     * 二分查找
     *
     * @param nums   已经排好序的数组
     * @param target 需要查找的目标数字
     * @return 返回目标数字的数组下标
     */
    public static int search(int[] nums, int target) {
        int left = 0;  //左边界
        int right = nums.length - 1;  //右边界
        while (left <= right) {
            int mid = left + (right - left) / 2; //中间的值
            if (nums[mid] == target) {
                return mid;  //查找成功
            } else if (target < nums[mid]) {  //如果目标小于中间的数 右边界移动
                right = mid - 1;
            } else {  //如果目标大于中间的数 左边界移动
                left = mid + 1;
            }

        }
        return -1;

    }

}
