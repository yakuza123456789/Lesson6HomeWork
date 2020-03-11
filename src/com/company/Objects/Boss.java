package com.company.Objects;

public class Boss extends GameEntity {
    private Weapon weapon = new Weapon();

    public String getWeapon() {
        return weapon.getTypeWeapon() + " " + weapon.getNameWeapon();
    }

    public void setWeapon(String typeWeapon, String nameWeapon) {
        weapon.setTypeWeapon(typeWeapon);
        weapon.setNameWeapon(nameWeapon);
    }

    public String info() {
        return getBossHealth() + " " + getBossDamage() + " " + getWeapon();
    }
}
