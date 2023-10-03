package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BattleField {
    private List<Unit> userUnits;
    private List<Integer> userdepList;
    private List<Unit> comUnits;
    private List<Integer> comdepList;

    public BattleField(List<Unit> userUnits, List<Integer> unitdepList, List<Unit> comUnits,
                       List<Integer> comdepList) {
        this.userUnits = userUnits;
        this.comUnits = comUnits;
        this.userdepList = unitdepList;
        this.comdepList = comdepList;
    }

    public void userAttack(Com com) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        if (userUnits.isEmpty()) {
            System.out.println("아군 유닛이 모두 파괴되었습니다.");
            return;
        }

        System.out.println("아군 유닛을 선택하세요:");
        int userUnitIndex = 1;
        for (Unit unit : userUnits) {
            System.out.println(userUnitIndex + ". " + unit.name());
            userUnitIndex++;
        }

        int selectedUserUnitIndex = sc.nextInt();
        if (selectedUserUnitIndex < 1 || selectedUserUnitIndex > userUnits.size()) {
            System.out.println("유효하지 않은 선택입니다.");
            return;
        }

        Unit userUnit = userUnits.get(selectedUserUnitIndex - 1);

        System.out.println("적군 유닛을 선택하세요:");
        int comUnitIndex = 1;
        for (Unit unit : comUnits) {
            System.out.println(comUnitIndex + ". " + unit.name());
            comUnitIndex++;
        }

        int selectedComUnitIndex = sc.nextInt();
        if (selectedComUnitIndex < 1 || selectedComUnitIndex > comUnits.size()) {
            System.out.println("유효하지 않은 선택입니다.");
            return;
        }

        Unit comUnit = comUnits.get(selectedComUnitIndex - 1);


        if (comUnit.fly() && !userUnit.flyatk()) {
            System.out.println(userUnit.name() + "은(는) " + comUnit.name() + "을(를) 공격할 수 없습니다.");
        } else {
            comdepList.set(selectedComUnitIndex - 1, comUnit.dep() - userUnit.atk());
            if (comdepList.get(selectedComUnitIndex - 1) <= 0) {
                comUnits.remove(comUnit);
                comdepList.remove(selectedComUnitIndex - 1);
                System.out.println(comUnit.name() + "이(가) 파괴되었습니다.");
            } else {
                System.out.println(
                        userUnit.name() + "이(가) " + comUnit.name() + "에게 " + userUnit.atk() + "의 데미지를 입혔습니다.");
            }
        }
    }

    public void comAttack(User user) {
        Random random = new Random();
        if (comUnits.isEmpty()) {
            System.out.println("적군 유닛이 모두 파괴되었습니다.");
            return;
        }

        int randomindex = random.nextInt(userUnits.size());
        Unit comUnit = comUnits.get(random.nextInt(comUnits.size()));
        Unit userUnit = userUnits.get(randomindex);

        if (userUnit.fly() && !comUnit.flyatk()) {
            System.out.println(comUnit.name() + "은(는) " + userUnit.name() + "을(를) 공격할 수 없습니다.");
        } else {
            userdepList.set(randomindex, userUnit.dep() - comUnit.atk());
            if (userdepList.get(randomindex) <= 0) {
                comUnits.remove(userUnit);
                comdepList.remove(randomindex);
                System.out.println(comUnit.name() + "이(가) 파괴되었습니다.");
            } else {
                System.out.println(
                        comUnit.name() + "이(가) " + userUnit.name() + "에게 " + comUnit.atk() + "의 데미지를 입혔습니다.");
            }
        }
    }
}
