class Solution {
    public int minPartitions(String n) {
        char[] c=n.toCharArray();
        char max = '0';int len = n.length();
        for(int i=0;i<len; i++){
            if(c[i]>max) max=c[i];
        }
        // System.out.println(max);
        return (int) max-48;
    }
}