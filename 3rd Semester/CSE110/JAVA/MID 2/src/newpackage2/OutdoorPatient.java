/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * @author saraf
 */
public class OutdoorPatient extends Patient {

    double visitingFee;

    OutdoorPatient() {

    }

    OutdoorPatient(int id, String name, double visitingFee) {
        super(id, name);
        this.visitingFee = visitingFee;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name +"\nVisiting Fee: "+visitingFee;
    }

    @Override
    public double bill() {
        return visitingFee;
    }

}
