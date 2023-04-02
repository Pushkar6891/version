package company.questions.wissen.eg08twoSum;

public class ArraySum {
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        int[] arr = {1, 4, 5, 11, 12};
        int target = 23;

        obj.targetSum0(arr, target);

        for (int x : obj.targetSum1(arr, target))
            System.out.print(x + " ");

        System.out.println();

        for (int x : obj.targetSum2(arr, target))
            System.out.print(x + " ");
    }

    void targetSum0(int[] a, int target) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target)
                    System.out.println(a[i] + " " + a[j]);
            }

    }

    int[] targetSum1(int[] a, int target) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target)
                    return new int[]{i + 1, j + 1};
            }
        return new int[]{-1, -1};
    }

    int[] targetSum2(int[] a, int target) {
        int left = 0, right = a.length - 1, tempSum;
        while (left < right) {
            tempSum = a[left] + a[right];
            if (tempSum == target)
                return new int[]{left + 1, right + 1};
            if (tempSum > target)
                right--;
            else
                left++;
        }
        return new int[]{-1, -1};
    }
}
