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
        if(len==1)
		{
			sum+=mymap1.get(given[0]);
		}
        else{
            for( int i=len-1; i>0;i--) {
			
				char c1 = given[i];
				char c2 = given[i-1];
				
				if(mymap1.get(c1)>mymap1.get(c2)) {
					sum+= mymap1.get(c1)-mymap1.get(c2);
					i--;
				}else {
					sum+=mymap1.get(c1);
				}
            }
            if(mymap1.get(given[0]) >= mymap1.get(given[1]))
            {
                sum+=mymap1.get(given[0]);
            }
        }
		
		return sum;
    }
}

