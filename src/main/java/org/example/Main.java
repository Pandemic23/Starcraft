package org.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // 적군 생성
        Com ai = new Com();
        ai.selectRace();
        ai.createAndAddUnits();
        System.out.println("적군:\t" + ai.getSelectedRace());
        ai.printUnitList();

        //아군 생성
        String selectedRace = JOptionPane.showInputDialog("당신의 종족은?(Terran/Protos/Zerg)");
        User user1 = new User();
        user1.chooseRace(selectedRace);
        user1.createAndAddUnits();
        System.out.println("아군:\t" + user1.getSelectedRace());
        user1.printUnitList();
        //전장 생성
        BattleField battleField =
                new BattleField(user1.getUnitList(), user1.getUnitDepList(), ai.getUnitList(), ai.getUnitDepList());
        // 게임 시작
        while (user1.getUnitListlength() > 0 && ai.getUnitListlength() > 0) {
            battleField.userAttack(ai);
            System.out.println("적군:\t" + ai.getSelectedRace());
            ai.printUnitList();
            System.out.println("적군의 공격");
            battleField.comAttack(user1);
            System.out.println("아군:\t" + user1.getSelectedRace());
            user1.printUnitList();
        }
        //승부 결과
        if (user1.getUnitListlength() > ai.getUnitListlength()) {
            System.out.println("아군:\t" + user1.getSelectedRace());
            user1.printUnitList();
            System.out.println("Victory!!");
        } else if (user1.getUnitListlength() == ai.getUnitListlength()) {
            System.out.println("Draw..");
        } else {
            System.out.println("적군:\t" + ai.getSelectedRace());
            ai.printUnitList();
            System.out.println("Fail...");
        }

    }


}