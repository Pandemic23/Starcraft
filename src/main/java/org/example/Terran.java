package org.example;

class Terran {
    // Terran 종족의 유닛 정보를 정적 멤버 변수로 저장
    public static final Unit[] UNITS = {
            new TerranMarine(),
            new TerranTank(),
            new TerranGoliath()
            , new TerranWraith(),
            new TerranValkyrie()


    };
    public static final int UNIT_COUNT = 5;
}


class TerranMarine extends Terran implements Unit {

    private int dep = 10;

    public String name() {
        return "Marine";
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

class TerranTank extends Terran implements Unit {

    private int dep = 15;

    public String name() {
        return "Tank";
    }

    public int atk() {
        return 7;
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

class TerranGoliath extends Terran implements Unit {

    private int dep = 15;

    public String name() {
        return "Goliath";
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
        return true;
    }
}

class TerranWraith extends Terran implements Unit {
    private int dep = 10;

    public String name() {
        return "Wraith";
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

class TerranValkyrie extends Terran implements Unit {
    private int dep = 12;

    public String name() {
        return "Valkyrie";
    }

    public int atk() {
        return 4;
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

