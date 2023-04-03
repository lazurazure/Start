package HomeWork.L13HW;

public class Instructors_1 extends Instructors implements InstructorsMethods{

    //int [] hourWork = {8, 12, 13, 17, 18};
    Instructors_1(){
        this.setFirstName("Grigoriy");
        this.setLastName("Melnic");
        this.setSpeciality("Aerobica");
        super.workHours = new boolean []{
                false, false, false, false, false, false, false,
                false, true, false, true, false, false, false,
                false, true, true, false, false, false, false,
                false, false, false, false, false, false, false
        };
    }
    @Override
    public String MethodName() {
        return "Stretching";
    }
}
