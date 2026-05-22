public class SelectionSort {
    //T.C=O(n^2) but better than buuble sort since both have same T.C
    public static void main(String[] args) {
        int arr[]={2,5,3,7,4,8};

        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }

            //swapping only occurs in outer loop unlike bubble sort in which swapping occurs inside inner loop
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;


            for(int n:arr) System.out.print(n+" ");
            System.out.println();
        }
    }
}
