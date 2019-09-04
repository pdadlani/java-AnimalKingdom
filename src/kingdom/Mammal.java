package kingdom;

public class Mammal extends Animals {
  private int number;
  private String name;
  private int yearDiscovered;

  public Mammal(String name, int fuel, int number, int yearDiscovered) {
    super(fuel);
    this.number = number;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  @Override
  public String move() {
    return "walk";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "live births";
  }

  @Override
  public String toString() {
    return '\n' + "Mammal{" + "name=" + name + ", number" + number + ", fuel=" + fuel + ", year discovered=" + yearDiscovered + '}';
  }
}