package day3;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 반을 입력하시겠습니까? : "); 
        int c = sc.nextInt();
        int[] stuNum = new int[c]; //
        for (int x = 0; x < c; x++) {
            System.out.print((x + 1) + "반에는 몇 명의 정보를 입력하시겠습니까? : ");
            stuNum[x] = sc.nextInt();
        }
        String[][] name = new String[c][];
        int[][][] num = new int[c][][];
        float[][] avg = new float[c][];
        String[] Sub = { "국어", "영어", "수학" };
        for (int k = 0; k < c; k++) {
            name[k] = new String[stuNum[k]];
            num[k]  = new int[stuNum[k]][4];  // [국어, 영어, 수학, 총점]
            avg[k]  = new float[stuNum[k]];
            for (int i = 0; i < stuNum[k]; i++) {
                System.out.print((k + 1) + "반 " + (i + 1) + "번째 사람의 이름을 입력하세요 : ");
                name[k][i] = sc.next();
                for (int j = 0; j < 3; j++) {
                    System.out.print(name[k][i] + "의 " + Sub[j] + " 점수를 입력하세요 : ");
                    num[k][i][j] = sc.nextInt();
                    num[k][i][3] += num[k][i][j];  // 총점 계산
                }
                avg[k][i] = num[k][i][3] / 3f;     // 평균 계산
            }
        }
        System.out.println("\n반\t이름\t국어\t영어\t수학\t총점\t평균");
        for (int d = 0; d < c; d++) {
            for (int a = 0; a < stuNum[d]; a++) {
                System.out.printf(
                	d+1+"\t"+name[d][a]+"\t"+num[d][a][0]+"\t"+num[d][a][1]+"\t"+num[d][a][2]+"\t"+num[d][a][3]+"\t"+avg[d][a]+"\n");
            }
        }
        sc.close();
    }
}
