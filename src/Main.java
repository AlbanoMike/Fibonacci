public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int aux;

        for (int i= 1; i <10; i++){
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;

        }

    }
}