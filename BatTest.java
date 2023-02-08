// The bat should be tested by attacking three towns, 
// eating two humans, flying twice, and then displaying its energy.
// Use the display energy from the superclass!


public class BatTest {
  public static void main(String[] args) {
    Bat bat = new Bat();
    bat.attackTown();
    bat.attackTown();
    bat.attackTown();
    bat.eatHumans();
    bat.eatHumans();
    bat.fly();
    bat.fly();
  }
}