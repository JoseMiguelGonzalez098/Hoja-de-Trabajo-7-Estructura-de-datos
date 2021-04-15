import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import org.junit.jupiter.api.Test;

class Ejercicio7PruebaJUnit {

	@Test
	void testEsp() {
		
		String ID = "0";
        int IDc = 0;
        ArbolBinarioBusqueda<String, PalabraDiccio> arbol;
		arbol = new ArbolBinarioBusqueda<String, PalabraDiccio>(new ComparadorPalabra<String, PalabraDiccio>(), new GetKey<String, PalabraDiccio>());

        String[] values = new String[30];

        try {
            File miArchivo = new File("datos.txt");
            Scanner myReader = new Scanner(miArchivo);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                values = line.split(",");
                arbol.Insert(values[0], new PalabraDiccio(
                        ID
                        , values[0]
                        , values[1]
                        ,(values[2])
                    )
                );
                IDc++;
                ID = IDc + "";
            }
        }catch(Exception E){

            System.out.println("No se pudo encontrar el archivo revisa el nombre o la exitencia de este.");

        }
        
        String aa = "woman";
        PalabraDiccio respuestaRo = arbol.Find(aa, new ListarPalabra(), arbol._raiz);
        System.out.println("respuesta = " + respuestaRo.es);
        assertEquals(respuestaRo.en,"mujer");
		
	}
	@Test
	void testFr() {
		
		String ID = "0";
        int IDc = 0;
        ArbolBinarioBusqueda<String, PalabraDiccio> arbol;
		arbol = new ArbolBinarioBusqueda<String, PalabraDiccio>(new ComparadorPalabra<String, PalabraDiccio>(), new GetKey<String, PalabraDiccio>());

        String[] values = new String[30];

        try {
            File miArchivo = new File("datos.txt");
            Scanner myReader = new Scanner(miArchivo);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                values = line.split(",");
                arbol.Insert(values[0], new PalabraDiccio(
                        ID
                        , values[0]
                        , values[1]
                        ,(values[2])
                    )
                );
                IDc++;
                ID = IDc + "";
            }
        }catch(Exception E){

            System.out.println("No se pudo encontrar el archivo revisa el nombre o la exitencia de este.");

        }
        
        String aa = "town";
        PalabraDiccio respuestaRo = arbol.Find(aa, new ListarPalabra(), arbol._raiz);
        System.out.println("respuesta = " + respuestaRo.fr);
        
        assertEquals(respuestaRo.fr,"ville");
		
	}

}
