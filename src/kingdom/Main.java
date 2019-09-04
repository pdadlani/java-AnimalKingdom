package kingdom;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // creating the mammals
    Mammal panda = new Mammal("Panda", 10, 1, 1869);
    Mammal zebra = new Mammal("Zebra", 10, 2, 1778);
    Mammal koala = new Mammal("Koala", 10, 3, 1816);
    Mammal sloth = new Mammal("Sloth", 10, 4, 1804);
    Mammal armadillo = new Mammal("Armadillo", 10, 5, 1758);
    Mammal raccoon = new Mammal("Raccoon", 10, 6, 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 10, 7, 2021);

    // creating the birds
    Bird pigeon = new Bird("Pigeon", 5, 8, 1837);
    Bird peacock = new Bird("Peacock", 5, 9, 1821);
    Bird toucan = new Bird("Toucan", 5, 10, 1758);
    Bird parrot = new Bird("Parrot", 5, 11, 1824);
    Bird swan = new Bird("Swan", 5, 12, 1758);

    // creating the fishies
    Fish salmon = new Fish("Salmon", 3, 13, 1758);
    Fish catfish = new Fish("Catfish", 3, 14, 1817);
    Fish perch = new Fish("Perch", 3, 15, 1758);

    
  }
}