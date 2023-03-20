package HomeWork.L11HW;

public class FitnessClub {

    // Создайте класс FitnessClub, дополните методами и полями по Вашему усмотрению(например,
    // название, максимальное число клиентов, текущее число клиентов, адрес и т.д., методы: геттеры,
    // сеттеры для полей, проверка того, можно ли записать определенное количество клиентов).

    public String publicNameFitnessClub = new String("My public FitnessClub");

    private String nameFitnessClub = new String("My private FitnessClub");

    public String getNameFitnessClub (){
        return this.nameFitnessClub;
    }

    public void setNameFitnessClub (String newName){
        this.nameFitnessClub = newName;
    }
}
