public class cyclicRedone {
    public static void main(String[] args) {
        int arr[] = {3, 2, 0, 5, 1};
        int element=cyclicSort(arr);
        System.out.println(element);
    }

    static int cyclicSort(int arr[]) {
        int index;
        int i = 0;
        while (i < arr.length) {
            index = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j <arr.length; j++) {
            if (arr[j] != j) {
                return  j;
            }
        }
        return  arr.length;
    }
}
