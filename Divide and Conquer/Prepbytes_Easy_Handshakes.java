// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/WINNER1

// Explanation -    let us take A = 3, i.e. 1 2 3,
//                  i = 1, sum[1] = 1*1; //1
//                  i = 2, sum[2] = 2*2 + sum[1]; //4 + 1 = 5
//                  i = 3, sum[3] = 3*3 + sum[2]; //9 + 5 = 14
//                  Now, the largest value of i such the maximum amount of emotion that should be left in the party should be less than
//                  or equal to A should be i = 1, as it's total emotion value is less than or equal to A which is equal to 3 in this case

public class Prepbytes_Easy_Handshakes {
    public static int solve(int A, int emotion, int prevEmotion, int i){
        if(emotion > A){
            return i - 2;
        }

        emotion = (i * i) + prevEmotion;
        prevEmotion = emotion;

        return solve(A, emotion, prevEmotion,i + 1);
    }

    public static void main(String[] args) {
        int A = 9;
        int ans = solve(A, 0, 0, 1);
        System.out.println(ans);
    }
}
