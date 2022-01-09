package Searching;




public class BinarySearchTwo{
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = bS(arr, target);
        System.out.println(ans);
    }

    static int bS(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;

        boolean isAsc = arr[s]<arr[e];

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    s = mid+1;
                }
                else if(target<arr[mid]){
                    e = mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    e = mid-1;
                }else if(target<arr[mid]){
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}