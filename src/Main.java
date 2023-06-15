import enums.Gender;
import model.Animal;
import model.Person;
import serviceImpl.AniGenericServiceImpl;
import serviceImpl.PerGenericServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Animal>animals1=new ArrayList<>(
                List.of(new Animal(23L,"Cow",14, Gender.MALE),
                        new Animal(24L,"Dog",5,Gender.FEMALE),
                        new Animal(25L,"Snake",8,Gender.FEMALE),
                        new Animal(26L,"Cat",9,Gender.MALE)));

        List<Person>people1=new ArrayList<>(List.of(
                new Person(30L,"Ilon",35,Gender.MALE),
                new Person(40L,"Valentina",40,Gender.FEMALE),
                new Person(50L,"Mark",28,Gender.MALE),
                new Person(60L,"Sveta",18,Gender.FEMALE)));

        PerGenericServiceImpl perGenericServiceImpl=new PerGenericServiceImpl((ArrayList<Person>) people1);
        AniGenericServiceImpl aniGenericServiceImpl=new AniGenericServiceImpl();


        Scanner scannerWord=new Scanner(System.in);
        Scanner scannerDigit=new Scanner(System.in);
        System.out.println("1.Add" +
                "\n2.Get by id" +
                "\n3.Get all" +
                "\n4.Sort by name" +
                "\n5.Filter by gender" +
                "\n6.Clear");

        int x;
        while (true){
            x=scannerDigit.nextInt();
            switch (x){
                case 1: {
                    System.out.println(perGenericServiceImpl.add(people1));
                } case 2:{
                    System.out.println(perGenericServiceImpl.getById(50L));
                } case 3: {
                    System.out.println(perGenericServiceImpl.getAll());
                } case 4:{
                    System.out.println(perGenericServiceImpl.sortByName());
                } case 5: {
                    System.out.println(perGenericServiceImpl.clear());
                }
            }
        }

    }

    public static Comparator<Person>personComparator1=new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Person>personComparator2=new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };
    public static Comparator<Animal>animalComparator1 = new Comparator<Animal>() {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Animal>animalComparator2 = new Comparator<Animal>() {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o2.getName().compareTo(o1.getName());

        }
    };
}