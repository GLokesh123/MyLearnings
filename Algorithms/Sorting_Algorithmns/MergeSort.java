public class MergeSort {
    static void merge(int a[],int low,int mid,int high)
    {
        int  i=low,j=mid+1;
        int arr[]=new int[high-low+1];
        int k=0;
        while(i<=mid&&j<=high)
        {
            if(a[i]>a[j])
            {
                arr[k++]=a[j++];
            }
            else
            {
                arr[k++]=a[i++];
            }
        }
        while(i<=mid)
        {
            arr[k++]=a[i++];
        }
        while(j<=high)
        {
            arr[k++]=a[j++];
        }
        for(int x=0;x<arr.length;x++)
        {
            a[low++]=arr[x];
        }

    }
    static void sort(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            sort(a,low,mid);
            sort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int a[]={5,2,7,-2,-6,0,5,3};
        sort(a,0,a.length-1);
        for(int x:a) System.out.print(x+" ");
    }
    public static void sort1(int arr[],int low,int high)
    {
        if(low>=high) return;
        int mid=(low+high)/2;
        sort1(arr,low,mid);
        sort1(arr,mid+1,high);
        merge1(arr,low,mid,high);
    }
    public static void merge1(int arr[],int low,int mid,int high)
    {
        int temp[]=new int[arr.length];
        int k=0;
        int i=low,j=mid+1;
        while(i<=mid&&j<=high)
        {
            if(arr[i]>arr[j]) temp[k++]=arr[j++];
            else temp[k++]=arr[i++];
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=high) temp[k++]=arr[j++];
        for(int m=0;m<arr.length;m++) arr[m]=temp[m];
    }
}
