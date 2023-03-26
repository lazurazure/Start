package HomeWork_Shieldbook.Ex_8_1;

public class IQDemo {
    static class FixedQueue implements ICharQ {
        private char q[]; // массив для хранения элементов очереди
        private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

        //----------------- Создать пустую очередь заданного размера
        public FixedQueue(int size) {
            q = new char[size + 1]; // выделить память для очереди
            putloc = getloc = 0;
        }

        // ---------------------Поместить символ в очередь
        public void put(char ch) {
            if (putloc == q.length - 1) {
                System.out.println(" - Очередь заполнена");
                return;
            }
            putloc++;
            q[putloc] = ch;
        }

        // ------------------Извлечь символ из очереди
        public char get() {
            if (getloc == putloc) {
                System.out.println(" - Очередь пуста");
                return (char) 0;
            }
            getloc++;
            return q[getloc];
        }
    }

        static class CircularQueue implements ICharQ {

            private char q[]; // массив для хранения элементов очереди
            private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

// ------------Создать пустую очередь заданного размера
            public CircularQueue(int size) {
                q = new char[size + 1]; // выделить память для очереди
                putloc = getloc = 0;
            }
// -------------Поместить символ в очередь
                public void put(char ch) {
/* Очередь считается полной, если индекс putloc на единицу меньше индекса getloc или если индекс putloc указывает
на конец массива, а индекс getloc - на его начало */
                    if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
                        System.out.println(" - Очередь заполнена");
                        return;
                    }
                    putloc++;
                    if (putloc == q.length) putloc = 0;// перейти в начало массива
                    q[putloc] = ch;
                }
// -----------------Извлечь символ из очереди
                        public char get() {
                            if (getloc == putloc) {
                                System.out.println(" - Очередь пуста");
                                return (char) 0;
                            }
                            getloc++;
                            if (getloc == q.length) getloc = 0;// вернуться в начало очереди
                            return q[getloc];
                        }

    }
    //-------------------------- Динамическая очередь
    static class DynQueue implements ICharQ {
        private char q[]; // массив для хранения элементов очереди
        private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

//------------------- Создать пустую очередь заданного размера
        public DynQueue(int size){
        q = new char[size+1]; // выделить память для очереди
        putloc = getloc = 0;
        }
//-------------------- Поместить символ в очередь
        public void put(char ch) {
            if (putloc == q.length - 1) {
                char t[] = new char[q.length * 2];// увеличить размер очереди
                for (int i = 0; i < q.length; i++) // Скопировать элементы в новую очередь
                    t[i] = q[i];
                q = t;
            }
            putloc++;
            q[putloc] = ch;
        }
// ---------------------------Извлечь символ из очереди
                public char get() {
                    if (getloc == putloc) {
                        System.out.println(" - Очередь пуста");
                        return (char) 0;
                    }
                    getloc++;
                    return q[getloc];
        }


    }

    public static void main(String args[]){

        FixedQueue ql = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue qЗ = new CircularQueue(10);
        ICharQ iQ;
        char ch;
        int i;
        iQ = ql;

            for(i = 0; i < 10; i++) //Поместить ряд символов в очередь фиксированного размера
            iQ.put((char) ('А' + i));
            System.out.print("Coдepжимoe фиксированной очереди: ");//Отобразить содержимое очереди

            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
            System.out.println();

            iQ = q2;
            for(i = 0; i < 10; i++)//Поместить ряд символов в динамическую очередь
            iQ.put((char) ('Z' - i));

            System.out.print("Coдepжимoe динамической очереди: ");//Отобразить содержимое очереди

            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
            System.out.println();

            iQ = qЗ;

            for(i = 0; i < 10; i++)//Поместить ряд символов в кольцевую очередь
                iQ.put((char) ('А' + i));
            System.out.print("Coдepжимoe кольцевой очереди: ");// Отобразить содержимое очереди
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
                System.out.println();

                for(i = 10; i < 20; i++) // Поместить больше символов в кольцевую очередь
                    iQ.put((char) ('А' + i));

                System.out.print("Coдepжимoe кольцевой очереди: "); // Отобразить содержимое очереди
                for (i = 0; i < 10; i++) {
                    ch = iQ.get();
                    System.out.print(ch);
                }
                    System.out.println("\nCoxpaнeниe и использование данных" + " кольцевой очереди");


                    for (i = 0; i < 20; i++) { // Поместить символы в кольцевую очередь и извлечь их оттуда
                        iQ.put((char) ('А' + i));
                        ch = iQ.get();
                        System.out.print(ch);
                    }
    }

}



