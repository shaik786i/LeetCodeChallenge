class Solution {
    public boolean isPalindrome(String s) {
        
        // char[] c = s.toCharArray();
        // String s = "";
        // for(ch in c) {
        //     if()
        // }
        String st = "";
        for(int i=0; i<s.length();i++) {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                st+=s.charAt(i);
            }
        }
        st = st.toLowerCase();
        int start = 0;
        int end = st.length()-1;
        System.out.print(st);
        while(start < end) {
            if(st.charAt(start) != st.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;

    }
}
