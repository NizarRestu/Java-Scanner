import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class TugasJavaBasic {
    public static void main(String[] args) {
        Scanner tugas = new Scanner(System.in);
        // Variabel
        // Login
        String login;
        int password;
        int pin;
        // Swicth Case
        int menuAwal = 0;
        int menu = 0;
        int menu1 = 0;
        // menu Pertama
        int p;
        int l;
        int s;
        int t;
        int π = 22 / 7;
        float r;
        // Menu Kedua
        float satuan;
        float hasil;
        int c;
        int derajat;
        // Menu Ketiga
        String unik;
        String text;
        String reverse;
        // End Variabel

        // Login
        System.out.println("Silahkan Login Terlebih Dahulu");
        System.out.println("Masukan Nama Anda: ");
        login = tugas.next();
        System.out.println("Masukan Password Anda :");
        password = tugas.nextInt();
        System.out.println("Masukan Pin Anda:");
        pin = tugas.nextInt();
        // End Login
        // Validasi Login
        if (login.equals("Administrator") && password >= 00000 && pin == 123456789) {
            // Pembungkus Menu Awal
            System.out.println("Akses Diterima, Selamat Datang "); 
            do {
                // Menu Awal
                System.out.print("Silahkan Pilih Menu: \n" + "1.Bangun Ruang/Datar \n" + "2.Konversi \n"
                        + "3.Secret Menu \n" + "4.Exit \n");
                System.out.print("Silahkan Pilih: ");
                menuAwal = tugas.nextInt();
                switch (menuAwal) {
                    // Menu Pertama Bangun Datar dan Bangun Ruang
                    case 1:
                        do {
                            System.out.println("Pilihan Menu : \n" + "1.Luas \n" + "2.Volume \n" + "3.Close \n");
                            System.out.print("Silahkan Pilih: ");
                            menu = tugas.nextInt();

                            switch (menu) {
                                // Menu Tentang Bangun Datar
                                case 1:
                                    do {
                                        System.out.println("Pilih : \n" + "1.Persegi Panjang \n" + "2.Persegi \n"
                                                + "3.Segitiga \n" + "4.Lingkaran \n" + "5.Close");
                                        System.out.print("Silahkan Pilih: ");
                                        menu1 = tugas.nextInt();
                                        switch (menu1) {
                                            // Persegi Panjang
                                            case 1:
                                                System.out.println("Persegi Panjang");
                                                System.out.print("Masukan Panjang:");
                                                p = tugas.nextInt();
                                                System.out.print("Masukan Lebar: ");
                                                l = tugas.nextInt();
                                                System.out.print("Hasilnya: " + (p * l));
                                                System.out.print(" m2 \n");
                                                break;
                                            // End Persegi Panjang
                                            // Persegi
                                            case 2:
                                                System.out.println("Persegi ");
                                                System.out.print("Masukan Sisi: ");
                                                s = tugas.nextInt();
                                                System.out.print("Hasilnya: " + (s * s));
                                                System.out.print(" m2 \n");
                                                break;
                                            // End Persegi
                                            // Segitiga
                                            case 3:
                                                System.out.println("Segitiga");
                                                System.out.print("Masukan Alas Atau Sisi Bawah: ");
                                                s = tugas.nextInt();
                                                System.out.print("Masukan Tinggi: ");
                                                t = tugas.nextInt();
                                                System.out.print("Hasilnya: " + (s * t / 2));
                                                System.out.print(" m2 \n");
                                                break;
                                            // End Segitiga
                                            case 4:
                                                System.out.println("Lingkaran");
                                                System.out.print("Masukan Jari Jarinya: ");
                                                r = tugas.nextInt();
                                                hasil = 22 * r * r / 7;
                                                System.out.print("Hasilnya: " + hasil);
                                                System.out.print(" m2 \n");
                                                break;

                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (menu1 < 5);
                                    break;
                                // End Menu Tentang Bangun Datar
                                // Menu Tentang Bangun Ruang
                                case 2:
                                    do {
                                        System.out.println("Pilih : \n" + "1.Balok \n" + "2.Kubus \n"
                                                + "3.Bola \n" + "4.Close \n");
                                        System.out.print("Silahkan Pilih: ");
                                        menu1 = tugas.nextInt();
                                        switch (menu1) {
                                            // Balok
                                            case 1:
                                                System.out.println("Balok");
                                                System.out.print("Masukan Panjang:");
                                                p = tugas.nextInt();
                                                System.out.print("Masukan Lebar: ");
                                                l = tugas.nextInt();
                                                System.out.print("Masukan Tinggi: ");
                                                t = tugas.nextInt();
                                                System.out.print("Hasilnya: " + (p * l * t));
                                                System.out.print(" liter \n");
                                                break;
                                            // End Balok
                                            // Kubus
                                            case 2:
                                                System.out.println("Kubus ");
                                                System.out.print("Masukan Sisi: ");
                                                s = tugas.nextInt();
                                                System.out.print("Hasilnya: " + (s * s * s));
                                                System.out.print(" liter \n");
                                                break;
                                            // End Kubus
                                            // Bola
                                            case 3:
                                                System.out.println("Bola");
                                                System.out.print("Masukan Jari jari: ");
                                                r = tugas.nextInt();
                                                hasil = 4 / 3 * 22 * r * r * r / 7;
                                                System.out.print("Hasilnya: " + hasil);
                                                System.out.print(" liter \n");
                                                break;
                                            // End Bola
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (menu1 < 4);
                                    break;
                                // End Menu Tentang Bangun Ruang

                                default:
                                    System.out.println("Exit");
                                    break;
                            }
                        } while (menu < 3);
                        break;
                    // End Menu Pertama Bangun Datar dan Bangun Ruang
                    // Menu Kedua Konversi
                    case 2:
                        do {
                            System.out.println(
                                    "Pilihan Menu : \n" + "1.Derajat \n" + "2.Panjang \n" + "3.Berat\n" + "4.Close \n");
                            System.out.print("Silahkan Pilih: ");
                            menu = tugas.nextInt();
                            switch (menu) {
                                // Menu Derajat
                                case 1:
                                    do {
                                        System.out.println("Pilihan Menu : \n" + "1.Reamur \n"
                                                + "2.Fahrenheit  \n" + "3.Close \n");
                                        System.out.println("Satuan Awal Adalah Celcius");
                                        System.out.print("Silahkan Pilih: ");
                                        menu1 = tugas.nextInt();
                                        switch (menu1) {
                                            case 1:
                                                System.out.println("Conversi Celcius ke Reamur");
                                                System.out.print("Silahkan Masukan Nilainya: ");
                                                c = tugas.nextInt();
                                                derajat = 4 * c / 5;
                                                System.out.println("Hasilnya: " + derajat + " R°");
                                                break;
                                            case 2:
                                                System.out.println("Conversi Celcius ke Fahrenheit");
                                                System.out.print("Silahkan Masukan Nilainya: ");
                                                c = tugas.nextInt();
                                                derajat = 9 * c / 5 + 32;
                                                System.out.println("Hasilnya: " + derajat + " F°");
                                                break;

                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (menu1 < 3);
                                    break;
                                // End Menu Derajat
                                // Menu Panjang
                                case 2:
                                    do {
                                        System.out.println("Pilihan Menu : \n" + "1.KiloMeter \n" + "2.HektoMeter \n"
                                                + "3.DekaMeter   \n" + "4.Meter \n" + "5.DesiMeter \n"
                                                + "6.CentiMeter \n" + "7.MiliMeter \n" + "8.Close \n");
                                        System.out.println("Satuan Awal Adalah Meter");
                                        System.out.print("Silahkan Pilih: ");
                                        menu1 = tugas.nextInt();
                                        switch (menu1) {
                                            case 1:
                                                System.out.println("KiloMeter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan / 1000;
                                                System.out.println("Hasilnya: " + hasil + "Km");
                                                break;
                                            case 2:
                                                System.out.println("HektoMeter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan / 100;
                                                System.out.println("Hasilnya: " + hasil + "Hm");
                                                break;
                                            case 3:
                                                System.out.println("DekaMeter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan / 10;
                                                System.out.println("Hasilnya: " + hasil + "Dam");
                                                break;
                                            case 4:
                                                System.out.println("Meter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                System.out.println("Hasilnya: " + (satuan) + "M");
                                                break;
                                            case 5:
                                                System.out.println("DesiMeter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan * 10;
                                                System.out.println("Hasilnya: " + hasil + "Dm");
                                                break;
                                            case 6:
                                                System.out.println("CentiMeter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan * 100;
                                                System.out.println("Hasilnya: " + hasil + "Cm");
                                                break;
                                            case 7:
                                                System.out.println("MiliMeter");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan * 1000;
                                                System.out.println("Hasilnya: " + hasil + "Mm");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (menu1 < 8);
                                    break;
                                // End Menu Panjang
                                // Menu Berat
                                case 3:
                                    do {
                                        System.out.println("Pilihan Menu : \n" + "1.KiloGram \n" + "2.HektoGram \n"
                                                + "3.DekaGram   \n" + "4.Gram \n" + "5.DesiGram \n"
                                                + "6.CentiGram \n" + "7.MiliGram \n" + "8.Close \n");
                                        System.out.println("Satuan Awal Adalah Gram");
                                        System.out.print("Silahkan Pilih: ");
                                        menu1 = tugas.nextInt();
                                        switch (menu1) {
                                            case 1:
                                                System.out.println("KiloGram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan / 1000;
                                                System.out.println("Hasilnya: " + hasil + "Kg");
                                                break;
                                            case 2:
                                                System.out.println("HektoGram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan / 100;
                                                System.out.println("Hasilnya: " + hasil + "Hg");
                                                break;
                                            case 3:
                                                System.out.println("DekaGram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan / 10;
                                                System.out.println("Hasilnya: " + hasil + "Dag");
                                                break;
                                            case 4:
                                                System.out.println("Gram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                System.out.println("Hasilnya: " + (satuan) + "G");
                                                break;
                                            case 5:
                                                System.out.println("DesiGram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan * 10;
                                                System.out.println("Hasilnya: " + hasil + "Dg");
                                                break;
                                            case 6:
                                                System.out.println("CentiGram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan * 100;
                                                System.out.println("Hasilnya: " + hasil + "Cg");
                                                break;
                                            case 7:
                                                System.out.println("MiliGram");
                                                System.out.print("Masukan Angkanya ");
                                                satuan = tugas.nextInt();
                                                hasil = satuan * 1000;
                                                System.out.println("Hasilnya: " + hasil + "Mg");
                                                break;

                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (menu1 < 8);
                                    break;
                                // End Berat

                                default:
                                    System.out.println("Exit");
                                    break;
                            }
                        } while (menu < 4);
                        break;
                    // End Menu Kedua Konversi
                    // Menu Ketiga Secret Menu
                    case 3:
                        do {
                            // Login Ke Secret Menu
                            System.out.print("Harus Menginputkan Nilai Unik: ");
                            unik = tugas.next();
                            // Validasi
                            if (unik.length() <= 10 && unik.length() >= 7) {
                                // Menu Secret Menu
                                System.out.println("Selamat Datang VIP");
                                do {
                                    System.out.println("Pilihan Menu: \n"
                                            + "1.Uppercase \n " + "2.Lowercase\n" + "3.Reverse \n" + "4.Close");
                                    System.out.print("Silahkan Pilih Menu:");
                                    menu1 = tugas.nextInt();
                                    switch (menu1) {
                                        // UpperCase
                                        case 1:
                                            System.out.println("Silahkan Ketik Sesuatu Maka Akan Menjadi Kapital");
                                            tugas.nextLine();
                                            text = tugas.nextLine().toUpperCase();
                                            System.out.println("Hasilnya:" + text);
                                            break;
                                        // LowerCase
                                        case 2:
                                            System.out.println("Silahkan Ketik Sesuatu Maka Akan Menjadi Kecil");
                                            tugas.nextLine();
                                            text = tugas.nextLine().toLowerCase();
                                            System.out.println("Hasilnya: " + text);
                                            break;
                                        // Reverse
                                        case 3:
                                            System.out.println("Silahkan Ketik Sesuatu Maka Akan Menjadi Terbalik");
                                            tugas.nextLine();
                                            reverse = tugas.nextLine();
                                            List<String> list = Arrays.asList(reverse.split(" "));
                                            Collections.reverse(list);
                                            System.out.println(String.join(" ", list));
                                            break;
                                        default:
                                            menu = 5;
                                            break;
                                    }
                                } while (menu1 < 4);
                            } else {
                                // Jika Validasi Salah Maka Ke Menu Awal
                                System.out.println("Maaf Akses Ditolak");
                                menu = 5;
                            }
                        } while (menu < 5);
                        break;
                    default:
                        break;
                    // End Menu Ketiga Secret Menu
                }
            } while (menuAwal < 4);
            tugas.close();
        } else {
            // Jika validasi Salah Maka Scanner Tertutup dan Harus Run Ulang
            System.out.println("Akses Ditolak");
            tugas.close();
        }

    }
}
