public class Random {
  public static void main(String[] args) {
    for (int i = 0; i < 15; i++) {
      int randomNum = (int)(Math.random() * 100) + 1;
      System.out.println(randomNum);
    }  
  }
}
