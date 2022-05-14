import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 3, 4, 9, 6, 7};
        for (Integer i : QuickSort(nums, 0, nums.length - 1)
        ) {
            System.out.println(i);

        }

    }

    /**
     * 冒泡排序
     *
     * @param nums 需要排序的数组
     * @return 返回已经排序好的数组
     */
    public static int[] BubbleSort(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
//        越大的数越往上走
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {  //每两个相邻的数进行一次比较 大的数上去
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 选择排序
     *
     * @param nums 需要排序的数组
     * @return 返回已经排好序的数组
     */
    public static int[] SelectionSort(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
//            默认每次选择的I是最小值
            int minNum = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minNum]) {
//                    如果后面还有比当前最小值小的数字则需要替换  将minNUm重新定义为当前下标
                    minNum = j;
                }
            }
            int temp = nums[minNum];
            nums[minNum] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    /**
     * 插入排序
     *
     * @param nums 需要排序的数组
     * @return 返回已经排序好的数组
     */
    public static int[] InsertSort(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int current;
        for (int i = 0; i < nums.length - 1; i++) {
            current = nums[i + 1];  //当前需要插入的数字
            int preIndex = i; //need to be compared
            while (preIndex >= 0 && current < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--; //preIndex向前走
            }
//           需要
            nums[preIndex + 1] = current;
        }
        return nums;

    }

    /**
     * 快速排序算法
     * 其实就是二叉树问题 使用两个指针low and high
     *
     * @param nums
     * @return
     */
    public static int[] QuickSort(int[] nums, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return nums;
        }
        i = low;
        j = high;
        temp = nums[low];
        while (i < j) {
//            先看右边 依次向左递减
//            如果右边的数大于temp说明符合要求 指针向左移动
            while (temp <= nums[j] && i < j) {
                j--;
            }
//            再看左边 依次向右递增
//            如果左边的数小于temp说明符合要求 指针向右移动
            while (temp >= nums[i] && i < j) {
                i++;
            }
            if (i < j) {
//               z 和y 都是临时变量用于swap数字
//               这个操作将右边 小于temp的数字（不符合预期）与左边 大于temp的数字（不符合预期） 两个数字进行swap
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }

        }
//        说明已经跳出i<j的循环  已经达到两个指针指向同一个位置的时候
//        将基准与（i和j相等的位置的数字）交换
        nums[low] = nums[i];
        nums[i] = temp;
//        递归调用左半边数组
        QuickSort(nums, low, j - 1);
//        递归调用右半边数组
        QuickSort(nums, j + 1, high);
        return nums;

    }


    /**
     * 归并排序
     *
     * @param nums 传入需要排序的数组
     * @return 返回已经排序好的数组
     */


}
