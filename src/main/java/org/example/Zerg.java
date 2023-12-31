package org.example;

class Zerg {
    // Zerg 종족의 유닛 정보를 정적 멤버 변수로 저장
    public static final Unit[] UNITS = {
            new ZergZergling(),
            new ZergHydralisk(),
            new ZergUltralisk(),
            new ZergMutalisk(),
            new ZergGuardian()
    };
    public static final int UNIT_COUNT = 8;
}

class ZergZergling extends Zerg implements Unit {

    private int dep = 2;

    public String name() {
        return "Zergling";
    }

    public int atk() {
        return 2;
    }

    public int dep() {
        return dep;
    }


    public boolean fly() {
        return false;
    }

    public boolean flyatk() {
        return false;
    }
}

class ZergHydralisk extends Zerg implements Unit {

    private int dep = 7;

    public String name() {
        return "Hydralisk";
    }

    public int atk() {
        return 3;
    }

    public int dep() {
        return dep;
    }


    public boolean fly() {
        return false;
    }

    public boolean flyatk() {
        return true;
    }
}

class ZergUltralisk extends Zerg implements Unit {

    private int dep = 15;

    public String name() {
        return "Ultralisk";
    }

    public int atk() {
        return 5;
    }

    public int dep() {
        return dep;
    }


    public boolean fly() {
        return false;
    }

    public boolean flyatk() {
        return false;
    }
}

class ZergMutalisk extends Zerg implements Unit {

    private int dep = 8;

    public String name() {
        return "Mutalisk";
    }

    public int atk() {
        return 2;
    }

    public int dep() {
        return dep;
    }


    public boolean fly() {
        return true;
    }

    public boolean flyatk() {
        return true;
    }
}

class ZergGuardian extends Zerg implements Unit {

    private int dep = 6;

    public String name() {
        return "Guardian";
    }

    public int atk() {
        return 3;
    }

    public int dep() {
        return dep;
    }


    public boolean fly() {
        return true;
    }

    public boolean flyatk() {
        return true;
    }


}
