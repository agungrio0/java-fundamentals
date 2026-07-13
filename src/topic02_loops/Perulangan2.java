package topic02_loops;

public class Perulangan2 {
    public static void main(String[] args) {
        // Soal 1
        System.out.println("Soal 1");
        int n = 25;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print("A ");
            } else if (i % 2 == 0) {
                System.out.print("B ");   
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // Soal 2
        System.out.println("");
        System.out.println("Soal 2");
        int x = 30;

        for (int i = 1; i <= x; i++) {
            if (i % 6 == 0) {
                if (i % 4 == 0) {
                    System.out.print("$ ");
                } else {
                    System.out.print("@ ");
                } 
            } else if (i % 4 == 0) {
                System.out.print("# ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // Soal 3
        System.out.println("");
        System.out.println("Soal 3");
        int a = 20;

        for (int i = 1; i <= a; i++) {
            if (i == 7 || i == 14) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("* ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println("");

        // Soal 4
        System.out.println("");
        System.out.println("Soal 4");
        int b = 49;

        int k = 2;
        System.out.print("1 ");
        for (int i = 2; i <= b; i++) {
            for (int j = i; j <= i;) {
                if (i % 5 == 0) {
                    if (i % 3 == 0) {
                        System.out.print("% ");
                    } else {
                        System.out.print("@ ");
                    }
                    j++;
                } else if (i % 3 == 0) {
                    System.out.print("# ");
                    j++;
                } else if (i % k == 0) {
                    if (i == k) {
                        System.out.print("P ");
                    } else {
                        System.out.print(i + " ");
                    }
                    j++;
                    k = 2;
                } else {
                   k++;
                }
            }
        }
        System.out.println("");

        // Soal 5
        System.out.println("");
        System.out.println(" Soal 5");
        int c = 30;

        for (int i = 1; i <= c; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    if (i % 2 == 0) {
                        System.out.print("ABC ");
                    } else {
                        System.out.print("BC ");
                    }
                } else if (i % 2 == 0) {
                    System.out.print("AC ");
                } else {
                    System.out.print("C ");
                }
            } else if (i % 3 == 0) {
                if (i % 2 == 0) {
                    System.out.print("AB ");
                } else {
                    System.out.print("B ");
                }
            } else if (i % 2 == 0) {
                System.out.print("A ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // Soal Challenge 
        System.out.println("");
        System.out.println("Soal Challenge");
        int d = 35;

        for (int i = 1; i <= d; i++) {
            if (i % 5 == 0) {
                if (i % 4 == 0) {
                    System.out.print("$ ");
                } else {
                    System.out.print("@ ");
                }
            } else if (i % 4 == 0) {
                System.out.print("# ");
            } else if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
