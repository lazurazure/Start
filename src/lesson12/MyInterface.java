package lesson12;

public interface MyInterface {
    int getUserID();
    default int getAdmin(){ //поведение опеределено ( return 1) его имплиментирование - переопределение опционально
        return 1;
    }
    static int getUniversalID(){
        return 0;
    }
}
