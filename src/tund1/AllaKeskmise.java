package tund1;

/* Programm otsib etteantud listist välja keskmise ning leiab numbrihulga, mis on alla keskmise */

public class AllaKeskmise {
    public static void main(String[] args) {
        System.out.println("Alla keskmise on " +allaKeskmise (new double[]{1,5,7,9,3})+" arvu.");

    }

    public static int allaKeskmise(double[] d) {
        double keskmine = 0;
        int elementideHulk = 0;
        // get average
        for(int i = 0; i < d.length; i++){
            keskmine += d[i];
        }
        keskmine = keskmine / d.length;
        // get count
        for(int i = 0; i < d.length; i++) {
            if (d[i] < keskmine) {
                elementideHulk++;
            }
        }
        System.out.println("Massiivi keskmine on "+keskmine);
        return elementideHulk;
    }
}
