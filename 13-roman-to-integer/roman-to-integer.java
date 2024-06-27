class Solution {
    public int romanToInt(String s) {
        int sum =0;
		
		Map<Character, Integer> mymap1 = new HashMap<Character, Integer>();
		mymap1.put('I', 1);
		mymap1.put('V', 5);
		mymap1.put('X', 10);
		mymap1.put('L', 50);
		mymap1.put('C', 100);
		mymap1.put('D', 500);
		mymap1.put('M', 1000);
		
		
		int len = s.length();
        
       while(len>1){
            int b1 = mymap1.get(s.charAt(len-1));
            int b2 = mymap1.get(s.charAt(len-2));
            if( b1 > b2){
                sum+=b1-b2;
                len-=2;
            }else{
                sum+=b1;
                len--;
            }
        }
        if(len==1)
		{
			sum+=mymap1.get(s.charAt(0));
		}
		return sum;
    }
}

