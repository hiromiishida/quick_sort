public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{1725, 1517, 350, 718, 1072, 480, 1259, 1436, 875, 128, 1381, 708, 1542, 1046, 1707, 792, 1173, 1552, 1799, 1535, 1258, 1173, 374, 729, 595, 1329};

        // ソート前の状態を表示
        for (int value : A) {
            System.out.println(value);
        }

        System.out.println("---------------------------------------");

        quickSort(A, 0, A.length - 1);

        // ソート後の状態を表示
        for (int value : A) {
            System.out.println(value);
        }
    }

    static void quickSort(int[] data, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = data[(left + right) / 2];
        int l = left;
        int r = right;

        while (l <= r) {
            while (data[l] < pivot) {
                l++;
            }
            while (data[r] > pivot) {
                r--;
            }

            if (l <= r) {
                // 値を交換
                int tmp = data[l];
                data[l] = data[r];
                data[r] = tmp;
                l++;
                r--;
            }
        }
        quickSort(data, left, r);  // 基準値より左側をソート
        quickSort(data, l, right); // 基準値より右側をソート
    }
}

