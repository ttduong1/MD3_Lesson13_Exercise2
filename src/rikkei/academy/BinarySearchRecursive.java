package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khởi tạo một mảng với các giá trị đầu vào.
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng tăng dần.
        Arrays.sort(array);

        //Bước 3: Xác định chức năng tìm kiếm nhị phân.
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        int result = binarySearch(array, 0, n - 1, value);

        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng !");
        } else {
            System.out.println("Giá trị được tìm thấy tại chỉ mục " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        // Thoát điều kiện cho hàm đệ quy.
        if (left > right) {
            return -1;
        }

        // Bước 4: Tính chỉ số giữa.
        int middle = (left + right) / 2;

        // Bước 5: Kiểm tra xem phần tử ở giữa có phải là giá trị cần tìm không.
        if (array[middle] == value) {
            return middle;
        }

        // Bước 6: Nếu giá trị lớn hơn phần tử ở giữa, tìm kiếm nửa bên phải của mảng.
        if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        }

        // Bước 7: Nếu giá trị nhỏ hơn phần tử ở giữa, tìm kiếm nửa bên trái của mảng.
        return binarySearch(array, left, middle - 1, value);
    }
}
