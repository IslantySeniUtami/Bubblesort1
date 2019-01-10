package Latihan1;
import java.util.Arrays;
public class BubblesortAscending {
    public static void main(String[] args) {
        // Variabel
        int[] bilangan = {12, 4, 1, 9, 15};
        
        // Menampilkan bilangan 
        System.out.println("Bilangan sebelum di sorting Bubble Sort : "+Arrays. toString(bilangan));
      
        // Proses Bubble Sort
        System.out.println("\nProses Bubble Sort secara Ascending:");
        for(int c = 0; c < bilangan.length; c++) {
                // Menampilkan proses Iterasi
                System.out.println("Iterasi "+(c+1));
                for(int d =0; d < bilangan.length-1; d++) { if(bilangan[d] > bilangan[d+1]) {
                                // Proses pertukaran bilangan
                                int temp = bilangan[d];
                                bilangan[d] = bilangan[d+1];
                                bilangan[d+1] = temp;
                        }
                        // Tampilkan proses pertukaran tiap iterasi
                        System.out.println(Arrays.toString(bilangan));
                }
                System.out.println(); 
        }
        // Menampilkan hasil akhir
        System.out.println("Hasil akhir setelah di sorting: "+Arrays.toString(bilangan));  
    }
}
