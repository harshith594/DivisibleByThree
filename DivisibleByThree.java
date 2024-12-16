public class DivisibleByThree {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        System.out.println("Numbers divisible by 3 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
