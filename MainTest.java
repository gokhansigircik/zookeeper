// She asks that you demonstrate that the class works as expected 
// by having the gorilla throw things 3 times, eat bananas 
// twice and climb once; then print the gorilla's energy level.

public class MainTest {
  public static void main(String[] args) {
    Gorilla gorilla = new Gorilla();
    gorilla.throwThings();
    gorilla.throwThings();
    gorilla.throwThings();
    gorilla.eatBananas();
    gorilla.eatBananas();
    gorilla.climb();
  }
}
