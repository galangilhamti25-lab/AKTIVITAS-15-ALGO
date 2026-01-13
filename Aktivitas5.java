public class Aktivitas5 {

    public static int binarySearch(int[] nilai, int cari) {
        int low = 0;
        int high = nilai.length - 1;
        int langkah = 0;

        while (low <= high) {
            langkah++;
            int mid = (low + high) / 2;

            System.out.println("Langkah " + langkah + " -> Low=" + low + ", High=" + high + ", Mid=" + mid);

            if (nilai[mid] == cari) {
                System.out.println("Jumlah langkah pencarian: " + langkah);
                return mid;
            } else if (cari < nilai[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Jumlah langkah pencarian: " + langkah);
        return -1;
    }

    public static void main(String[] args) {
        // a. Array nilai terurut
        int[] nilaiMahasiswa = {55, 60, 65, 70, 75, 80, 85, 90};
        int cariNilai = 75;

        // b. Binary Search
        int hasil = binarySearch(nilaiMahasiswa, cariNilai);

        // c. Menampilkan hasil
        if (hasil != -1) {
            System.out.println("Status: Data ditemukan");
            System.out.println("Indeks ditemukan: " + hasil);
        } else {
            System.out.println("Status: Data tidak ditemukan");
        }
    }
}