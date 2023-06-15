package serviceImpl;

import model.Animal;
import service.GenericService;
import java.util.*;
import java.util.List;

public class AniGenericServiceImpl implements GenericService<Animal> {
    private ArrayList<Animal>animals;

    public AniGenericServiceImpl(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public AniGenericServiceImpl() {
    }

    @Override
    public String add(List<Animal> animals) {
        animals.addAll(animals);
        return "Saved!!!";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal s:animals) {
            if (s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return animals;
    }

    @Override
    public List<Animal> sortByName() {
        return null;
    }


    @Override
    public List<Animal> filterByGender() {
        return null;
    }

    @Override
    public List<Animal> clear() {
        animals.clear();
        return animals;
    }

}