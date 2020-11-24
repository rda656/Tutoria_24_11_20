package Prinpcipal;

/**
 *
 * @author rda65
 */
public class CPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Pero pecaríamos de insinceros si soslayasemos que, radica en una elaboración las cuidandolas y sistemática de las estrategias adecuadas de los elementos generadores.";
        int contador = 0, index = 0;
        
        do{
            index = cadena.indexOf(" las", index);
            if(index != -1){
                contador++;
                index++;
            }
        }while(index != -1);
        
        //System.out.println("Hay " + contador + " palabras 'las' \u001b[34m en la frase");
        
        
        // Duda reemplazar texto con otro color
        String textoNuevo = "\u001b[34m patata\u001b[0m";
        String palabraClave = " las";
        System.out.println(cadena.replace(palabraClave, textoNuevo));
        
        
        
        int[] numeros = new int [6];
                        //0  1   2    3 
        int[] numeros2 = {4, 6, 101, -3};
        
        String[] frases = {
            "Queridos compañeros",
            "Por otra parte,y dados los condicionamientos actuales",
            "Asimismo,"
        };
        
        //numeros.length;
        
        //for
          
        int[][] matriz = new int[4][7];
        int[][] matriz2 ={
            {3, 4, 32},
            {0, -9, 2354}            
        };
                
    }
    
    
    /*
    COLORES
    
    Black: \u001b[30m
    Red: \u001b[31m
    Green: \u001b[32m
    Yellow: \u001b[33m
    Blue: \u001b[34m
    Magenta: \u001b[35m
    Cyan: \u001b[36m
    White: \u001b[37m

    Reset: \u001b[0m

    */
    
}
