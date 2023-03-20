package HomeWork.L11HW;

import lesson11.MyClass;

public class FitnessClassDemo {
    public static void main(String[] args) {

        FitnessClub oneFitnessClub = new FitnessClub();

        //FitnessClub twoFitnessClub = new FitnessClub();

        //System.out.println(myFitnessClub.getNameFitnessClub());
        System.out.println(oneFitnessClub.publicNameFitnessClub);

        System.out.println(oneFitnessClub.getNameFitnessClub());

        oneFitnessClub.setNameFitnessClub("123");

        System.out.println(oneFitnessClub.getNameFitnessClub());
    }
}
