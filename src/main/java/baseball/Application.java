package baseball;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        int answerNum = generateNum(3);
//        int answerNum = 713;
        Scanner in = new Scanner(System.in);
        int inputNum;
        boolean isRunning = true;
        while (isRunning) {
            try {
                inputNum = in.nextInt();
//                checkNum(inputNum);
            } catch (IllegalArgumentException e) {
                isRunning = false;
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * 1~9사이 숫자 중 서로 다른 n개의 숫자를 무작위로 선택해서 리턴하는 함수
     * */
    static int generateNum(int n){
        String ret = "";
        boolean[] isUsed = {false, false, false, false, false, false, false, false, false, false};
        Random random = new Random();
        int selectedNum = 0;
        while (n > 0) {
            selectedNum = random.nextInt(9)+1; // 1 <= selectedNum <= 9
            if (!isUsed[selectedNum]) {
                isUsed[selectedNum] = true;
                n--;
                ret += selectedNum;
            }
        }
        return Integer.valueOf(ret);
    }
}
