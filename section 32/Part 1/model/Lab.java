package model;
import java.util.ArrayList;

public class Lab {

    private ArrayList<LabEquipment> labEquipment;


    public Lab() {
        labEquipment = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index) {
        return labEquipment.get(index).clone();
    }

    public void setLabEquipment(LabEquipment labEquipmentObj, int index) {
        this.labEquipment.set(index, labEquipmentObj.clone());
    }

    public void addLabEquipment(LabEquipment source) {
        labEquipment.add(source.clone());
    }
}
