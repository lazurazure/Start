package HomeWork_Shieldbook.Ex_5_2;

public class Queue {
        char q[]; // массив для хранения элементов очереди
        int putloc, getloc; // индексы для вставки и извлечения элементов очереди

        Queue(int size) {
            q = new char[size + 1]; // выделить память для очереди
            putloc = getloc = 0;
        }

        // Поместить символ в очередь
        void put(char ch) {
            if (putloc == q.length - 1) {
                System.out.println(" - Очередь заполнена");
                return;
            }
            putloc++;
            q[putloc] = ch;
        }

        // Извлечь символ из очереди
        char get() {
            if (getloc == putloc) {
                System.out.println(" - Очередь пуста");
                return (char) 0;
            }
            getloc++;
            return q[getloc];
        }
}

