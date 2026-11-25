public class Tugas13Module15 {

    static void main(String[] args) {

        String[] warnaWarni = {"Hitam", "Biru", "Putih", "Merah", "Kuning"};

        for (String warna:warnaWarni){
            if (warna == "Putih") continue;
            System.out.println("Warnanya adalah " + warna);
        }


    }
}
