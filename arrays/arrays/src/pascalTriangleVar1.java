//Given row and column, we need to find the element at p(r,c) in the pascal triangle

public class pascalTriangleVar1{
    

    static int nCr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }

        return res;
    }

    public static int findEle(int r,int c){
        int element = nCr(r - 1, c - 1);
        return element;
    }


    public static void main(String[] args){
        int r = 5; // row number
        int c = 3; // col number
        int element = findEle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }





} 
