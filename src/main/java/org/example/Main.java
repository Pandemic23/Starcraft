package org.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String selectedRace = JOptionPane.showInputDialog("당신의 종족은?(Terran/Protos/Zerg)");
        User user1 = new User();
        user1.chooseRace(selectedRace);
        user1.createAndAddUnits();
        System.out.println("아군\t" + selectedRace);
        user1.printUnitList();
        // 적군 생성
//        User user2 = new User();
//        user2.chooseRace("Protos");
//        user2.createAndAddUnits();


        // 공격


        // 결과 출력
//        System.out.println("User 1의 아군 유닛:");
//        for (Unit unit : user1.getUnitList()) {
//            System.out.println("Unit: " + unit.name() + " - ATK: " + unit.atk() + ", DEF: " + unit.dep());
//        }
//
//        System.out.println("User 2의 아군 유닛:");
//        for (Unit unit : user2.getUnitList()) {
//            System.out.println("Unit: " + unit.name() + " - ATK: " + unit.atk() + ", DEF: " + unit.dep());
//        }
    }


}