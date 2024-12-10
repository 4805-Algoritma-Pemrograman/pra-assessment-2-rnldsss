 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        int gajiPokok = hitungGaji();
        int uangLembur = hitungUangLembur(jamLembur);
        int totalGaji = gajiPokok + uangLembur;

        // Function untuk menghitung gaji pokok berdasarkan masa kerja
        public static int hitungGaji() {
            if (masaKerja < 5) {
                return 5000000;
            } else if (masaKerja >= 5 && masaKerja <= 10) {
                return 7500000;
            } else {
                return 10000000;
            }
        }

        // Function untuk menghitung uang lembur berdasarkan masa kerja dan jam lembur
        public static int hitungUangLembur(int jamLembur) {
            int honorPerJam;
            if (masaKerja < 5) {
                honorPerJam = 40000;
            } else if (masaKerja >= 5 && masaKerja <= 10) {
                honorPerJam = 50000;
            } else {
                honorPerJam = 75000;
            }
            return jamLembur * honorPerJam;
        }

        System.out.println("Total Gaji: " + totalGaji);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
