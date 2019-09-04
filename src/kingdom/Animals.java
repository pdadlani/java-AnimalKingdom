package kingdom;

public abstract class Animals {

  int fuel;

  public Animals(int fuel) {
    this.fuel = fuel;
  }

  // default constructor, BUT is it needed?
  // does it just set initial fuel to the value you give? or ... ?
  // public Animals() {
  //   fuel = 1;
  // }
  
  public void consumeFood(int i) {
    fuel = fuel - i;
  }

  public int getFuelLevel() {
    return fuel;
  }

  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();

}