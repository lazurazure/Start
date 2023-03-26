package HomeWork.L11HW;

public class AbonementDemo {
    public static void main(String[] args) {

       Abonement myAbonement = new Abonement();

       for(int i = 0; i <= myAbonement.getMaxDays(); i++){

           myAbonement.setCurrentDays(i);
           System.out.println("Номер посещения: " + myAbonement.getCurrentDays());

           System.out.println("Сколько посещений осталось: " + myAbonement.checkAbonementDays());
           System.out.println("********************");
       }
    }

}
