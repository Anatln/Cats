/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

/**
 *
 * @author student
 */
public class Cat {

    String name;
    String colour;
    int age;
    boolean alive = true;
    int mood = 50;

    private int hunger = 100;

    public void feed(String food) {
        // Котик кушает
        System.out.println(name + " предложили " + food);
        if (alive) {
            if (hunger >= 70) {
                System.out.println(name + " с урчением накинулся на еду, и съел " + food);
                hunger = hunger - 40;
                return;
            }
            if (hunger >= 40 && hunger < 70) {
                System.out.println(name + " неторопясь съел " + food);
                hunger = hunger - 30;
                return;
            }
            if (hunger < 40) {
                System.out.println(name + " понюхал " + food + ", но есть не стал");
                return;
            }
        } else {
            System.out.println("Увы, мертвые котики не едят");
        }

    }

    public void tick() {
        hunger = hunger + 10;
        if (hunger > 100) {
            
            alive = false;
        }
        if (alive) {
            mood=mood+(30-hunger);
            if (hunger > 50) {
                System.out.println(name + " сказал мяу. Это НАМЕК!");
            }
        }

    }
}
