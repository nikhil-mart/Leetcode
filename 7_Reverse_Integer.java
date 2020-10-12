class Solution {
    public int reverse(int x) {
      
        String result = "";
        Integer input = new Integer(x);
        
        if(x>=0)
        {
            result = "";
            String temp = input.toString();
            temp = this.reverseString(temp);
            try {
               return Integer.parseInt(temp);
            }
            catch(NumberFormatException ex)
            {
                return 0;
            }
                
        }
        else
        {
            result = '-'+"";
            String temp = input.toString();
            temp = this.reverseString(temp.substring(1));
            result+=temp;
            try {
               return Integer.parseInt(result);
            }
            catch(NumberFormatException ex)
            {
                return 0;
            }
             
        }
    }
    
    private String reverseString(String s)
    {
        StringBuilder sb = new StringBuilder(); 
        sb.append(s); 
        sb = sb.reverse(); 
        return sb.toString();
    } 
    
}