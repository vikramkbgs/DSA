class Solution {
    public boolean areOccurrencesEqual(String s) {
        ArrayList<Integer> alphaMap = new ArrayList<>();
        if(s.length() == 1)
          return false;

        for(int i = 0; i<26; i++){
            alphaMap.add(0); 
        }

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') { 
                int key = ch - 'a';
                int value = alphaMap.get(key);
                alphaMap.set(key, value + 1);
            }
        }

        int count = alphaMap.get(0); 

        for(int i = 1; i<26; i++){
            if(alphaMap.get(i) == 0)
                continue;
            else if(alphaMap.get(i) != count)
              return false;
            
        }
        return true;
    }
}