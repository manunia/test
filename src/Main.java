public class Main {

    public static void main(String[] args) {
        //матрица a x b
        final int a = 7;
        final int b = 4;
        int[] mass = new int[a*b];
        //заполним массив
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        //временные переменные
        int t1 = 2*a + 2*b - 4;
        int t2 = 3*a + 2*b - 7;
        for (int i = 0; i < mass.length; i++) {
            if (i <= a - 1){
                System.out.print(mass[i] + "  ");
            }
        }
        System.out.println();
        System.out.print(mass[t1 - 1]);

        for (int i = 0; i < mass.length; i++) {
            if (i >= t1 && i <= t2) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.print(" " + mass[a]);
        System.out.println();
        System.out.print(mass[b*b] + " ");
        t1 = t2 + 1;
        t2+= t1 + a - 3;
        for (int i = mass.length - 1; i > 0; i--) {
            if (i >= t1 && i <= t2) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.print(mass[a+b-3]);
        System.out.println();
        t1 = a + b - 2;
        t2 = t1 + a - 1;
        for (int i = mass.length - 1; i > 0; i--) {
            if (i >= t1 && i <= t2) {
                System.out.print(mass[i] + " ");
            }
        }
        
    }
}
