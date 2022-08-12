public class Wipro_Niranjan_CountTheVowels {
    public static String solve(String str){
        String res = "";
        String ans = "";
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for(int j=0; j<str.length(); j++){
            if(str.charAt(j) == 'a'){
                a++;
            }
            else if(str.charAt(j) == 'e'){
                e++;
            }
            else if(str.charAt(j) == 'i'){
                i++;
            }
            else if(str.charAt(j) == 'o'){
                o++;
            }
            else if(str.charAt(j) == 'u'){
                u++;
            }
        }

        if(a == 1 && e == 1 && i == 1 && o == 1 && u == 1){
            ans = str;
            ans = ans.replace("a", "");
            ans = ans.replace("e", "");
            ans = ans.replace("i", "");
            ans = ans.replace("o", "");
            ans = ans.replace("u", "");
            ans = ans.toUpperCase();
            ans = ans + ":" + ans.length();
            return ans;
        }
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        res = String.valueOf(input1);
        res = res.toUpperCase();
        res = res + ":" + "ERROR";
        return res;
    }

    public static void main(String[] args) {
        String str1 = "cauliflower";
        String ans1 = solve(str1);
        System.out.println(ans1);

        String str2 = "arsenious";
        String ans2 = solve(str2);
        System.out.println(ans2);

        String str3 = "caesiious";
        String ans3 = solve(str3);
        System.out.println(ans3);

        String str4 = "abcdaaaa";
        String ans4 = solve(str4);
        System.out.println(ans4);
    }
}
