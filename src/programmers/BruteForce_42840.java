package programmers;

import java.util.ArrayList;
import java.util.List;

public class BruteForce_42840 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}).toString()); //[1]
        System.out.println(solution(new int[]{1,3,2,4,2}).toString()); //[1,2,3]
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] solvedCnt = {0,0,0};

        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int maxCorrectAnswerCnt = 0;
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == person1[i % person1.length]) solvedCnt[0]++;
            if(answers[i] == person2[i % person2.length]) solvedCnt[1]++;
            if(answers[i] == person3[i % person3.length]) solvedCnt[2]++;
        }

        System.out.println("최대값 구하자");

        for(int i = 0 ; i < solvedCnt.length ; i++){
            maxCorrectAnswerCnt = Math.max(maxCorrectAnswerCnt, solvedCnt[i]);
        }

        System.out.println(maxCorrectAnswerCnt + ", 많이 푼애 구하자");

        List<Integer> correctPersonList = new ArrayList<>();


        for(int i = 0 ; i < solvedCnt.length ; i++){
            if(solvedCnt[i] == maxCorrectAnswerCnt) correctPersonList.add(i+1);
        }

        answer = new int[correctPersonList.size()];

        for(int i = 0 ; i < correctPersonList.size() ; i++){
            answer[i] = correctPersonList.get(i);
        }

        return answer;
    }
}
