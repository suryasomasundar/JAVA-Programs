package LeetCode;

public class LongestCommonSubstring {

    /**
     * Dynamic way of calculating lcs
     */
    public static int longestCommonSubstring(String s1 , String s2){
    	char[] str1 = s1.toCharArray();
    	char[] str2 = s2.toCharArray();
        int T[][] = new int[str1.length+1][str2.length+1];
        
        int max = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        max = T[i][j];
                    }
                }
            }
        }
        return max;
    }
    //****Recursive****
    public static int longestCommonSubstringRec(char str1[], char str2[], int pos1, int pos2, boolean checkEqual){
        if(pos1 == -1 || pos2 == -1){
            return 0;
        }
        if(checkEqual){
            if(str1[pos1] == str2[pos2]){
                return 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
            }else{
                return 0;
            }
        }
        int r1 = 0;
        if(str1[pos1] == str2[pos2]){
            r1 = 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
        }
        return Math.max(r1,Math.max(longestCommonSubstringRec(str1, str2, pos1-1, pos2, false), longestCommonSubstringRec(str1, str2, pos1, pos2-1,false)));
    }
    
    
    public static void main(String[] args){
        char str1[] = "abcdaf".toCharArray();
        char str2[] = "zbcdf".toCharArray();
    	System.out.println(longestCommonSubstring("abcdaf" , "zbcdf"));
    	System.out.println(longestCommonSubstringRec(str1, str2,str1.length-1, str2.length-1,false));
    }
}