package HomeWork.L13HW;

abstract class Instructors implements InstructorsMethods{
    String firstName;
    String lastName;
    String speciality;
     boolean [] workHours = {
        false, false, false, false, false, false, false,
        false, false, false, false, false, false, false,
        false, false, false, false, false, false, false,
        false, false, false, false, false, false, false
     };

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    void showInstructorsDatas(){
        System.out.println("Имя инструктора: " + this.firstName + "\nФамилия инструктора: " + this.lastName + "\nСпециальность: " + this.speciality + "\nИспользуемая методика: " + this.MethodName());
    }

    public void workTime(){

    }

    public boolean isWorkHour(int clientHour) {

        return workHours[clientHour];
    }

}