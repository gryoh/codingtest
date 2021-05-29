package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForce_42839 {
    public static void main(String[] args) {
        System.out.println(solution("17")); // 3
        System.out.println(solution("011")); // 2

    }

    public static int solution(String numbers) {
        int answer = 0;
        int[] numArr = new int[numbers.length()];
        List<Integer> sosuList = new ArrayList<>();
        //todo 만들 수 있는 숫자 구하기
        for(int i = 0 ; i < numbers.length() ; i++){
            for(int j = 0 ; j < numbers.length() ; j++){

            }
        }

        //todo 소수 판단 로직

        String a = "0a1234";
        char[] charArr = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println("aa" + Arrays.binarySearch(charArr , '0'));


        return answer;
    }
}
