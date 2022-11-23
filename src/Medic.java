public class Medic extends Hero{

    int healPoints=30;
    @Override
    public String applySuperAbility() {
        return("Medic применил SUPER АПТЕЧКУ");
    }

     int increaseExperience(){

        int point=healPoints/10;

        this.healPoints=healPoints+point;

        return healPoints;





    }
}
