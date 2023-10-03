package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Com {


    private String selectedRace;
    private List<Unit> unitList;


    private List<Integer> unitDepList;

    public Com() {

        this.selectedRace = "Zerg";
        this.unitList = new ArrayList<>();
        this.unitDepList = new ArrayList<>();
    }

    public String getSelectedRace() {
        return selectedRace;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public int getUnitListlength() {
        return unitList.size();
    }

    public List<Integer> getUnitDepList() {
        return unitDepList;
    }

    public void selectRace() {
        Random random = new Random();
        String[] racelist = new String[] {"Terran", "Protos", "Zerg"};

        this.selectedRace = racelist[random.nextInt(racelist.length)];
    }


    public void printUnitList() {
        int index = 1;
        for (Unit unit : unitList) {
            System.out.println(
                    index + "  " + unit.name() + " - ATK: " + unit.atk() + ", DEF: " + unitDepList.get(index - 1));
            index++;
        }
    }

    public void createAndAddUnits() {
        Random random = new Random();
        Unit[] availableUnits = getAvailableUnits();
        int unitCount = getUnitCount();

        for (int i = 0; i < unitCount; i++) {
            Unit randomUnit = availableUnits[random.nextInt(availableUnits.length)];
            unitList.add(randomUnit);
            unitDepList.add(randomUnit.dep());
        }
    }


    private Unit[] getAvailableUnits() {
        switch (selectedRace) {
            case "Terran":
                return Terran.UNITS;
            case "Protos":
                return Protos.UNITS;
            case "Zerg":
                return Zerg.UNITS;
            default:
                return Terran.UNITS;
        }
    }

    private int getUnitCount() {
        switch (selectedRace) {
            case "Terran":
                return Terran.UNIT_COUNT;
            case "Protos":
                return Protos.UNIT_COUNT;
            case "Zerg":
                return Zerg.UNIT_COUNT;
            default:
                return 0;
        }
    }

}
