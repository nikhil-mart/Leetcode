class Solution {
    public String longestPalindrome(String s) {
        
        int start, end;
        String result = "";
        int maxLength = 1;
        int sIndex = 0;
        
        for(int i=1; i< s.length(); i++)
        {
            start = i-1;
            end = i;
            
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end))
            {
                if(end-start+1 > maxLength )
                {
                    sIndex = start;
                    maxLength = end-start+1;
                }
                start--;
                end++;
            }
            
            start = i-1;
            end = i+1;
            
           while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end))
            {
                if(end-start+1 > maxLength )
                {
                    sIndex = start;
                    maxLength = end-start+1;
                }
                start--;
                end++;
            }
        }
        return s.substring( 
                sIndex, sIndex+maxLength);
        
    }
}