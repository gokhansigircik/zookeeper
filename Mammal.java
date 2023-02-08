// A zookeeper has asked for your help creating a way for her 
// to track her animals' energy levels. In particular, she is 
// having difficulty tracking the mammals. Every mammal should
// have an energy level (default 100). They should all be able 
// to display their energy levels when asked through the displayEnergy
// method, which should print and return the energy level.

public class Mammal{
  public int energyLevel = 100;
  public int displayEnergy(){
    System.out.println("The energy level of the Mammal is now : "+energyLevel);
    return energyLevel;
  }
}