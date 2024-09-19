package codingCompetitive.maharishiProblems;

public class sample1 {
    static int check(int[] arr){
        if (arr == null || arr.length % 2 == 0) return 0;
        int min = arr[arr.length / 2];
        int index = arr.length / 2;
        for (int i = 0; i < arr.length; i++)
            if (index != i && arr[i] <= min) return 0;
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 4, 5};
        System.out.println(check(arr));

    }
}
