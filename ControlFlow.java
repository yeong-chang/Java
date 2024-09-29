package JavaPractice02_Method;

public class ControlFlow {
    public static void main(String[] args) {
        drawRectangle();
    }

    // 사각형을 그리는 메소드
    public static void drawRectangle() {
        drawLine();
        drawEdge();
        drawLine();
    }

    // 직선을 그리는 메소드
    public static void drawLine() {
        System.out.println("* * * * * *");
    }
    // 양 끝점을 그리는 메소드
    public static void drawEdge() {
        System.out.println("*         *");
    }
}
