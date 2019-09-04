package kingdom;

public class Fish extends Animals {
  private int number;
  private String name;
  private int yearDiscovered;

  public Fish(String name, int fuel, int number, int yearDiscovered) {
    super(fuel);
    this.number = number;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  @Override
  public String move() {
    return "swim";
  }

  @Override
  public String breathe() {
    return "gills";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }

  @Override
  public String toString() {
    return '\n' + "Fish{" + "name=" + name + ", number" + number + ", fuel=" + fuel + ", year discovered=" + yearDiscovered + '}';
  }
}