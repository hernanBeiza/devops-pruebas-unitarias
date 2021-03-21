package cl.hiperactivo;

public class NumerosRomanos {
 
    public static String numToRomano(int numero){
        System.out.println("numToRomano");
        String[] numeros = String.valueOf(numero).split("");
        /*
        for (String numeroString : numeros) {
            System.out.println(numeroString);
        }
        */
        String resultado = "";
        //0-11
        //Estudiar casos de borde, 50
        //100-999
        //Estudiar casos de borde, 1000
        if(numero<11){
            resultado = obtenerUnidad(numero);
        } else if(numero>10 && numero<100){
            resultado = obtenerDecena(Integer.valueOf(numeros[1]))+obtenerUnidad(Integer.valueOf(numeros[0]));
        }
        System.out.println(resultado);
        return resultado;
    }

    public static String obtenerUnidad(int numero){        
        String resultado = "";
        switch(numero){
            case 1:
                resultado = "I";
            break;
            case 2:
                resultado = "II";
            break;
            case 3:
                resultado = "III";
            break;
            case 4:
                resultado = "IV";
            break;
            case 5:
                resultado = "V";
            break;
            case 6:
                resultado = "VI";
            break;
            case 7:
                resultado = "VII";
            break;
            case 8:
                resultado = "VIII";
            break;
            case 9:
                resultado = "IX";
            break;
            case 10:
                resultado = "X";
            break; 
        }
        return resultado;
    }

    public static String obtenerDecena(int numero){        
        String resultado = "";
        switch(numero){
            case 1:
                resultado = "X";
            break;
            case 2:
                resultado = "XX";
            break;
            case 3:
                resultado = "XL";
            break;
            case 4:
                resultado = "XL";
            break;
            case 5:
                resultado = "L";
            break;
            case 6:
                resultado = "LX";
            break;
            case 7:
                resultado = "LXX";
            break;
            case 8:
                resultado = "LXXX";
            break;
            case 9:
                resultado = "XC";
            break;
            case 10:
                resultado = "C";
            break; 
        }
        return resultado;
    }

}
