class Solution {
    public int minPartitions(String n) {
        char[] c=n.toCharArray();
        char max = '0';
        for(int i=0;i< c.length; i++){
            if(c[i]>max) max=c[i];
        }
        // System.out.println(max);
        return (int) max-48;
    }
}