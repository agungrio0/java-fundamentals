package topic02_loops;

public class PerulanganPola {
    public static void main(String[] args) {
        // Soal 1 
        System.out.println("Soal 1");

        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        // Soal 2
        System.out.println("");
        System.out.println("Soal 2");

        for (int i = 0; i < 10; i++) {
            System.out.print("A ");
        }
        System.out.println("");

        // Soal 3
        System.out.println("");
        System.out.println("Soal 3");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println("");
        
        // Soal 4
        System.out.println("Soal 4");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println("");

        // Soal 5
        System.out.println("Soal 5");

        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println("");

        // Soal 6
        System.out.println("Soal 6");

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println("");

        // Soal 7
        System.out.println("Soal 7");

        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print("# ");
            }
            System.out.println("# ");
        }
        System.out.println("");

        // Soal 8
        System.out.println("Soal 8");

        boolean loop;
        for (int i = 5; i > 0; i--) {
            loop = false;
            for (int j = i; j <= 5; j++) {   
                    if (!loop) {
                        for (int k = i; k > 1; k--) {
                            System.out.print("  ");
                        } 
                        loop = true;
                    }     
                System.out.print("* ");
            } 
            System.out.println(" ");
        }
        System.out.println("");

        // Soal 9
        System.out.println("Soal 9");

        boolean loop2;
        for (int i = 0; i < 5; i++) {
            loop2 = false;
            for (int j = i; j < 6; j++) {
                if (i >= 1) {
                    if (!loop2) {
                        for (int k = i; k >= 1; k--) {
                            System.out.print("  ");
                        }
                        loop2 = true;
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (j > 4) {
                        System.out.print("");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");

        // Soal 10
        System.out.println("Soal 10");

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        // Soal 11
        System.out.println("Soal 11");

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
            if (i == 0) {
                for (int j = i; j < 4; j++) {          
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j < (i * 4 / i); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        // Soal 12
        System.out.println("");
        System.out.println("Soal 12");

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                for (int j = i; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("");

        // Soal 13
        System.out.println("");
        System.out.println("Soal 13");

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 4; i > 0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j < (i * 2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Challenge 
        System.out.println("");
        System.out.println("=================");
        System.out.println("Challenge");
        System.out.println("=================");

        System.out.println("No 1");

        for (int i = 1; i < 6; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print(i);
            }
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("No 2");

        for (char i = 'A'; i < 'F'; i++) {
            for (char j = i; j > 'A'; j--) {
                System.out.print(i);
            }
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("No 3");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("No 4");

        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(j);
            }
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("=================");
        System.out.println("FINAL BOSS");
        System.out.println("=================");

        System.out.println("No 1");

        for (char i = 'A'; i < 'F'; i++) {
            for (char j = 'A'; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("No 2");

        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("No 3");

        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = i; j <= 'E'; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("No 4");

        System.out.println('A');
        for (char i = 'B'; i <= 'E'; i++) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j);
            }
            for (char jk = i; jk <= i; jk++) {
                for (char j2 = 'B'; j2 <= i; j2++) {
                    System.out.print(j2);
                }
                System.out.println("");
            }
        }
    }
}
