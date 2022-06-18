public class SecondLargest {
    public static int largest2nd(int arr[]) {
        int size=arr.length;
        int first=arr[0];
        int second=arr[0];
        for(int i=0;i<size;i++) {
            if(arr[i]>first) {
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second && arr[i]!=first) {
                second=arr[i];
            }
        }
        return second;
    }


    public static void main(String[] args) {
        int arr[]={3,4,5,6,2,7,8};
        int res=largest2nd(arr);
        System.out.println(res);
    }
}
