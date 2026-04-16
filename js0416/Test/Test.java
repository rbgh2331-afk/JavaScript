package js0416.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 데이터 입력받게 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 더블형으로 10가지의 점수 입력 받기
        double[] scores = new double[10];

        // 총합 값 초기화
        double sum = 0;

        // 점수 10가지를 입력받고 10가지 점수를 더하기
        for(int i=0; i<scores.length; i++) {
            System.out.print("점수 입력 : ");
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }

        // 더한수를 입력받은 수만큼 나누기 및 선언
        double avg = (double) sum / scores.length;

        // 입력받은 수들중 첫번째 값을 max로 선언
        double max = scores[0];
        // 입력 받은 횟수만큼 반복하고 반복할때마다 제일 큰 수를 max에 저장
        for(int i=0; i<scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // max와 같은 원리로 최소값 저장
        double min = scores[0];
        for(int i=0; i<scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // 스캔 닫기
        sc.close();

        // 출력
        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + avg);
        System.out.println("최대 값 : " + max);
        System.out.println("최소 값 : " + min);
    }  
}