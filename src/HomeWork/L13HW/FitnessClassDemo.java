package HomeWork.L13HW;

public class FitnessClassDemo {
    public static void main(String[] args) {

        FitnessClub firstFitnessClub = new FitnessClub();
        firstFitnessClub.setNameFitnessClub("First FitnessClub");

        System.out.println(firstFitnessClub.getNameFitnessClub());

        System.out.println(firstFitnessClub.getCurrentClient());

        firstFitnessClub.setCurrentClient(20);
        System.out.println(firstFitnessClub.getCurrentClient());

        firstFitnessClub.setCurrentClient(9);
        System.out.println(firstFitnessClub.getCurrentClient());
    }


}
