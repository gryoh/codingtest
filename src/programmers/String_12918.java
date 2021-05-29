package programmers;

public class String_12918 {
    public static void main(String[] args) {
        System.out.println(solution("a123"));   //false
        System.out.println(solution("1234"));   //true
    }
    public static boolean solution(String s) {
        boolean answer = true;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                answer = false;
                break;
            }
        }
        return answer;
    }
}

