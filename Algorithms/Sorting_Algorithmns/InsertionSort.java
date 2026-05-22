public class InsertionSort {
    public static void main(String[] args) {
        int a[]={3,1,4,2,5,0,-2,8,-3};
        for(int i=1;i<a.length;i++)
        {
            int j=i-1;
            int temp=a[i];
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
            for(int k:a) System.out.print(k+" ");
            System.out.println();
        }

    }
}
