
package copycaracteres;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copycaracteres {

    public static void main(String[] args) throws IOException {
//         exercicio 9
//  copycaracteres
// copia o contido dun ficheiro de texto  denominado  texto10.txt noutro denominado texto11.txt.
        //archivo de lectura
     FileReader fichero = new FileReader("/home/oracle/Desktop/Eje9/texto10.txt");
     //srchivo de escritura
        FileWriter fichero1 = new FileWriter("/home/oracle/Desktop/Eje9/texto11.txt");
//variable para indicar el final de una lina
        int letra = 0;
//si la variable es distinta de -1(loq ue retorna)
        //si leyendo y escribiendo
        while (letra != -1) {

            letra = fichero.read();

            fichero1.write(letra);

        }

        fichero.close();
        fichero1.close();

    }

}
    
    
    
    

