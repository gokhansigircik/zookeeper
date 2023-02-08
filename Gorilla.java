
// Once this is done, she has asked that you also create a 
// separate class of gorilla, which can throw things at people 
// but will lose energy (-5) whenever this is done. The gorilla 
// should also be able to eatBananas and regain energy (+10). 
// The gorilla should also be able to climb at the expense of energy (-10).

public class Gorilla extends Mammal{
  public Gorilla(){
    super();
  }
  public void throwThings(){
    System.out.println("Gorilla is throwing something");
    energyLevel -=5;
    displayEnergy();
  }

  public void eatBananas(){
    System.out.println("Gorilla is eating a Banana");
    energyLevel +=10;
    displayEnergy();
  }

  public void climb(){
    System.out.println("Gorilla is tired needs some rest");
    energyLevel -=10;
    displayEnergy();
  }
}
