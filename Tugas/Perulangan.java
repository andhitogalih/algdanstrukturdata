import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.println("==========================");

        nim = nim.substring(nim.length()-2);
        int n = Integer.parseInt(nim);

        if(n<10){
            n += 10;
        }
        System.out.println("n = " + n);
        n /= 7;
        int sisa = n % 7;
        for(int i=0; i<n; i++){
            for(int j=0; j< 7; j++){
                System.out.print(hari[j]+" ");
            }
        }
        if (sisa!=0){
            for(int i=0; i < sisa; i++){
                System.out.print(hari[i]+" ");
            }
        }

    }
}

