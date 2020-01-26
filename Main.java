/* ======================================================================================
   Nama File        : Final_Project
   Tugas            : Tugas 08 - Final Project
   Versi            : 1.0
   Tanggal          : 30 November 2019
   Author           : I Komang Pranadita Kusuma Jaya    (195150401111027)   (SI-D)
=======================================================================================*/

package com.tugas;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in); //inisiasi scanner

        int jml[] = new int[1];
        String identitas[] = new String[4];
        String matkul[] = new String[20];
        double nilai[] = new double[20];
        int sks[] = new int[20];

        //memulai program

        boolean flag1 = false;
        boolean flag2 = false;


        int pilihan; //input pilihan menu

        do {
            System.out.println("Haloo Selamat Datang ! ");
            System.out.println("Kali ini kamu akan menggunakan program KHS\n");
            System.out.println("Silakan pilih menu berikut ya ! :)\n");
            System.out.println("MENU :");
            System.out.println("  1. Input Data Mahasiswa");
            System.out.println("  2. Input Hasil Studi");
            System.out.println("  3. Edit Data Mahasiswa");
            System.out.println("  4. Edit Data Hasil Studi");
            System.out.println("  5. Cetak KHS");
            System.out.println("  6. About");
            System.out.println("  9. Keluar");
            System.out.println();
            System.out.println("Masukkan angka menu : ");
            pilihan  = scann.nextInt();
            switch (pilihan){
                case 1 :
                    //pilihan menu input identitas
                    inputData(identitas); //memanggil method input identitas
                    flag1 = true;
                    break;
                case 2 :
                    //pilihan menu input hasil studi
                    inputHasil(matkul, sks, nilai, jml); //memanggil method input hasil studi
                    flag2 = true;
                    break;
                case 3 :
                    //pilihan menu edit identitas
                    if (flag1){
                        editMhs(identitas); //memanggil method edit identitas mahasiswa
                    } else {
                        System.out.println("Silahkan masukkan data identitas terlebih dahulu");
                    }
                    break;
                case 4 :
                    //pilihan menu edit hasil studi
                    if (flag2){
                        editStudi(matkul,sks,nilai); //memanggil method edit hasil studi
                    } else {
                        System.out.println("Silahkan input hasil studi terlebih dahulu");
                    }

                    break;

                case 5 :
                    //pilihan menu cetak KHS
                   if (flag1 && flag2){
                       cetakKHS(identitas, matkul, sks, nilai, jml);

                    } else {
                       System.out.println("Anda belum menginput identitas dan hasil studi");

                   }


                    break;

                case 6 :
                    about("profil sang programmer"); //memanggil method about
                    break;
                case 9 :
                    keluar("keluar menu"); //memanggil method keluar
                    break;
                default:
                    System.out.println("Input salah. Silahkan coba memasukkan angka menu lagi");
                    break;
            }


        } while (pilihan != 9);

    }


    // 1. method untuk input data mahasiswa
    public static void inputData(String inputt[]){

        System.out.println("Ini adalah menu input identitas \n");
        Scanner aaa = new Scanner(System.in);
        //input nama lengkap
        System.out.printf("%-15s : ", "Nama Lengkap ");
        inputt[0] = aaa.nextLine();
        //input nim
        System.out.printf("%-15s : ", "NIM ");
        inputt[1] = aaa.nextLine();
        //input semester
        System.out.printf("%-15s : ", "Semester ");
        inputt[2] = aaa.nextLine();
        //input prodi
        System.out.printf("%-15s : ", "Program Studi ");
        inputt[3] = aaa.nextLine();

    }

    // 2. method untuk input hasil studi
    public static void inputHasil(String matkul[] ,int sks[], double nilai[],int jml[]){

        Scanner bbb = new Scanner(System.in); //inisiasi scanner di method inputHasil

        //menanyakan jumlah mata kuliah
        System.out.println("Ini adalah menu input hasil studi");
        System.out.println("Silahkan masukkan jumlah mata kuliah");
        jml[0] = bbb.nextInt();

        //looping untuk memasukkan mata kuliah SKS, dan nilai nya
        for (int i = 0; i < jml[0]; i++){
            bbb.nextLine();
            System.out.println("Masukkan mata kuliah ke-" + (i+1) + " :");
            matkul[i] = bbb.nextLine();
            System.out.println("Masukkan SKSnya");
            sks[i] = bbb.nextInt();
            System.out.println("Masukkan nilainya");
            nilai[i] = bbb.nextDouble();
        }
    }

    // 3. method untuk edit data mahasiswa
    public static void editMhs(String dataMhs[]) {
        Scanner ccc = new Scanner(System.in);
        System.out.println("Ini adalah menu edit data mahasiswa");
        System.out.println("Berikut adalah menu dari data yang ingin diubah");
        System.out.println("1. Nama");
        System.out.println("2. NIM");
        System.out.println("3. Semester");
        System.out.println("4. Program Studi");
        System.out.println("Tekan 5 Untuk Keluar");
        System.out.println();
        System.out.print("Silahkan pilih nomor dari data yang ingin diubah : ");
        int pilihh = ccc.nextInt();
        switch (pilihh){
            case 1 :
                System.out.println("Silahkan mengubah nama");
                ccc.nextLine();
                System.out.println("Nama :");
                dataMhs[0] = ccc.nextLine();
                System.out.println("Nama telah berhasil diubah menjadi " + dataMhs[0]);
                break;
            case 2 :
                System.out.println("Silahkan mengubah NIM");
                ccc.nextLine();
                System.out.println("NIM :");
                dataMhs[1] = ccc.nextLine();
                System.out.println("NIM telah berhasil diubah menjadi " + dataMhs[1]);
                break;
            case 3 :
                System.out.println("Silahkan mengubah semester");
                ccc.nextLine();
                System.out.println("Semester :");
                dataMhs[2] = ccc.nextLine();
                System.out.println("Semester telah berhasil diubah menjadi " + dataMhs[2]);
                break;
            case 5 :
                break;
        }

    }

    // 4. method untuk edit data hasil studi
    public static void editStudi(String matkul[], int sks[],double nilai[]){
        Scanner ddd = new Scanner(System.in);
        System.out.println("Ini adalah menu untuk edit hasil studi");
        System.out.println("Berikut adalah menu dari data yang ingin diubah");
        System.out.println("1. Ubah Mata Kuliah");
        System.out.println("2. Ubah SKS");
        System.out.println("3. Ubah Nilai");
        System.out.println("Tekan 4 untuk keluar");
        System.out.println();
        System.out.println("Silahkan pilih nomor menu dari data yang ingin diubah");
        int pilihh = ddd.nextInt();
        switch (pilihh) {
            case 1:
                System.out.println("Silahkan mengubah mata kuliah");
                System.out.println("Pilih nomor sesuai urutan mata kuliah yang ingin diubah");
                int nomerMatkul = ddd.nextInt();
                ddd.nextLine();
                System.out.println("Masukkan mata kuliah yang baru");
                matkul[nomerMatkul+1] = ddd.nextLine();
                System.out.println("Data mata kuliah telah diubah menjadi " + matkul[nomerMatkul+1]);
                break;
            case 2:
                System.out.println("Silahkan mengubah SKS mata kuliah");
                System.out.println("Pilih nomor sesuai urutan mata kuliah yang ingin diubah");
                int nomer = ddd.nextInt();
                System.out.println("Masukkan SKS dari mata kuliah yang baru");
                sks[nomer+1] = ddd.nextInt();
                System.out.println("Data SKS telah diubah menjadi " + sks[nomer+1]);
                break;
            case 3:
                System.out.println("Silahkan mengubah nilai ");
                System.out.println("Pilih nomor sesuai urutan mata kuliah yang ingin diubah");
                int no = ddd.nextInt();
                System.out.println("Masukkan nilai dari mata kuliah yang baru yang baru");
                nilai[no+1] = ddd.nextDouble();
                System.out.println("Data nilai telah diubah menjadi " + nilai[no+1]);
                break;
            case 4:
                break;
        }

    }

    // 5. method untuk cetak KHS
    public static void cetakKHS(String identitas[], String matkul[], int sks[], double nilai[],int jml[]){


        //looping untuk menghitung total sks
        int skstot = 0;
        for (int i = 0; i <= jml[0]; i++){
            skstot += sks[i];
        }
        //loop menghitung akumulasi nilai
        double NA = 0;
        for (int i = 0; i<jml[0];i++ ){
            NA += nilai[i];
        }

        //loop menghitung nilai akhir per matkul
        double NilAkhirt[] = new double[jml[0]];
        for(int i = 0; i < jml[0]; i++){
            NilAkhirt[i] = nilai[i]*sks[i];
        }

        //loop menghitung total nilai akhir
        double totalNilai = 0;
        for(int i = 0; i < jml[0]; i++){
            totalNilai+= NilAkhirt[i];
        }

        //menghitung ipk
        double ipk = totalNilai/skstot;

        System.out.println("Ini adalah menu cetak KHS\n");
        System.out.println("====================================================================================");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Kartu Hasil Studi~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("====================================================================================");
        System.out.printf("%-15s : %s\n", "Nama Lengkap ", identitas[0]);
        System.out.printf("%-15s : %s\n", "NIM ", identitas[1]);
        System.out.printf("%-15s : %s\n", "Semester ", identitas[2]);
        System.out.printf("%-15s : %s\n", "Program Studi ", identitas[3]);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("| %s | %25s\t\t | %s | %s\t | %s\t |\n"  , "NO", "MATA KULIAH", "SKS", "NILAI", "N x SKS" );
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < jml[0]; i++){
            System.out.printf("| %d  | %-25s\t\t |  %d  |  %-5.2f\t | %-5.2f\t |\n", (i+1), matkul[i],sks[i], nilai[i], NilAkhirt[i]);
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%s\t\t\t\t\t\t\t\t\t |  %d |  %-5.2f\t | %-5.2f\t |\n", "TOTAL", skstot, NA, totalNilai);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("====================================================================================");
        System.out.println("\n");

        //keterangan IPK
        if (ipk >= 3.00  ) {
            System.out.printf("IPK Anda : %4.2f\n ", ipk, "Dengan SKS yang telah diambil sebanyak", skstot);
            System.out.println("Anda bisa mengambil SKS sebanyak 22-24 SKS di semester depan ");
            System.out.println("Selamat yaa! Pertahankan prestasi Anda :)");
        } else if (ipk < 3.00 && ipk >= 2.50) {
            System.out.printf("IPK Anda : %4.2f\n ", ipk, "Dengan SKS yang telah diambil sebanyak", skstot);
            System.out.println("Anda bisa mengambil SKS sebanyak 19-21 SKS di semester depan ");
            System.out.println("Pencapaian yang bagus! Tingkatkan lagi prestasi Anda :)");
        } else if (ipk < 2.50 && ipk >= 2.00){
            System.out.printf("IPK Anda : %4.2f\n ", ipk, "Dengan SKS yang telah diambil sebanyak", skstot);
            System.out.println("Anda bisa mengambil SKS sebanyak 16-18 SKS di semester depan ");
            System.out.println("Semangat!! Tingkatkan waktu belajarnya yaa :)");
        } else if (ipk < 2.00 && ipk >= 1.50) {
            System.out.printf("IPK Anda : %4.2f\n ", ipk, "Dengan SKS yang telah diambil sebanyak", skstot);
            System.out.println("Anda bisa mengambil SKS sebanyak 12-15 SKS di semester depan ");
            System.out.println("Ayoo jangan menyerah !! Berusaha lebih baik lagi yaa :)");
        } else {
            System.out.printf("IPK Anda : %4.2f\n ", ipk, "Dengan SKS yang telah diambil sebanyak", skstot);
            System.out.println("Anda hanya bisa mengambil SKS kurang dari 12 SKS di semester depan ");
            System.out.println("Jangan patah semangat !! Ingat berusaha yang lebih keras untuk semester depan yaa :) ");
        }

    }

    // 6. method untuk about
    public static void about(String apaaja){
        System.out.println("Program ini dibuat oleh I Komang Pranadita Kusuma Jaya");
        System.out.println("Ia adalah seorang pemuda yang baru saja berhasil mewujudkan salah satu mimpinya, yaitu menjadi mahasiswa di kampus terbaik di Indonesia");
        System.out.println("Saat ini ia sedang berjuang untuk mencapai target dan mimpinya yang lain, yaitu untuk menjadi lulusan IT yang bisa berkontribusi di Era Digital dan Revolusi Industri");
        System.out.println("Meski sulit, ia tetap ingin terus maju dan berharap agar bisa mencapai semua impiannya");
        System.out.println("Ia menjadi semakin semangat karena mendapat inspirasi dari salah satu orang hebat yang ditemuinya, yaitu Pak Herman Tolle");
}

    // 7. method untuk keluar
    public static void keluar(String out){
        System.out.println("Terima kasih sudah menggunakan program ini! :)");
        System.out.println("Senang bisa membantu Anda ! ");
    }



}
