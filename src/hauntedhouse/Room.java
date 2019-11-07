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
public class Room {
    private int roomNumber;
    private String roomName;
    private int doorLeft;
    private int doorRight;
    
    Room(int room, String name) {
        roomNumber = room;
        roomName = name;
    }
    
    public int getRoomNumber() {
        return this.roomNumber;
    }
    public String getRoomName() {
        return this.roomName;
    }
    public String toString() {
        String returnString;
        returnString = "room number: " + roomNumber + "\troomName: " + roomName;
        return(returnString);
    }
    
}
