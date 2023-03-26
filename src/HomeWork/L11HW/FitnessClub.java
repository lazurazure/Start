package HomeWork.L11HW;

public class FitnessClub {

    // Создайте класс FitnessClub, дополните методами и полями по Вашему усмотрению(например,
    // название, максимальное число клиентов, текущее число клиентов, адрес и т.д., методы: геттеры,
    // сеттеры для полей, проверка того, можно ли записать определенное количество клиентов).

    private String nameFitnessClub = new String("Name FitnessClub");
    private int currentClient = 0;
    private int maxClient = 10;

    public int getCurrentClient() {
        return currentClient;
    }

    public void setCurrentClient(int client) {
        if (client <= this.getMaxClient()) {
            this.currentClient = client;
        }
    }

    public int getMaxClient() {
        return maxClient;
    }

    public String getNameFitnessClub() {
        return nameFitnessClub;
    }
    public void setNameFitnessClub(String nameFitnessClub) {
        this.nameFitnessClub = nameFitnessClub;
    }



//    public String getNameFitnessClub (){
//        return this.nameFitnessClub;
//    }
//
//    public void setNameFitnessClub (String newName){
//        this.nameFitnessClub = newName;
//    }
//


}
