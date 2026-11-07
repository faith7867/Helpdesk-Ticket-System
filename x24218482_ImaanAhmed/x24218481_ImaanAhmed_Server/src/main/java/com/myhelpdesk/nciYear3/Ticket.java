/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhelpdesk.nciYear3;

/**
 *
 * @author ImaanAhmed
 */
public class Ticket { //Representing one helpdesk ticket
    
    private final String ticketId;
    private final String studentName;
    private final String category;
    private final String description;
    
    //Constructor
    public Ticket(String ticketId, String studentName, String category, String description) {
        this.ticketId = ticketId;
        this.studentName = studentName;
        this.category = category;
        this.description = description;
    }
    
    //Getters
    public String getStudentName() {
        return studentName;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
    
    
    //Method to display ticket info

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId 
                + " | Student: " + studentName 
                + " | Category: " + category
                + " | Description: " + description;
    } //end display method
    
    
    
} //end class
