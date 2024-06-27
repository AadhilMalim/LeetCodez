class Solution {
    public int romanToInt(String s) {
        int sum =0;
		
		HashMap<Character, Integer> mymap1 = new HashMap<Character, Integer>();
		mymap1.put('I', 1);
		mymap1.put('V', 5);
		mymap1.put('X', 10);
		mymap1.put('L', 50);
		mymap1.put('C', 100);
		mymap1.put('D', 500);
		mymap1.put('M', 1000);
		
		char[] given = s.toCharArray();
		int len = given.length;
        
        while(len>1){
            char b1 = given[len-1];
            char b2 = given[len-2];
            if(mymap1.get(b1) > mymap1.get(b2)){
                sum+=mymap1.get(b1)-mymap1.get(b2);
                len-=2;
            }else{
                sum+=mymap1.get(b1);
                len--;
            }
        }
        if(len==1)
		{
			sum+=mymap1.get(given[0]);
		}
		return sum;
    }
}

