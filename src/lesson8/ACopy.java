package lesson8;

public class ACopy {
    public static void main(String[] args) {

        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }
        ArrayUtils.randomArray(nums1, -10, 10);

            System.out.println("num1:");
            ArrayUtils.showArray(nums1);
            System.out.println("\nnum2 before coping:");
            ArrayUtils.showArray(nums2);
        ArrayUtils.CopyArray(nums1, nums2);
            System.out.println("\nnums2 after coping");
            ArrayUtils.showArray(nums2);
        System.out.println("\nFORE EACH");
        ArrayUtils.showArray(nums1);
        System.out.println("Sum:");
        System.out.println(ArrayUtils.sumElements(nums1, 3));

        ArrayUtils.searchElement(nums1, -6);
        }
    }
