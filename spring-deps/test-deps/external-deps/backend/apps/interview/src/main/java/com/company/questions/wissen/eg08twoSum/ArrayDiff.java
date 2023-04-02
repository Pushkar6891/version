package company.questions.wissen.eg08twoSum;

public class ArrayDiff {
    public static void main(String[] args) {
        ArrayDiff obj = new ArrayDiff();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        obj.findPair(arr, target);
    }

    public void findPair(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
    }
}

