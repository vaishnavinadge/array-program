public class diamond {
    public static void printStar(int n) {
          // Upper half
        for (int i = 1; i <= n; i++) {
            int star = (i * 2) - 1;
            int space = (((n*2)-1) - star) / 2;

            for (int j = 1; j <= (n*2)-1; j++) {
                if (space > 0 && j <= space) {
                    System.out.print(" ");
                } else if (star > 0) {
                    System.out.print("*");
                    star--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            int star = (i * 2) - 1;
            int space = (((n*2)-1)- star) / 2;

            for (int j = 1; j <= (n*2)-1; j++) {
                if (space > 0 && j <= space) {
                    System.out.print(" ");
                } else if (star > 0) {
                    System.out.print("*");
                    star--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change as needed
        printStar(n);
    }
}