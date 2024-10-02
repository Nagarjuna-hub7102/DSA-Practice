public class array3 {
    boolean boolean1 = false;
    boolean isequal(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                boolean1 = true;
            }
            else{
                boolean1 = false;
            }
        }
        return boolean1;
    }

    int solution(int[] arr,int[] board){
        int count =0;
        int[] arr2 = new int[arr.length];
        while(!isequal(arr, arr2)){
            for(int i=0;i<arr.length;i++){
                arr2[board[i]-1]=arr[i];
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] board={2,3,1,5,4};
        array3 ar = new array3();
        System.out.println(ar.solution(arr, board));
    }
}
