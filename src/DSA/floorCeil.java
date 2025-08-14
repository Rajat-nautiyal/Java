package DSA;

public class floorCeil {

    public static int[] getFloorAndCeil(int[] arr, int x){
        int ceil = -1;
        int floor = -1;
        int left = 0, right = arr.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == x){
                floor = x;
                ceil = x;
                return new int[]{floor,ceil};
            }else if( arr[mid] < x){
                floor = arr[mid];
                left = mid + 1;
            }else if(arr[mid] > x){
                ceil = arr[mid];
                right = mid - 1;
            }
        }
        return new int[] {floor, ceil};
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 9;
        int[] ans = getFloorAndCeil(arr, x);
        System.out.println("The floor and ceil are: " + ans[0] + " " + ans[1]);
    }

}
