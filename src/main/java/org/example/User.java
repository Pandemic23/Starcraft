package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class User {
    private String selectedRace; // 선택한 종족
    private List<Unit> unitList; // 유닛 리스트

    public void printUnitList() {
        int index = 1;
        for (Unit unit : unitList) {
            System.out.println(index + "  " + unit.name() + " - ATK: " + unit.atk() + ", DEF: " + unit.dep());
            index++;
        }
    }

    public User() {

        this.selectedRace = "Terran";
        this.unitList = new ArrayList<>();
    }

    // 종족 선택 메서드
    public void chooseRace(String race) {
        this.selectedRace = race;
    }

    // 유닛 생성 및 리스트 추가 메서드
    public void createAndAddUnits() {
        Random random = new Random();
        Unit[] availableUnits = getAvailableUnits();
        int unitCount = getUnitCount();

        for (int i = 0; i < unitCount; i++) {
            Unit randomUnit = availableUnits[random.nextInt(availableUnits.length)];
            unitList.add(randomUnit);
        }
    }


    // 아군 유닛 리스트 반환
    public List<Unit> getUnitList() {
        return unitList;
    }

    // 선택한 종족의 유닛 배열 반환
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