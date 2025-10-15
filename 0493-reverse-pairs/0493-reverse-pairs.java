class Solution {
    
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int countPairs(int[] nums, int low, int mid, int high){
        int right=mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>2L*nums[right]){
                right++;
            }
            cnt+=right-(mid+1);
        }
        return cnt;
    }
    public static int mergeSort(int[] arr, int low, int high) {
        int cnt=0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;

        cnt+=mergeSort(arr, low, mid);  
        cnt+=mergeSort(arr, mid + 1, high); 
        cnt+=countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);  

        return cnt;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;   


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
