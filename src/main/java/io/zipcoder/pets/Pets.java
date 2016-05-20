package io.zipcoder.pets;

public class Pets {
    private String name;
    private String type;

    public Pets(){}

    public Pets returnAnimal(String name,String type) {
        switch (type) {
            case "cat":
                Cat cat = new Cat();
                cat.setName(name);
                cat.setType(type);
                return cat;
            case "dog":
                Dog dog = new Dog();
                dog.setName(name);
                dog.setType(type);
                return dog;
            case "bird":
                Bird bird = new Bird();
                bird.setName(name);
                bird.setType(type);
                return bird;
            default:
                System.out.println("What kind of cat is that?");
                Cat cat1 = new Cat();
                cat1.setName(name);
                cat1.setType(type);
                return cat1;
        }
    }

    public String speak(){
        return "I'm a Pet!";
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setType(String newType){
        type = newType;
    }
}

