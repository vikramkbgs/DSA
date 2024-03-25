class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        int mx = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        boolean[] isPresent = new boolean[128];

        while(j < s.length()){
            if(isPresent[s.charAt(j)]){
                while(s.charAt(i) != s.charAt(j)){
                    isPresent[s.charAt(i)] = false;
                    i++;
                }
            i++;
            }else{
                isPresent[s.charAt(j)] = true;
            }

            count = j - i + 1;
            if(count > mx)
                mx = count;
            j++;
        }
        return mx;
    }

}