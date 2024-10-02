
 class Main{
    static int partition(int[]arr,int low,int high){
        int i = (low-1);
        int pivot = arr[high];
        for (int j = 0; j<high; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
            
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
     static void Quicksort(int[]arr,int low,int high){
        if(low <= high){
            int pi = partition(arr,low,high);
            Quicksort(arr,low,pi-1);
            Quicksort(arr,pi+1,high);
        }
     }
        static void Print(int[] arr){
           for (var i = 0; i < arr.length; i++) {
               System.out.print(arr[i]+" ");
               
           }
        }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 6, 5, 4};
        int N = arr.length;
        Quicksort(arr,0,N-1);
        Print(arr);
    }
}




