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
public class Cats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat Murzik = new Cat();
        Murzik.name="Мурзик";
        Murzik.colour="Рыжий";
        Murzik.age=7*12;
        
        Murzik.feed("сосисон");
        Murzik.feed("молоко");
        Murzik.feed("мясо");
        Murzik.feed("паштет");
        
        int x= 30;
        System.out.println("Прошло "+x+"  часов");
        for (int i = 0; i < 30; i++) {
            Murzik.tick();
        }
        
        Murzik.feed("паштет"); 
        
    }
    
}
