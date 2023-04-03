package HomeWork.L4HW;

import java.io.IOException;

public class L4HW_HelpClassDemo_4_1 {
    public static void main(String[] args) throws IOException {

        char choice, ignore;

        L4HW_Help hlpobj = new L4HW_Help();
        for (;;) {
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choice)) ;
                if (choice == 'q') break;
                System.out.println("\n");
                hlpobj.helpon(choice);
            }
        }
    }

