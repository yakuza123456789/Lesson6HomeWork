package com.company.General;

import com.company.Objects.Boss;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(800);
        boss.setBossDamage(250);
        boss.setWeapon("Steel Arms","Claymore");

        System.out.println(boss.info());

    }
}
