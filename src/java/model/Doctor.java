/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dmx
 */
public class Doctor {
    private int doctorId, ExperienceYears;
    private double rating;
    private String name, specialty, Description, Position;


    //String riêng dùng trong màn hình services của HongNT
    private String lastname,firstname;
    //Constructor riêng dùng trong màn hình services của HongNT

    public Doctor(int doctorId, String lastname, String firstname) {
        this.doctorId = doctorId;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    //getter setter dùng trong  màn hình services của HongNT
    
    
    public Doctor() {
    }


    public Doctor(int doctorId, int ExperienceYears, double rating, String name, String specialty, String Description, String Position) {
        this.doctorId = doctorId;
        this.ExperienceYears = ExperienceYears;
        this.rating = rating;
        this.name = name;
        this.specialty = specialty;
        this.Description = Description;
        this.Position = Position;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getExperienceYears() {
        return ExperienceYears;
    }

    public void setExperienceYears(int ExperienceYears) {
        this.ExperienceYears = ExperienceYears;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }



    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    

            

   
    
}
