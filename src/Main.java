public class Main {

    public static void main(String[] args) {

        System.out.println("3 + 3 = 6 : " + EqualSumChecker.hasEqualSum(3, 3, 6));
        System.out.println("2 + 1 = 4 : " + EqualSumChecker.hasEqualSum(2, 1, 4));
        System.out.println("4 + 4 = 8 : " + EqualSumChecker.hasEqualSum(4, 4, 8));
        System.out.println("12 + 15 = 15 : " + EqualSumChecker.hasEqualSum(12, 15, 15));
        System.out.println("1 + 1 = 1 : " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("1 + 1 = 2 : " + EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println("1 + (-1) = 0 : " + EqualSumChecker.hasEqualSum(1, -1, 0));

    }
}
