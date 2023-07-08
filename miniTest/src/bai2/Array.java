package bai2;

public class Array {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1,63,3,12,142,6,88,8,9,20};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
        System.out.println("Gia tri lon nhat trong mang la: " + max);
    }
}
