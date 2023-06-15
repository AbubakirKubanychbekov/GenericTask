package serviceImpl;

import model.Animal;
import model.Person;
import service.GenericService;
import java.util.*;

import java.util.List;

public class PerGenericServiceImpl implements GenericService<Person> {
  private ArrayList<Person>people=new ArrayList<>();

    public PerGenericServiceImpl(ArrayList<Person> people) {
        this.people = people;
    }

    public PerGenericServiceImpl() {
    }

    @Override
    public String add(List<Person> people) {
        people.addAll(people);
        return "Saved person";
    }

    @Override
    public Person getById(Long id) {
        for (int i = 0; i <people.size(); i++) {
            if (people.get(i).getId().equals(id)){
               return people.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return people;
    }

    @Override
    public List<Person> sortByName() {

        return null;
    }

    @Override
    public List<Person> filterByGender() {
        return null;
    }

    @Override
    public List<Person> clear() {
        people.clear();
        return people;
    }
}
