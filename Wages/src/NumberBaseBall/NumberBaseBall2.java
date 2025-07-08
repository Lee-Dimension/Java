package NumberBaseBall;

import java.util.Arrays;

public class NumberBaseBall2 {

    public static boolean isInArray(int[] arr, int num, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }

    public static boolean isGenerated(String[] arr, String key, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(key)) return true;
        }
        return false;
    }

    public static boolean includesAll(int[] target, int tSize, int[] source, int sSize) {
        int match = 0;
        for (int i = 0; i < sSize; i++) {
            for (int j = 0; j < tSize; j++) {
                if (source[i] == target[j]) {
                    match++;
                    break;
                }
            }
        }
        return match == sSize;
    }

    public static int playOneGame() {
        String[] generated = new String[720]; // 조합 중복 방지용
        int genCount = 0;

        int[] mustInclude = new int[10]; // 반드시 포함되어야 하는 숫자들
        int mustCount = 0;

        int randomNumber1 = (int)(Math.random() * 10);
        int randomNumber2, randomNumber3;

        do {
            randomNumber2 = (int)(Math.random() * 10);
        } while (randomNumber2 == randomNumber1);

        do {
            randomNumber3 = (int)(Math.random() * 10);
        } while (randomNumber3 == randomNumber1 || randomNumber3 == randomNumber2);

        int[] correct = {randomNumber1, randomNumber2, randomNumber3};

        int predictNumber1, predictNumber2, predictNumber3;
        int[] dontUse = new int[100];
        Arrays.fill(dontUse, -1);
        int inNum = 0;

        for (int round = 1; round <= 1000; round++) {
            int strike = 0, ball = 0;
            int[] predict = new int[3];

            while (true) {
                do {
                    predictNumber1 = (int)(Math.random() * 10);
                } while (isInArray(dontUse, predictNumber1, inNum));

                do {
                    predictNumber2 = (int)(Math.random() * 10);
                } while (predictNumber2 == predictNumber1 || isInArray(dontUse, predictNumber2, inNum));

                do {
                    predictNumber3 = (int)(Math.random() * 10);
                } while (predictNumber3 == predictNumber1 || predictNumber3 == predictNumber2 || isInArray(dontUse, predictNumber3, inNum));

                String key = predictNumber1 + "," + predictNumber2 + "," + predictNumber3;
                if (isGenerated(generated, key, genCount)) continue;

                int[] currentSet = {predictNumber1, predictNumber2, predictNumber3};
                if (mustCount > 0 && !includesAll(currentSet, 3, mustInclude, mustCount)) {
                    continue;
                }

                generated[genCount++] = key;
                predict[0] = predictNumber1;
                predict[1] = predictNumber2;
                predict[2] = predictNumber3;
                break;
            }

            for (int i = 0; i < 3; i++) {
                if (predict[i] == correct[i]) {
                    strike++;
                } else if (predict[i] == correct[0] || predict[i] == correct[1] || predict[i] == correct[2]) {
                    ball++;
                }
            }

            if (strike == 3) return round;

            if (strike == 0 && ball == 0) {
                for (int j = 0; j < 3; j++) {
                    dontUse[inNum++] = predict[j];
                }
            }

            if ((strike == 0 && ball == 3) || (strike == 1 && ball == 2)) {
                for (int j = 0; j < 3; j++) {
                    if (!isInArray(mustInclude, predict[j], mustCount)) {
                        mustInclude[mustCount++] = predict[j];
                    }
                }
            }
        }

        return 1000; // 실패 시
    }

    public static void main(String[] args) {
        int totalRounds = 0;
        int trials = 100;

        for (int i = 1; i <= trials; i++) {
            int rounds = playOneGame();
            System.out.println(i + "번째 게임: " + rounds + " 라운드 만에 정답");
            totalRounds += rounds;
        }

        double average = (double) totalRounds / trials;
        System.out.printf("100회 평균 라운드 수: %.2f회\n", average);
    }
}
