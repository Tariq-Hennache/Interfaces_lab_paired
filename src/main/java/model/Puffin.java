package model;

import model.interfaces.IFly;
import model.interfaces.IPrey;
import model.interfaces.ISwim;
import model.interfaces.IAnimal;


public class Puffin implements IAnimal, IFly, ISwim, IPrey {

//    @Override
//    public void animal(){
//        System.out.println("Puffin is an animal");
//    }

    @Override
    public void prey(){
        System.out.println("Puffin is prey");
    }
    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from predator");
    }
}
