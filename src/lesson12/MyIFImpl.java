package lesson12;

public class MyIFImpl implements MyInterface{
    @Override
    public int getUserID() {
        return 100;
    }

    @Override
    public int getAdmin() { //поведение опеределено (return 1 в классе MyInterface) его имплиментирование - переопределение опционально
        return MyInterface.super.getAdmin();//шаблон можно дополнить, если поведение не меняется, то его можно убрать
    }
}
