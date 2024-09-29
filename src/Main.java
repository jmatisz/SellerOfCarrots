public class Main {
    public static void main(String[] args) {
        Seller firstSeller = new Seller();
        Seller secondSeller = new Seller();

        firstSeller.setName("Novák");
        firstSeller.setCityName("Praha");

        secondSeller.setName("Havelka");
        secondSeller.setCityName("Brno");

        System.out.println(firstSeller.getName());
        System.out.println(secondSeller.getName());
    }
}