import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // runBurbuja();
        runMetodoBurbujaAvanzado();

    }
    
    public static void runMetodoBurbujaAvanzado() {
        int[] arreglo = {50, 5, 20, 30, 0, -10, 15};
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        System.out.println(Arrays.toString(arreglo));
        mBurbujaAvanzado.sort(true);
        System.out.println(Arrays.toString(arreglo));
        mBurbujaAvanzado.sort(false);
        System.out.println(Arrays.toString(arreglo));
    }
}
