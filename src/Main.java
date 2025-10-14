import com.gabriel.algoritmos.BubbleSort;
import com.gabriel.algoritmos.InsertionSort;
import com.gabriel.algoritmos.SelectionSort;
import com.gabriel.orden.Final;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        final int[] ARR = {1, 5, 7, 10, 2, 4, 8, 13, 9, 3};
        Final f = new Final();
        BubbleSort bs = new BubbleSort(ARR, f);
        SelectionSort ss = new SelectionSort(ARR, f);
        InsertionSort is = new InsertionSort(ARR, f);

        bs.start();
        ss.start();
        is.start();

        bs.join();
        ss.join();
        is.join();

        f.show();


    }
}