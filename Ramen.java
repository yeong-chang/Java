package JavaPractice02_Method;

public class Ramen {
    public static void main(String[] args) {
        buy();
        boil();
        put();
        eat();
    }
    // return값이 필요없는 void 메서드 생성
    public static void boil() {
        System.out.println("물을 끓인다.");
    }
    public static void buy() {
        System.out.println("라면을 사온다.");
    }
    public static void eat() {
        System.out.println("맛있게 먹는다.");
    }
    public static void put() {
        System.out.println("라면을 넣는다.");
    }
}
