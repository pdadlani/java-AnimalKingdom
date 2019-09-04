package kingdom;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // creating the mammals
    Mammal panda = new Mammal("Panda", 10, 1869);
    Mammal zebra = new Mammal("Zebra", 10, 1778);
    Mammal koala = new Mammal("Koala", 10, 1816);
    Mammal sloth = new Mammal("Sloth", 10, 1804);
    Mammal armadillo = new Mammal("Armadillo", 10, 1758);
    Mammal raccoon = new Mammal("Raccoon", 10, 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 10, 2021);

    // creating the birds
    Bird pigeon = new Bird("Pigeon", 5, 1837);
    Bird peacock = new Bird("Peacock", 5, 1821);
    Bird toucan = new Bird("Toucan", 5, 1758);
    Bird parrot = new Bird("Parrot", 5, 1824);
    Bird swan = new Bird("Swan", 5, 1758);

    // creating the fishies
    Fish salmon = new Fish("Salmon", 3, 1758);
    Fish catfish = new Fish("Catfish", 3, 1817);
    Fish perch = new Fish("Perch", 3, 1758);


    // adding all mammals, birds, and fishies to array list
    ArrayList<Animals> allAnimals = new ArrayList<Animals>();
    allAnimals.add(panda);
    allAnimals.add(zebra);
    allAnimals.add(koala);
    allAnimals.add(sloth);
    allAnimals.add(armadillo);
    allAnimals.add(raccoon);
    allAnimals.add(bigfoot);
    allAnimals.add(pigeon);
    allAnimals.add(peacock);
    allAnimals.add(toucan);
    allAnimals.add(parrot);
    allAnimals.add(swan);
    allAnimals.add(salmon);
    allAnimals.add(catfish);
    allAnimals.add(perch);

    System.out.println();

    System.out.println("*** Animals in descending order by year named ***");
    allAnimals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
    allAnimals.forEach(a -> System.out.println(a));
  }
}