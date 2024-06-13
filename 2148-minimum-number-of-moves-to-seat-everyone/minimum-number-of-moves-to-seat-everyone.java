class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int len = seats.length;
        // if(len==1) return 0;

        for(int i=0; i<len; i++){
            for(int j=i+1;j<len; j++){
                if(seats[j]<seats[i]){
                    int temp = seats[i];
                    seats[i] = seats[j];
                    seats[j] = temp;
                }
                if(students[j]<students[i]){
                    int temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        int swaps = 0;
        int first = students[0] - seats[0];
        if(first<0) swaps+= first*-1; else swaps+=first;
        for(int i=1; i<len  ;i++){
            first= students[i] - seats[i];
                if(first<0) swaps+= first*-1; else swaps+=first;
        }

        return swaps;
    }
}