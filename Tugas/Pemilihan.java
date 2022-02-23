import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        double nilaiAkhir;
        String nilaiHuruf;
        String status;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Mahasiswa");
        System.out.println("==================================");
        System.out.println("Masukkan nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.println("Masukkan nilai Uts: ");
        int uts = sc.nextInt();
        System.out.println("Masukkan nilai Uas: ");
        int uas = sc.nextInt();
        nilaiAkhir = ((0.2*tugas)+(0.35*uas)+(0.45*uts));
        System.out.println("===========================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir >80 && nilaiAkhir <=100){
            nilaiHuruf ="A";
            status = "Selamat anda LULUS";
            System.out.println("Nilai Huruf : "+nilaiHuruf);
            System.out.println("" +status);
        }else if(nilaiAkhir >73 && nilaiAkhir <=80){
            nilaiHuruf ="B+";
            status = "Selamat anda LULUS";
            System.out.println("Nilai Huruf: "+nilaiHuruf);
            System.out.println("" +status);
        }else if(nilaiAkhir >65 && nilaiAkhir <=73){
            nilaiHuruf ="B";
            status = "Selamat anda LULUS";
            System.out.println("Nilai Huruf : "+nilaiHuruf);
            System.out.println("" +status);
        }else if(nilaiAkhir >60 && nilaiAkhir <=65){
            nilaiHuruf ="C+";
            status = "Selamat anda LULUS";
            System.out.println("Nilai Huruf : "+nilaiHuruf);
            System.out.println("" +status);
        }else if(nilaiAkhir >50 && nilaiAkhir <=60){
            nilaiHuruf ="C";
            status = "Selamat anda LULUS";
            System.out.println("Nilai Huruf : "+nilaiHuruf);
            System.out.println("" +status);
        }else if(nilaiAkhir >39 && nilaiAkhir <=50){
            nilaiHuruf ="D";
            status = "Selamat anda TIDAK LULUS";
            System.out.println("Nilai Huruf: "+nilaiHuruf);
            System.out.println("" +status);
        }else if(nilaiAkhir <=39 ){
            nilaiHuruf ="E";
            status = "Selamat anda Tidak LULUS";
            System.out.println("Nilai Huruf : "+nilaiHuruf);
            System.out.println("" +status);
    }   }
}
