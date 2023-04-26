package org.example.PrototypePattern;

public class ConcretePrototype implements Prototype{
    private int id;
    public ConcretePrototype(int id){
        this.id=id;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype(1);
        Prototype prototype2 = prototype1.clone();

        System.out.println("Prototype 1 ID: " + prototype1.getId());
        System.out.println("Prototype 2 ID: " + prototype2.getId());
        prototype2.setId(2);
        System.out.println("Prototype 2 ID after change: " + prototype2.getId());
    }
}
