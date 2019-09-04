package kingdom;

public class Bird extends Animals {
  private int number;
  private String name;
  private int yearDiscovered;

  public Bird(String name, int fuel, int number, int yearDiscovered) {
    super(fuel);
    this.number = number;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  @Override
  public String move() {
    return "fly";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }

  @Override
  public String toString() {
    return '\n' + "Bird{" + "name=" + name + ", number" + number + ", fuel=" + fuel + ", year discovered=" + yearDiscovered + '}';
  }
}