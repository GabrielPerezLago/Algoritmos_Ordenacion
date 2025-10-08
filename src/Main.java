import com.gabriel.algoritmos.Algoritmos;
import com.gabriel.algoritmos.BubbleSort;
import com.gabriel.algoritmos.InsertionSort;
import com.gabriel.algoritmos.SelectionSort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int[] ARR = {1, 5, 7, 10, 2, 4, 8, 13, 9, 3};

        BubbleSort bs = new BubbleSort(ARR);
        SelectionSort ss = new SelectionSort(ARR);
        InsertionSort is = new InsertionSort(ARR);

        bs.run();
        ss.run();
        is.run();
    }
}