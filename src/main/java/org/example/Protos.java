package org.example;

class Protos {
    // Protos 종족의 유닛 정보를 정적 멤버 변수로 저장
    public static final Unit[] UNITS = {
            new ProtosZealot(),
            new ProtosDragoon(),
            new ProtosHighTempler(),
            new ProtosScout(),
            new ProtosCorsair()
    };
    public static final int UNIT_COUNT = 4;
}

class ProtosZealot extends Protos implements Unit {

    private int dep = 20;

    public String name() {
        return "Zealot";
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

class ProtosDragoon extends Protos implements Unit {
    private int dep = 15;

    public String name() {
        return "Dragoon";
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

class ProtosHighTempler extends Protos implements Unit {

    private int dep = 2;

    public String name() {
        return "HighTempler";
    }

    public int atk() {
        return 10;
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

class ProtosScout extends Protos implements Unit {

    private int dep = 10;

    public String name() {
        return "Scout";
    }

    public int atk() {
        return 5;
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

class ProtosCorsair extends Protos implements Unit {

    private int dep = 12;

    public String name() {
        return "Corsair";
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
