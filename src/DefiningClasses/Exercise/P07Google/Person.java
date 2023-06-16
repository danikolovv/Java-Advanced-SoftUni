package DefiningClasses.Exercise.P07Google;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;

    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void addParent(Parent parent) {
        parents.add(parent);
    }

    public List<Child> getChildren() {
        return children;
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println("Company:");
        if (company != null) {
            System.out.println(company.toString());
        }
        System.out.println("Car:");
        if (car != null) {
            System.out.println(car.toString());
        }
        System.out.println("Pokemon:");
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon.toString());
        }
        System.out.println("Parents:");
        for (Parent parent : parents) {
            System.out.println(parent.toString());
        }
        System.out.println("Children:");
        for (Child child : children) {
            System.out.println(child.toString());
        }
    }
}
