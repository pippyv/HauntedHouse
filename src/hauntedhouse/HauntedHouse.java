/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhouse;

/**
 *
 * @author leev
 */
public class HauntedHouse {
    
    final static int NUMBER_OF_ROOMS = 2;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room room[] = new Room[NUMBER_OF_ROOMS];
        // TODO code application logic here
        System.out.println("You are in a haunted house");
        room[0] = new Room(1, "Main Hallway");
        room[1] = new Room(2, "Kitchen");
        
        // for each room in our room array
        // randomly pick another room (not including current room
        // set room left door = randomly selected room
        // 
        
        System.out.println(room[0].toString());
        System.out.println(room[1].toString());
    }
    
}
