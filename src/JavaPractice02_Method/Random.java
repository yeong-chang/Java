package JavaPractice02_Method;

public class Random {
    public static void main(String[] args) {
        // 메소드로부터 값을 반환
        int x = rollDie();
        // 결과 출력
        System.out.printf("주사위의 눈: %d", x);
    }
    // 1~6 사이의 임의의 정수를 반환하는 메서드
    public static int rollDie() {
        //Math.random() -> 0부터 0.999... 까지 값중 랜덤으로 생성
        //(int) (Math.random() * 6) + 1 -> 정수 1부터 6중 랜덤으로 생성
        int x = (int) (Math.random() * 6) + 1;
        return x;
    }
}
