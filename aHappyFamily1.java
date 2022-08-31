package HomeWork6;

import HomeWork4.Human;
import HomeWork4.Pet;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class aHappyFamily1 {

    public static void main(String[] args) throws Throwable {

        Set <String> habits = new HashSet<>();
        habits.add("Eating");
        habits.add("sleeping");

        Pet1 pet = new Fish("Rock", 5, 25, habits);
        pet.respond();
        Human1 mother = new Human1("Jane", "Karleone", 1935);
        Human1 father = new Human1("Vito", "Karleone", 1932);
        Human1 mother1 = new Human1("Marina", "Davidson", 1965);
        Human1 father1 = new Human1("Tommy", "Davidson", 1960);
        Family family = new Family(mother, father);
        Family family1 = new Family(mother1,father1);
        System.out.println("-----");


        Map<String,String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work");
        mother.setSchedule(schedule);
        mother1.setSchedule(schedule);
        Human1 child = new Human1("Michael", "Karleone", 2000,
                95, schedule,family);
        Human1 child1 = new Human1("Sergio", "Davidson", 1992,
                93, schedule,family1);
        Set<Pet1> bezdim_pet = new HashSet<>();
        family.setPet(bezdim_pet);
        family1.setPet(bezdim_pet);
        Men men = new Men();
        Women women = new Women();
       /* men.greetPet();
        men.repairCar();
        women.greetPet();
        women.makeUp();*/

        family.addChild(child);
        family.countFamily();
        System.out.println(child.getFamily());
        System.out.println(family);

        family.deleteChild(child);
        System.out.println(family);
        family.countFamily();
        //family.finalize();
        //  pet.finalize();
        family1.addChild(child1);
        family1.countFamily();
        System.out.println(child1.getFamily());
        System.out.println(family1);

        /*family1.deleteChild(child1);
        System.out.println(family1);
        family1.countFamily();*/
        //family1.finalize();
        //  pet.finalize();

        System.out.println();


        FamilyController familyController = new FamilyController(new FamilyService(new CollectionFamilyDao()));

        Family family01 = familyController.createNewFamily(mother,father);
        Family family02 = familyController.createNewFamily(mother1,father1);
        familyController.getFamilyByIndex(0);
        familyController.addPet(0,pet);
        familyController.adoptChild(child,family01);
        familyController.adoptChild(child1,family02);
        familyController.displayAllFamilies();
        System.out.println(familyController.getFamiliesBiggerThan(1));
        System.out.println(familyController.getFamiliesLessThan(10));
        System.out.println(familyController.countFamiliesWithMemberNumber(2));
        System.out.println("-----");

        Date today = new Date();
        DateFormat f = new SimpleDateFormat("dd MM yyyy");
        Date year=null;
        try {
            year=f.parse( "10 08 2022");
        }catch (ParseException e){
            e.printStackTrace();
        }

        System.out.println(father.describeAge(today,year));


        System.out.println(familyController.adoptChild(new Human1("Jack", "Tomson", "24/03/2001", 100),family01));








        for (int i = 0; i < 10000; i++) {
            Human1 human = new Human1();
        }

    }


}