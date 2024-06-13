class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int len = seats.length;
        // if(len==1) return 0;

        Arrays.sort(seats);
        Arrays.sort(students);
        int swaps = 0;
        
        
        for(int i=0; i<len  ;i++){
           int  first= students[i] - seats[i];
                if(first<0) swaps+= first*-1; else swaps+=first;
        }

        return swaps;
    }
}