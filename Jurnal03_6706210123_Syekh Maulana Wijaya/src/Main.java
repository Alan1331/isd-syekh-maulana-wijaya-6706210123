import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList<Pegawai> pegawai = new SinglyLinkedList<>("Daftar Pegawai");
        boolean keluar = false;
        while (!keluar) {
            System.out.println("Pilih menu berikut:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cetak daftar pegawai");
            System.out.println("4. Keluar");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Masukkan data pegawai berikut: ");
                    System.out.print("NIP: ");
                    String nip = input.next();
                    System.out.print("Nama: ");
                    String nama = input.next();
                    System.out.print("Divisi: ");
                    String divisi = input.next();
                    System.out.println("Tambahkan data pada: ");
                    System.out.println("1. Awal list");
                    System.out.println("2. Akhir list");
                    int insertFrontOrBack = input.nextInt();
                    if(insertFrontOrBack == 1) {
                        pegawai.insertAtFront(new Pegawai(nip, nama, divisi));
                    } else if(insertFrontOrBack == 2) {
                        pegawai.insertAtBack(new Pegawai(nip, nama, divisi));
                    } else {
                        System.out.println("Menu tidak tersedia, coba lagi!!");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hapus data dari: ");
                    System.out.println("1. Awal list");
                    System.out.println("2. Akhir list");
                    int RemoveFrontOrBack = input.nextInt();
                    if(RemoveFrontOrBack == 1) {
                        pegawai.removeFromFront();
                    } else if(RemoveFrontOrBack == 2) {
                        pegawai.removeFromBack();
                    } else {
                        System.out.println("Menu tidak tersedia, coba lagi!!");
                        System.out.println();
                    }
                    break;
                case 3:
                    pegawai.print();
                    System.out.println();
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("Menu tidak tersedia, coba lagi!!");
                    System.out.println();
            }
        }
    }
}
