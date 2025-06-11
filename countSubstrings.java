class Solution {
    
    public int countSubstrings(String s) {
        int count = 0;

        //first test odd functions via expansion
        for(int i=0; i<s.length();i++){
            for(int j=0; j<s.length();j++){
                if(i-j < 0 || i+j > s.length()-1){
                    break;
                }
                if(s.charAt(i-j) == s.charAt(i+j)){
                    count = count + 1;
                } else {
                    break;
                }
            }
        }

        for(int i=0; i<s.length()-1;i++){
            for(int j=0; j<s.length();j++){
                if(i-j < 0 || i+j+1 > s.length()-1){
                    break;
                }
                if(s.charAt(i-j) == s.charAt(i+j+1)){
                    count = count + 1;
                } else {
                    break;
                }
            }
        }


        //then test even functions via expansion
        return count;
        
    }
}