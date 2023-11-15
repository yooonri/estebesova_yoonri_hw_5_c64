public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println(boss);
boss.setLevel(15);
boss.setHp(150);
boss.setDamage(25);
boss.setDeffenseType("Magical.");

        System.out.println("Boss level: " + boss.getLevel() + " Hp: " + boss.getHp() +
                " Damage: " + boss.getDamage() + " Deffense type : " + boss.setDeffenseType("Magical"));

    }
}