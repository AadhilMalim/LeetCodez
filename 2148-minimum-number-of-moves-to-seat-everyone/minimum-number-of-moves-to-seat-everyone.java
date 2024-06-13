class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int len = seats.length;

        Arrays.sort(seats);
        Arrays.sort(students);
        int swaps = 0;
        
        
        for(int i=0; i<len  ;i++){
           swaps+= Math.abs(students[i]-seats[i]);
        }

        return swaps;
    }
}