public class QuickSort {

  private QuickSort() {}

  private int partition(int[] input, int start, int end) {
    int pivotElement = input[end];
    int i = start - 1;
    int tmp;

    for (int j = start; j < end; j++) {
      if (input[j] < pivotElement) {
        i++;
        tmp = input[i];
        input[i] = input[j];
        input[j] =  tmp;
      }
    }

    tmp = input[i+1];
    input[i+1] = input[end];
    input[end] = tmp;

    return i+1;
  }

  private void sort(int[] input, int start, int end) {
    if (start < end) {
      int pivot = partition(input, start, end);
      sort(input, start, pivot - 1);
      sort(input, pivot + 1, end);
    }
  }

  private static int[] generateRandomArray(int size) {
    int[] arr = new int[size];
    for (int i=0; i<size; i++) {
      arr[i] = (int)(Math.random() * 100) + 10;
    }
    return arr;
  }

  public static void main(String[] args) {
    int arraySize = 10;
    int[] arr = generateRandomArray(arraySize);
    System.out.println("before sorting");
    for (int i : arr) {
      System.out.println(i);
    }
    new QuickSort().sort(arr, 0, arraySize - 1);
    System.out.println("after sorting");
    for (int i: arr) {
      System.out.println(i);
    }
  }
}
