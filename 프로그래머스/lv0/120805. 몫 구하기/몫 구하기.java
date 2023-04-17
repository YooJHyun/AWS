class Solution {
    public int solution(int num1, int num2) {
        // 기본으로 주어진 매개변수 num1, num2가 int이므로 int로 선언하였다
        // 허나 정수가 아닌 실수인 경우 자료형을 double등으로 바꾸어 선언하면 계산할 수 있다
        int answer = 0;
        // answer에 값이 들어가야 하므로 값을 비워두기 위해 0을 대입한다
        answer = num1 / num2;
        // 몫을 구하는 산술연산자는 / 이므로 /를 사용한다
        return answer;
        // 계산한 값을 answer로 return한다
    }
}
