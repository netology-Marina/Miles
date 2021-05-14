public class Main {
  public static void main(String[] args) {
   int priceTiket = 999; // в рублях
   int bonusMile;
   int rubleForMile = 20; // рублей за 1 миллю

      bonusMile = priceTiket / rubleForMile;
      System.out.println("Бонусные милли :" + bonusMile);
      
  }
}