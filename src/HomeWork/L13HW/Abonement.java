package HomeWork.L13HW;

abstract class Abonement{
    private int numberOfAbonementDays;
    private int pricePerDay;
    private String packageName;

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    Abonement(){

    }
    public String getPackageName(){
        return packageName;
    }

    public int baseTotalPrice(){
       return this.pricePerDay * this.numberOfAbonementDays;
    }

    public void showTotalPrice(){
        System.out.println("Стоимость вашего абонемента: " + baseTotalPrice());
    }

    void showPackageVariables(){
        System.out.println("У вас пакет: " + this.packageName + "\nколичество дней посещений: " + this.numberOfAbonementDays + "\nцена за 1 тренировку: " + this.pricePerDay);

    }

    public int getNumberOfAbonementDays() {
        return numberOfAbonementDays;
    }

    public void setNumberOfAbonementDays(int numberOfAbonementDays) {
        this.numberOfAbonementDays = numberOfAbonementDays;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
