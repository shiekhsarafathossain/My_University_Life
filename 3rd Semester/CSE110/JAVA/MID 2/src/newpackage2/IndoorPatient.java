package newpackage2;

public class IndoorPatient extends Patient {

    double visitingFee, bedFee, medicineFee, labTestFee;

    IndoorPatient(int id, String name, double visitingFee, double bedFee, double medicineFee, double labTestFee) {
        super(id, name);
        this.visitingFee = visitingFee;
        this.bedFee = bedFee;
        this.medicineFee = medicineFee;
        this.labTestFee = labTestFee;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nVisiting Fee: " + visitingFee
                + "\nBed Fee: " + bedFee + "\nMedicine Fee: " + medicineFee
                + "\nLab Test Fee: " + labTestFee;
    }

    @Override
    public double bill() {
        return visitingFee+bedFee+medicineFee+labTestFee;
    }

}
