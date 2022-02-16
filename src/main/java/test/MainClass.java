package test;

public class MainClass {
    public static void main(String[] args) {
        String str = "ravindrashinde";
        char[] strArr = str.toCharArray();

        int startPosition;
        String subString = "";

        for (int i =0; i<str.length(); i++) {
            char picked = strArr[i];
                for(int j =i+1; j<str.length(); j++){
                     if(picked != strArr[j]){
                         subString = subString+strArr[j];
                     }
                }
        }
    }

    boolean idRepeatedChar(String str){
        return true;
    }
}
