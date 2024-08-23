public class selectionSort {
      public static void main(String[] args) {
            int a[] = { 7, 8, 3, 1, 2 };
            // time complexity is O(N^2)
            for (int i = 0; i < a.length - 1; i++) {
                  int small = i;
                  for (int j = i + 1; j < a.length; j++) {
                        if (a[j] < a[small]) {
                              small = j;
                        }
                  }
                  int temp = a[small];
                  a[small] = a[i];
                  a[i] = temp;

            }
            for (int i = 0; i < a.length; i++) {
                  System.out.print(a[i] + " ");
            }
      }
}
