public class MetodoBurbujaAvanzado {
int[] arreglo;

public MetodoBurbujaAvanzado(int[] arreglo) {
    this.arreglo = arreglo;
}

public void sort(boolean asc) {
    int tam = arreglo.length;
    int contComparaciones = 0;
    int contCambios = 0;
    boolean huboIntercambios;

    for (int i = 0; i < tam - 1; i++) {
        huboIntercambios = false;

        for (int j = 0; j < tam - 1; j++) {
            contComparaciones++;
            if (asc) {
                // Orden ascendente
                if (arreglo[j] > arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    huboIntercambios = true;
                }
            } else {
                // Orden descendente
                if (arreglo[j] < arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    huboIntercambios = true;
                    }
                }
            }
            if (!huboIntercambios) {
            break;
            }
        }    
        System.out.println("Comparaciones: " + contComparaciones);
        System.out.println("Cambios: " + contCambios);
    }
}    