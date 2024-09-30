package JavaPractice02_Method;

public class CylinderVolume {
    public static void main(String[] args) {
            // 변수 생성
            double r = 7.0;
            double h = 5.0;
            // Math 클래스의  pi값
            double pi = Math.PI;
            // 메소드에 변수 입력후 부피 구하기
            double v = volume(r, h, pi);
            // 결과 출력
            System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", r, h, v);
        }
        // 반지름과 높이를 입력받아 원기둥의 부피를 반환하는 메소드 생성
        public static double volume(double r, double h , double pi) {
            return r*r*h*pi;
        }
}
