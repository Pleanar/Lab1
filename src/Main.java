import java.util.ArrayList;

public class Main {
    public static float randomNumber() {
        return (float)(Math.random() * 20) - 10;
    }
    public static double firstEquation(double gain) {
        double fE1 = 3/gain;
        double fE2 = Math.pow(fE1,gain);
        fE2++;
        double fE3 = Math.pow(fE2,3);
        return Math.cbrt(fE3);
    }
    public static double secondEquation(double gain) {
        double sE1 = Math.pow(Math.E, gain);
        double sE2 = Math.log(sE1);
        return Math.sin(sE2);
    }
    public static double thirdEquation(double gain) {
        double tE1 = Math.cos(gain);
        double tE2 = Math.pow(tE1,2);
        double tE3 = Math.log(tE2);
        double tE4 = Math.pow(tE3,3)/1/2;
        double tSE1 = Math.PI/2/(3+Math.abs(gain));
        double tSE2 = -Math.pow(tSE1,2);
        double tSE3 = Math.cbrt(tSE2);
        double tSE4 = Math.pow(Math.E,tSE3);
        double tSE5 = Math.atan(tSE4);
        return Math.pow(tE4,tSE5);
    }
    public static void main(String[] args) {

        final int arrayListCap = 0;
        ArrayList<Long> c = new ArrayList(arrayListCap);

        for (long i = 6; i < 17; i++){
            if (i % 2 == 0) {
                c.add(i);
            }
        }

        ArrayList<Float> x = new ArrayList(arrayListCap);

        for (int i = 0; i < 15; i++){
            x.add(randomNumber());
        }

        double[][] a = new double [6][15];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 15; j++) {
                int ci = (int) (long) c.get(i);
                double n = x.get(j);
                switch (ci) {
                    case 12 -> a[i][j] = firstEquation(n);
                    case 6, 8, 14 -> a[i][j] = secondEquation(n);
                    default -> a[i][j] = thirdEquation(n);
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(" " + String.format("%.5f",a[i][j]) + " ");
            }
            System.out.println();
        }
    }

}