public class Medic extends Hero{
    private double healPoints;

    public void increaseExperience(){
        healPoints = healPoints * (1.1);
        System.out.println("медик вылечил");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Вылечил героев");

    }
}
