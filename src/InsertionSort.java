public class InsertionSort {
  private InsertionSort() {}

  private void sort(int[] input) {
    for (int i = 1; i < input.length; i++) {
      int key = input[i];
      int j = i - 1;
      while (j >= 0 && input[j] > key) {
        input[j+1] = input[j];
        j--;
      }
      input[j+1] = key;
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
    new InsertionSort().sort(arr);
    System.out.println("after sorting");
    for (int i: arr) {
      System.out.println(i);
    }
  }
}
