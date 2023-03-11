package lesson8;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] table1 = new int[3][]; //- двумерный массив, каждый внутренний lines разделен на свое кол-во ячеек, поэтому вторые [] указывают пустыми
        table1[0] = new int[5];
        table1[1] = new int[8];
        table1[2] = new int[2];

        int lines = 3;
        int columns = 4;

        int table[][] = new int[lines][columns];
        int min = -100;
        int max = 100;


//        for(int t = 0; t < lines; t++){ перенесли эту часть в ArrayUtils
//            for (int i = 0; i < columns; i++){
//                table[t][i] = (int) (Math.random() * (max - min) + min);
//            }
//        }
        table = ArrayUtils.randomArray(table, min, max);
        ArrayUtils.showArray(table);
        System.out.println();
//        for(int t = 0; t < lines; t++) { - перенесли эту часть в ArrayUtils
//            for (int i = 0; i < columns; i++) {
//                System.out.println("array element[" + t + "][" + i + "] = " + table[t][i] + "\t");
//            }
//        }
//            System.out.println();
    }
    }

