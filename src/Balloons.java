
class Solution {
    public static int solution(String S) {
        S = S.toUpperCase();
        int B = 0;
        int A = 0;
        int L = 0;
        int O = 0;
        int N = 0;
        if(S == null)
            return 0;
        for(int i=0; i< S.length(); i++){
            if(S.charAt(i)=='B')
                B++;
            else if(S.charAt(i)=='A')
                A++;
            else if (S.charAt(i)=='L')
                L++;
            else if(S.charAt(i)=='O')
                O++;
            else if(S.charAt(i)=='N')
                N++;
        }
        if(N>= L/2 && B>= L/2 && A >= L/2 && A >= O/2  && B>= O/2 && N >= O/2){
            if(L >= O){
                int div = L/2;
                if(div <= O/2)
                    return L/2;
            }
            else if(O > L){
                int div = O/2;
                if(div <= L/2)
                    return O/2;
            }
        }
        return 0;
    }
}



