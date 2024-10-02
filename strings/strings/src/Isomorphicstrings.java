public class Isomorphicstrings {
    static boolean isIsomorphic(String s , String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] freqS = new int[127];
        int[] freqT = new int[127];
       /*  s.toLowerCase();
        t.toLowerCase(); */
        for (int i = 0; i < s.length(); i++) {
            if (freqS[s.charAt(i)]!=freqT[t.charAt(i)]) {
                return false;
            }
            freqS[s.charAt(i)]=i+1;
            freqT[t.charAt(i)]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        if (isIsomorphic(s, t)) {
            System.out.println("Strings are isomorphic");
        }
        else{
            System.out.println("Strings are not isomorphic");
        }
    }
}
