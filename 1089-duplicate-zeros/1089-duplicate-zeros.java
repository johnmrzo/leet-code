class Solution {
    private void shiftToRight(int[] arr,int ind) {
        for (int i = arr.length - 1; i >= ind; i--) {
            if (i > 0) {
                arr[i] = arr[i - 1]; 
            }
        }
        return;
    }
    
    public void duplicateZeros(int[] arr) {
        
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                shiftToRight(arr, i);
                arr[i] = 0;
                i++;
            }
            i++;
        }
        return;
    }
}