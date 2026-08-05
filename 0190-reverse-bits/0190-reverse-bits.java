class Solution {
    public int reverseBits(int n) {
        String a=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String rev = new StringBuilder(a).reverse().toString();
        return (int)Long.parseLong(rev, 2);
    }
}