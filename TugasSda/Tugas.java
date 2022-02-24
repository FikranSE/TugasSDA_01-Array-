import java.util.ArrayList;

public class Tugas{

    public static void main(String[] args){
        // Soal Nomor 1 (is Empty)
        String nama =  "A";
        String nama1 = "F";
        String nama2 = "I";
        String nama3 = "T";
        System.out.println(nama1.isEmpty());

        // Soal Nomor 2 (SIZE)
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("F");
        nama.add("I");
        nama.add("T");
        System.out.println(nama.size());

        // Soal Nomor 3 (get)
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("F");
        nama.add("I");
        nama.add("T");
        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));

        // Soal Nomor 4 (indexOf)
        String nama = "AFIT";
        System.out.println(nama.indexOf("A"));
        System.out.println(nama.indexOf("C"));
        System.out.println(nama.indexOf("Q"));

        // Soal Nomor 5 (remove)
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("F");
        nama.add("I");
        nama.add("T");
        nama.remove(0);
        nama.remove(3);
        nama.remove(2);
        System.out.println(nama);

        // Soal Nomor 6 (add)
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("F");
        nama.add("I");
        nama.add("T");

        nama.add(0,"E");
        nama.add(2,"F");
        nama.add(3,"G");
        nama.add(4,"H");
        nama.add(6,"H");
        nama.add(-3,"J");
        System.out.println(nama);

    }
}