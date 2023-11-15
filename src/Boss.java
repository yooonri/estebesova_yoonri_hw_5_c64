public class Boss {
    private int level;
    private int hp;
    private int damage;
    private String defenseType;

    public  int getLevel() {
        return level;
    }

    public int setLevel(int level) {
        this.level = level;
        return level;
    }
    public String getDefenseType(String s) {
        return defenseType;
    }
    public String setDeffenseType(String defenseType) {
        this.defenseType = defenseType;
        return defenseType;
    }
    public int setDamage(int damage) {
        this.damage = damage;
        return damage;
    }
    public  int getDamage() {
        return damage;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
