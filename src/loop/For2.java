package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endnum = 3;

        for (int i = 1; i <= endnum; i++){
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
