
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Creamos todos los arboles con sus respectivos nodos
        TArbolBB casoA = new TArbolBB();
        casoA.insertar(new TElementoAB("BEGIN", null));
        casoA.insertar(new TElementoAB("END", null));
        casoA.insertar(new TElementoAB("IF", null));

        TArbolBB casoB = new TArbolBB();
        casoB.insertar(new TElementoAB("BEGIN", null));
        casoB.insertar(new TElementoAB("IF", null));
        casoB.insertar(new TElementoAB("END", null));

        TArbolBB casoC = new TArbolBB();
        casoC.insertar(new TElementoAB("END", null));
        casoC.insertar(new TElementoAB("BEGIN", null));
        casoC.insertar(new TElementoAB("IF", null));

        TArbolBB casoD = new TArbolBB();
        casoD.insertar(new TElementoAB("IF", null));
        casoD.insertar(new TElementoAB("BEGIN", null));
        casoD.insertar(new TElementoAB("END", null));

        TArbolBB casoE = new TArbolBB();
        casoE.insertar(new TElementoAB("IF", null));
        casoE.insertar(new TElementoAB("END", null));
        casoE.insertar(new TElementoAB("BEGIN", null));

        // Creamos las listas con las frecuencias de busqueda
        int[] FrecExito = new int[4];
        FrecExito[1] = 2;
        FrecExito[2] = 4;
        FrecExito[3] = 3;

        int[] FrecNoExito = {6, 4, 2, 4};

        // Calculamos los costos de todos los arboles
        long costoCasoA = casoA.calcularCosto(FrecExito, FrecNoExito);
        long costoCasoB = casoB.calcularCosto(FrecExito, FrecNoExito);
        long costoCasoC = casoC.calcularCosto(FrecExito, FrecNoExito);
        long costoCasoD = casoD.calcularCosto(FrecExito, FrecNoExito);
        long costoCasoE = casoE.calcularCosto(FrecExito, FrecNoExito);
        
        System.out.println("Los costos calculados previamente para cada arbol son: ");
        System.out.println("Costo del caso A: 67");
        System.out.println("Costo del caso B: 68");
        System.out.println("Costo del caso C: 62");
        System.out.println("Costo del caso D: 69");
        System.out.println("Costo del caso E: 71");
        System.out.println("----------------------------------------");
        
        System.out.println("Costos de los arboles calculados son:");
        System.out.println("Costo del caso A: " + costoCasoA);
        System.out.println("Costo del caso B: " + costoCasoB);
        System.out.println("Costo del caso C: " + costoCasoC);
        System.out.println("Costo del caso D: " + costoCasoD);
        System.out.println("Costo del caso E: " + costoCasoE);
    }
}
