public class Test {

    public void abc(int a){
        a++;
    }

    public static void main(String[] args) {
        Test test= new Test();
        int a=1;
        int b=0;
        for (int i = 0; i < 10; i++) {
            a++;
            test.abc(a);
        }
        System.out.println("AA");
    }
}
