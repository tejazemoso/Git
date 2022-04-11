public class question2{

    question2() {
        System.out.println("constructor 1 is running.");
    }
    question2(String str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        question2 obj = new question2("Hi i am 2nd constructor");
    }
}
