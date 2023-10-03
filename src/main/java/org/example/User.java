package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class User {


    private String selectedRace; // 선택한 종족
    private List<Unit> unitList; // 유닛 리스트


    private List<Integer> unitDepList;

    public User() {

        this.selectedRace = "Terran";
        this.unitList = new ArrayList<>();
        this.unitDepList = new ArrayList<>();
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public String getSelectedRace() {
        return selectedRace;
    }

    public int getUnitListlength() {
        return unitList.size();
    }

    public List<Integer> getUnitDepList() {
        return unitDepList;
    }

    public void printUnitList() {
        int index = 1;
        for (Unit unit : unitList) {
            System.out.println(
                    index + "  " + unit.name() + " - ATK: " + unit.atk() + ", DEF: " + unitDepList.get(index - 1));
            index++;
        }
    }


    public void chooseRace(String race) {
        this.selectedRace = race;
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