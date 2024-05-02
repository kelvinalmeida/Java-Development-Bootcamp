package model;

public class Centrifuge extends LabEquipment {

    private int maxRPM;

    public static final int RPM = 500;

    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        this.maxRPM = maxRPM;
    }

    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM < RPM) {
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM.");
        }

        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }    
}