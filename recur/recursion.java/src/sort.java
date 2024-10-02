import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class sort {
    static int partition(int[] arr, int low, int high) {
        int i = (low - 1);
        int pivot = arr[high];
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low <= high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static void printArr(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void countSort(int[] array) {
        if(array == null || array.length <= 1) {
          return;
        }
    
        int max = array[0];
        for(int num : array) {
          if(num > max) {
            max = num;
          }
        }
    
        int[] countArray = new int[max + 1];
    
        for(int num : array) {
          countArray[num]++;
        }
    
        int index = 0;
        for(int i=0; i<= max; i++) {
          while(countArray[i] > 0) {
            array[index] = i;
            index++;
            countArray[i]--;
          }
        }

      }


        public static void countSortHash(int[] arr) {
          if(arr == null || arr.length <= 1) {
            return;
          }
      
          int max = Arrays.stream(arr).max().getAsInt();
          int min = Arrays.stream(arr).min().getAsInt();
      
          Map<Integer, Integer> countMap = new HashMap<>();
      
          for(int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
          }
      
          int index = 0;
          for(int i=min; i<=max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for(int j=0; j < count; j++) {
              arr[index] = i;
              index++;
            }
          }
      
    }  
    

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;
        countSort(arr);
        printArr(arr);
        countSortHash(arr);
        System.out.println();
        printArr(arr);
    }
}
