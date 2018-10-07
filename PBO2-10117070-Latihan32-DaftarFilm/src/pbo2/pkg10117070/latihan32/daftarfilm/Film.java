/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan32.daftarfilm;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program menampilkan data Daftar Film
 */
public class Film {

    String namaFilm, genre;
    double rating;
    int duration;

    public void playing() {
        System.out.println("Judul Film\t: " + namaFilm);
        System.out.println("Genre Film\t: " + genre);
        System.out.println("Rating Film\t: " + rating);
        System.out.println("Duration Film\t: " + duration +" Menit");
    }

}
