public class RevercedArray {

    public static int[] intarr=new int[]{12,44,15,165,4711,1,888,14,444,1};

    public static void main(String[] args) {

        for (int i:intarr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] arr=reverceArr(intarr);
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }

    public static int[] reverceArr(int[] intaarr){

        int l=intaarr.length;
        System.out.println(l);
        int[] arr=new int[l];
        for (int i=0;i<l;i++){
            arr[l-i-1]=intaarr[i];
        }
        intaarr=arr;
        return intaarr;
    }
}
