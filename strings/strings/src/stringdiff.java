class stringdiff{
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";
        // int n = Math.max(str1.length(),str2.length());
    
        boolean[] visited = new boolean[127];
        

     for (int i = 0; i < str1.length(); i++) {
         char ch = str1.charAt(i);
         visited[ch-'a'] = true;
        
        
    }
    for (int i = 0; i < str2.length(); i++) {
        char ch = str2.charAt(i);
        if(!visited[ch]){
            System.out.println(ch);
        }
        

    }
   

        

    }
}
