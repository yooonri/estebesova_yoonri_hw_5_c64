public class Hero {
    public String name;
    public int age;
    private int hp;
    private int damage;
    private String attackType;

    public Hero(String name, int age, String attackType) {
        this.age = age;
        this.name = name;
        this.attackType = attackType;
    }

    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackType() {
        return attackType;
    }
}
