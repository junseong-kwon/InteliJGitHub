package operator;

public class Operator {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        //뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);


        int div = a / b;
        System.out.println("a / b = " + div);

        //나머지
        int mod = a % b;// 5/2 2, 1
        System.out.println("a % b = "+ mod);


    }
}
