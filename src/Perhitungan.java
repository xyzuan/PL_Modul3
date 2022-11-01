public class Perhitungan extends Sisi {
    int getVolume(int p, int l, int t) {
        return 4 * p * l * t;
    }
    int getLuas(int p, int l, int t) {
        return p * l * t;
    }

//    boolean isCube(int s){
//        return (Math.round(Math.cbrt(s)) * Math.round(Math.cbrt(s) * Math.round(Math.cbrt(s)))) == s;
//    }

    boolean isCube(long input){
        double cubeRoot = Math.cbrt(input);
        long intRoot = Math.round(cubeRoot);
        return (intRoot * intRoot * intRoot) == input;
    }
}
