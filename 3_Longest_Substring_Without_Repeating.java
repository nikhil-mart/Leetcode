class Solution {
    public int lengthOfLongestSubstring(String s) {
      
//         //M1
//         int res = 0;
//         int i, j;
        
//         for(i=0; i<s.length(); i++)
//         {
//             Boolean[] visited = new Boolean[256];
//             Arrays.fill(visited, false);
            
//             for(j=i; j<s.length(); j++)
//             {
//                 if(visited[s.charAt(j)]== true)
//                 {
//                     break;
//                 }
//                 else 
//                 {
//                     res = Math.max(res, j-i+1);
//                     visited[s.charAt(j)] = true;
//                 }
//             }
            
//             visited[s.charAt(i)]= false;
//         }
//         return res;
        
        //M2
        
        int res = 0;
        int start = 0, end;
        int result = 0;
        int index[] = new int[256];
        Arrays.fill(index, -1);
        
        for(end=0; end < s.length(); end++)
        {
             start = Math.max(start, index[s.charAt(end)]+1);
             result = Math.max(result, end-start+1);
             index[s.charAt(end)] = end; 
        }
        return result;
    }
}