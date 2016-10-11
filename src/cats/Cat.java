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

    public String feed(String food) {
        // Котик кушает
        String returnString="";
        if (alive) {
            if (hunger >= 70) {
                returnString = name + " с урчением накинулся на еду, и съел " + food;
                hunger = hunger - 40;
                return returnString;
            }
            if (hunger >= 40 && hunger < 70) {
                returnString = name + " неторопясь съел " + food;
                hunger = hunger - 30;
                return returnString;
            }
            if (hunger < 40) {
                returnString =(name + " понюхал " + food + ", но есть не стал");
                return returnString;
            }
        } else {
            returnString =("Увы, мертвые котики не едят");
            return returnString;
        }
        return returnString;

    }

    public String tick() {
        String returnString= "";
        hunger = hunger + 10;
        System.out.println(hunger);
        if (hunger > 100) {
            
            alive = false;
        }
        if (alive) {
            mood=mood+(30-hunger);
            if (hunger > 50) {
                returnString =(name + " сказал мяу. Это НАМЕК!");
                return returnString;
            } return "Котик никак себя не проявляет. Может, котика нет?";
        } 
        return "Для мертвых котиков время остановилось";    
    }
}
