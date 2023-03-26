package HomeWork.L11HW;

public class Schedule {
    private int startHour = 9;
    private int endHour = 18;


    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public boolean checkWorkHour(int currentHour){
        if(currentHour >= getStartHour() & currentHour <= getEndHour()){
            return true;
        } else {
            return false;
        }
    }
}
