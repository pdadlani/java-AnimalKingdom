# Project Animal Kingdom Search

A student that completes this project shows that they can:
* implement and use interfaces in Java
* implement and use abstract classes in Java
* implement and use Lambda Expressions in Java

# Introduction

Using a combination of interfaces, abstract classes, and lambda expressions, students will create and manipulate a list of animals using object oriented design principles.

# Instruction

* Create an abstract class for animals
    * All animals consume food the same way
    * Each animal is assigned a unique number, a name, and year discovered regardless of classification.

    * Methods will return a string saying how that animal implements the action
    * All animals can move, breathe, reproduce. How they do that, so what string should get returned when the method is executed, varies by animal type.
 
* Create classes for mammals, birds, fish
    * Mammals move - walk, breathe - lungs, reproduce - live births
    * Birds move - fly, breathe - lungs, reproduce - eggs
    * Fish move - swim, breathe - gills, reproduce - eggs

Hint: think about abstract classes and creating an arraylist using an abstract class type.

* Create a collection for the animals using the following data
    * Mammals:
        * Name: Panda      Year Named: 1869
        * Name: Zebra      Year Named: 1778
        * Name: Koala      Year Named: 1816
        * Name: Sloth      Year Named: 1804
        * Name: Armadillo  Year Named: 1758
        * Name: Raccoon    Year Named: 1758
        * Name: Bigfoot    Year Named: 2021

    * Birds:
        * Name: Pigeon  Year Named: 1837
        * Name: Peacock Year Named: 1821
        * Name: Toucan  Year Named: 1758
        * Name: Parrot  Year Named: 1824
        * Name: Swan    Year Named: 1758

    * Fish:		
        * Name: Salmon  Year Named: 1758
        * Name: Catfish Year Named: 1817
        * Name: Perch   Year Named: 1758

* Using Lambda Expressions

    * List all the animals in descending order by year named
    * List all the animals alphabetically
    * List all the animals order by how they move
    * List only those animals the breathe with lungs
    * List only those animals that breathe with lungs and were named in 1758
    * List only those animals that lay eggs and breathe with lungs
    * List alphabetically only those animals that were named in 1758 
    
* Stretch Goal
    * For the list of animals, list alphabetically those animals that are mammals.

