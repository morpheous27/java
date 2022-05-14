package ConstructorTest;

import java.util.ArrayList;
import java.util.List;

/**
 * NNHHHH
 */
public class IHSTest {
    public static void main(String[] args) {
        String input = "NNHHHH";
        int ch = 0, cn = 0;
        for(char c : input.toCharArray()){
            if(c == 'N')
                cn++;
            else
                ch++;
        }

        /*Input input1 = new Input(input);
        Thread printH = new Thread(new MyRunnableForH(ch,input1));
        Thread printN = new Thread(new MyRunnableForN(cn,input1));
        printN.start();
        printH.start();*/
        Integer[] ia = new Integer[3];
        ia[0] = 1;
        ArrayList<Integer[]> lis = new ArrayList<>();
        lis.add(new Integer[]{1,2});
        int[][] r = lis.toArray(new int[2][]);



    }
}


class MyRunnableForH implements Runnable {

    int count;
    Input input;

    MyRunnableForH(int count, Input input) {
        this.count = count;
        this.input = input;
    }

    @Override
    public void run() {
        synchronized (input) {
            while (count > 0) {
                while (!input.printH) {
                    try {
                        input.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print("H");
                count--;

                if (count % 2 == 0) {
                    input.printH = false;
                    input.notifyAll();
                }
            }
        }

    }
}


class MyRunnableForN implements Runnable {

    int count;
    Input input;

    MyRunnableForN(int count, Input input) {
        this.count = count;
        this.input = input;
    }

    @Override
    public void run() {
        synchronized (input) {
            while (count > 0) {
                while (input.printH) {
                    try {
                        input.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print("N");
                count--;
                input.printH = true;
                input.notifyAll();
            }
        }
    }
}


class Input {
    String str;
    boolean printH = false;

    Input(String str) {
        this.str = str;
    }
}