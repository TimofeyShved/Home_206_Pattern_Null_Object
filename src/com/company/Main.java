package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	    // Паттерн (нулевой объект), что-бы не ловить ошибки null
        // необходим нулевой объект, он имеет пустые методы, что бы программа продолжала работать

        // создаем животное (￣ ￣|||)
        Animal animal = getAnimal();
        animal.eat();
    }

    static Animal getAnimal(){
        // но вот незадача, его не существует (」°ロ°)」
        try {
            if (new File("animal-lion.txt").exists()){
                return new Lion();
            }
        } finally {
            return new NoAnimal();
        }
    }
}

interface Animal {
    void eat();
}

class Lion implements Animal{
    @Override
    public void eat() {
        System.out.println("Lion eat meat");
    }
}

// и на помощь приходит нулевой объект (＃￣ω￣)
class NoAnimal implements Animal{
    @Override
    public void eat() { }
}
