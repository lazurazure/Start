package HomeWork.L11HW;

public class Abonement {
    private int currentDays = 0;
    private int maxDays = 30;

    public void setCurrentDays(int currentDays) {
        this.currentDays = currentDays;
    }
    public int getCurrentDays() {
        return currentDays;
    }


    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }
    public int getMaxDays() {
        return maxDays;
    }

    public int checkAbonementDays(){
        return getMaxDays() - getCurrentDays();
    }


}
