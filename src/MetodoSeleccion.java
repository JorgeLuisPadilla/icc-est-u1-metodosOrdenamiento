public class MetodoSeleccion {

    public void sort(int[] arr) {
        int tam = arr.length;
        for (int i = 0; i < tam - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tam; j++) { // CORREGIDO
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (i != indiceMenor) {
                int aux = arr[i];
                arr[i] = arr[indiceMenor];
                arr[indiceMenor] = aux;
            }
        }
    }

    public void sortDescendente(int[] arr) {
        int tam = arr.length;
        for (int i = 0; i < tam - 1; i++) {
            int indiceMayor = i;

            for (int j = i + 1; j < tam; j++) { // CORREGIDO
                if (arr[j] > arr[indiceMayor]) {
                    indiceMayor = j;
                }
            }

            if (i != indiceMayor) {
                int aux = arr[i];
                arr[i] = arr[indiceMayor];
                arr[indiceMayor] = aux;
            }
        }
    }
    public void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}