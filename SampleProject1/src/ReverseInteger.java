public class ReverseInteger {
    public static int reverse(int x) {
        int[] digits = new int[10];
        int i = 0;
        while(x%10!=0){
            digits[i] = x%10;
            x = x/10;
            i++;
        }
        int answer = 0;
        for( int temp=0; temp < digits.length; temp++){
            answer*=10;
            answer+=digits[temp];
        }
        return answer;

    }

    public static void main(String[] args) {
        reverse(123);
    }

}
