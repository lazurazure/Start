package HomeWork.L11HW;

public class ScheduleDemo {
    public static void main(String[] args) {

        Schedule mySchedule = new Schedule();

        for(int i = 0; i <= 24; i++){
            System.out.println("Текущий час: " + i);
            System.out.println("Рабочее время: " + mySchedule.checkWorkHour(i));
        }

    }
}
