public class bubleSort {

    public static void main(String[] args) {
        int[] intarr=new int[]{12,5,44,777,2,71,1,22,44,11,11,77,11};

        bsort(intarr);

    }
    public static void bsort(int[] intarr){

        for(int i=intarr.length-2;i>=0;i--)
        {
            for(int j=0;j<=i;j++){
                if(intarr[j]>intarr[j+1]){
                    int temp=intarr[j];
                    intarr[j]=intarr[j+1];
                    intarr[j+1]=temp;
                }
            }
        }
        for (int i:intarr
             ) {
            System.out.print(i+" ");
        }
    }
}
