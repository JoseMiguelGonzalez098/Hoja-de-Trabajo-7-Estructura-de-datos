import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class main {
    
    public static void main (String [] args){

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

        System.out.println("\nListado del diccionario");
        
        System.out.println("***********************************");
        arbol.InOrder(new ListarPalabra<>(), arbol._raiz);
        System.out.println("***********************************\n\n\n");

        /*
        String aa = "woman";
        PalabraDiccio respuestaRo = arbol.Find(aa, new ListarPalabra(), arbol._raiz);
        System.out.println("este es el resultado " + respuestaRo.en);*/
        
        System.out.println("\nOracion traducida.");
        
        System.out.println("***********************************");
        
        String[] vala = new String[100];
        int contador = 0;
        try {
            File miArchivo = new File("texto.txt");
            Scanner myReader = new Scanner(miArchivo);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                vala = line.split(" ");
                contador++;
                
            }
        }catch(Exception E){

            System.out.println("No se pudo encontrar el archivo revisa el nombre o la exitencia de este.");

        }
        String[] val = vala;

        ArrayList<PalabraDiccio> pal = new ArrayList<PalabraDiccio>();
        
        for (String a : val){

            PalabraDiccio respuestaR = arbol.Find(a, new ListarPalabra(), arbol._raiz);
            //System.out.println(a);
            //System.out.println(respuestaR);
            if(respuestaR == null){

                System.out.print(" '" + a + "' ");
            }else{
                System.out.print(" " + respuestaR.en + " ");
            }
            pal.add(respuestaR);

        }
        System.out.println("\n***********************************\n\n\n");
    }
}
