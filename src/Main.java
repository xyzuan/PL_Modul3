import java.util.Scanner;

public class Main{

    static Perhitungan ph = new Perhitungan();
    static Main main = new Main();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan Panjang : ");
        ph.setPanjang(input.nextInt());

        System.out.print("Masukkan Lebar : ");
        ph.setLebar(input.nextInt());

        System.out.print("Masukkan Tinggi : ");
        ph.setTinggi(input.nextInt());
        System.out.println(ph.isCube(10));
        main.hasil();
    }

     protected void hasil(){
        System.out.println("Hasil luas balok : " + ph.getLuas(ph.getPanjang(), ph.getLebar(), ph.getTinggi()));
        System.out.println("Hasil volume balok : " + ph.getVolume(ph.getPanjang(), ph.getLebar(), ph.getTinggi()));
    }

}