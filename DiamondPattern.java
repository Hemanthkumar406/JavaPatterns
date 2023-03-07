package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        int m= (n*2)-1;
        int st = 1;
        int sp = m / 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < st; k++) {
                System.out.print("*");
              
            }

            System.out.println();

            if (i < m / 2) {
                st = st + 2;
                sp = sp - 1;
            } else {
                st = st - 2;
                sp = sp + 1;
            }
        }
    }
}

