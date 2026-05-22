public class QuickSort {
    static int partition(int[] a,int low,int high)
    {
        //int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(a[j]<a[high])
            {
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp=a[high];
        a[high]=a[i+1];
        a[i+1]=temp;

        return i+1;
    }
    static void quickSort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int p=partition(a,low,high);
            quickSort(a,low,p-1);
            quickSort(a,p+1,high);
        }
    }
    public static void main(String[] args) {
        int a[]={0,5,2,-4,5,8,4};
        quickSort(a,0,a.length-1);
        for(int i:a) System.out.print(i+" ");
    }
}
