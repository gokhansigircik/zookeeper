// The zookeeper has also captured a rare specimen. Its default energy 
// is much higher than most mammals, its energy level is 300. It also can 
// do a lot more than climb - it can fly. Moreover, this specimen doesn't 
// eat bananas, it eats humans... and it doesn't throw things, but attacks
//  towns. The zookeeper has caught a giant Bat and wants your help to track 
//  its energy levels.


public class Bat extends Mammal{
  public Bat(){
    super();
    energyLevel =300;
  }

  public void fly(){
    System.out.println("pirrrr pirrrr");
    energyLevel -=50;
    displayEnergy();
  }

  public void eatHumans(){
    energyLevel +=25;
    displayEnergy();
  }
  public void attackTown(){
    System.out.println("i am gonna eat you all");
    energyLevel -=100;
    displayEnergy();
  }


}
