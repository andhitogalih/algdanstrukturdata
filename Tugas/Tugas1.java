import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = 'y'; 
        int biayaTotal = 0;
        int totalBayar;
        do{
            boolean succes = true;
            do{
                System.out.println("============================================");
                System.out.print("Berat cucian yang akan di laundry (Dalam Kg): ");
                int berat = sc.nextInt();
                int biaya = berat * 4500;
                if(berat > 10){
                    int diskon = 5 *biaya /100; 
                    totalBayar = biaya - diskon;
                    System.out.println("Harga : "+ biaya);
                    System.out.println("Mendapat diskon 5%");
                }else{
                    totalBayar = biaya;
            }biayaTotal += totalBayar;
            System.out.println("Total harganya : Rp" + totalBayar);
            }while(!succes);
            System.out.println("\napakah ingin melanjutkan? (Y/T) ");
            a = sc.next().charAt(0);
        }while(a=='Y'||a=='y');
        System.out.println("Keuntungan laundry hari ini: Rp" + biayaTotal);
        System.out.print("=====================================================");
    }
}

