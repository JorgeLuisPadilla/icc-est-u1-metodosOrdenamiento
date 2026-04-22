import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        metodoBurbuja();
        runSeleccion();
    }

    public static void runSeleccion() {
        MetodoSeleccion mSeleccion = new MetodoSeleccion();
        int[] arr = new int[]{1, 10, 7, 9, 0, 1, 3, 4};
        mSeleccion.imprimirArreglo(arr);
        mSeleccion.sort(arr);
        mSeleccion.imprimirArreglo(arr);
        mSeleccion.sortDescendente(arr);
        mSeleccion.imprimirArreglo(arr);
    }

    public static void metodoBurbuja() {
        System.out.println("Método burbuja");
        int[] arreglo = new int[]{10, -5, 0, 2, 7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();

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
