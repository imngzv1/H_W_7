public class Main {
    public static void main(String[] args) {
        Medic medic=new Medic();
        Magic magic=new Magic();
        Warrior warrior=new Warrior();

        Hero[] heroes={new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < heroes.length ; i++) {
            System.out.println(heroes[i].applySuperAbility());
            if(heroes[i] instanceof Medic){

                ((Medic) heroes[i]).increaseExperience();
                heroes[i].applySuperAbility();
                System.out.println("+ "+medic.increaseExperience());

            }

        }

    }
}