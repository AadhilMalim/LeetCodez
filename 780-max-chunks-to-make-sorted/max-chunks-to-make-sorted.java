class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int indxsum = 0;
        int valuesum = 0;
        for(int i=0; i< arr.length;i++){
            indxsum+=i;
            valuesum+=arr[i];
            if(indxsum == valuesum) chunks++;
        }
        // chunks++;
        return chunks;
    }
}