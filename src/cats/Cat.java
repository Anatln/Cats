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

    private int hunger = 50;
    private int tiredness = 30;
    

    public String feed(String food) {
        // Котик кушает
        String returnString = "";
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
                returnString = name + " понюхал " + food + ", но есть не стал";
                return returnString;
            }
        } else {
            returnString = ("Увы, мертвые котики не едят");
            return returnString;
        }
        return returnString;

    }

    public String tick() {
        String returnString = "";
        hunger = hunger + 10;
        System.out.println("hunger=" + hunger);
        System.out.println("mood=" + mood);
        if (hunger > 100) {

            alive = false;
        }
        if (alive) {
            // настроение у котика растет, если голод меньше 30, и падает, если голод больше 30
            mood = mood + (30 - hunger);
            System.out.println("Из-за голода " + hunger + " у котика настроение изменилось на " + (30 - hunger));
            if (hunger > 50) {
                returnString = (name + " сказал мяу. Это НАМЕК!");
                return returnString;
            }
            return name + " никак себя не проявляет. Может, котика нет?";
        }
        return "Для мертвых котиков время остановилось";
    }

    public String tik() {
        String returnString = "";
        tiredness = tiredness + 10;
        System.out.println("tiredness=" + tiredness);
        System.out.println("mood=" + mood);
        if (tiredness > 100) {

            alive = false;
        }
        if (alive) {
            // усталость у котика растет, если голод меньше 30, и падает, если голод больше 30
            tiredness = tiredness + (30 - hunger);
            System.out.println("Из-за голода " + hunger + " у котика усталость изменилась на " + (30 - hunger));
            if (tiredness > 50) {
                returnString = (name + " Очень устал!  Играть не хочет");
                return returnString;
            }
            return name + " никак себя не проявляет. Может, Пошеборшать фантиком?";
        }
        return "Для усталых котиков жизнь не мила";
    }

    public String Play() {
        if (hunger > 60) {
            return "Котик играть не хочет. Лучше покормите животное!";
        }
        hunger = hunger + 20;
        mood += 50;
        return "Весело поиграли с питомцем. Настроение на высоте.";
    }

    public String Stroke() {
        if (mood < 0) {
            mood += 10;
            return name + " цапнул вас за руку. У котика явно плохое настроение!";
        }
        mood += 40;
        return name + " урчит, улучшая свое и ваше настроение.";
    }

}
