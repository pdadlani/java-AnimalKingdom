package kingdom;

public abstract class Animals {

  private static int animalID = 0;
  String name;
  int fuel;
  int number;
  int yearDiscovered;

  public Animals(String name, int fuel, int yearDiscovered) {
  // public Animals(int fuel) {
    animalID++;
    this.fuel = fuel;
    number = animalID;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  // default constructor, BUT is it needed?
  // does it just set initial fuel to the value you give? or ... ?
  // public Animals() {
  //   fuel = 1;
  // }
  
  public void consumeFood(int i) {
    fuel = fuel - i;
  }

  public int getFuel() {
    return fuel;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public int getYearDiscovered() {
    return yearDiscovered;
  }

  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();

}