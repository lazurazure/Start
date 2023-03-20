package lesson11;

public class Block {

//    int a, b, c;первоначальная запись
    int length, width, height;
    int volume;

    Block (int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
        volume = length + width + height;
    }

//    Block (int a, int b, int c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        volume = a + b + c;
//    }

//    Block (int i, int j, int k){ первоначальная запись
//        a = i;
//        b = j;
//        c = k;
//        volume = a + b + c;
//    }

    boolean sameBlock (Block ob){
        if ((ob.length == length) & (ob.width == width) & (ob.height == height)) return true;
        else return false;
    }

    boolean sameVolume (Block ob){
        if (ob.volume == volume) return true;
        else return false;
    }

}
