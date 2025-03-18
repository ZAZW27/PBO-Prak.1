public class Prosedural {
    public static void main(String[] args){
        // hitung volume tbaung: Pi, jari jari, tinggi
        // Rumus: V=π×r2×t
        double Pi = Math.PI; 
        int jari2 = 5; 
        int tinggi = 20; 

        double hasil = Pi * Math.pow(jari2, 2) * tinggi; 
        System.out.println(String.format("%.2f", hasil));
    }
}
