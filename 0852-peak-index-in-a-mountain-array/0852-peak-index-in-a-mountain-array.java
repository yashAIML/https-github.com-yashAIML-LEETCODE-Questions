class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int moutain = arr[0];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > moutain){
                moutain = arr[i];
                index = i;
            }
        }
        return index;
    }
}