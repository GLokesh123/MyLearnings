public class BubbleSort {
    //T.C=O(n^2)
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                for(int n:arr)
                {
                    System.out.print(n+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
