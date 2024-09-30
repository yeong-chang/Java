package JavaPractice02_Method;

public class CubeVolume {
    public static void main(String[] args) {
        // 변수 생성
        int n = 3;
        // 메소드 호출을 통한 값 계산 파라미터에 n입력
        int x = cube(n);
        // 결과 출력
        System.out.printf("한변의 길이가 %d인 큐브의 부피 => %d", n, x);
    }
        // cube의 부피를 구하는 메소드 생성
    public static int cube(int n) {
        // 변수 생성
        int result;
        // cube의 부피를 계산
        result = n*n*n;
        // 값 반환
        return result;
    }
}
