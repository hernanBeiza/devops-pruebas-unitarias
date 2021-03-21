package cl.hiperactivo;

public class NumerosRomanos {
 
    public static String numToRomano(int numero){
        //System.out.println("numToRomano");
        String[] numeros = String.valueOf(numero).split("");
        /*
        for (String numeroString : numeros) {
            System.out.println(numeroString);
        }
        */        
        String resultado = "";
        if(numero<11){            
            resultado = obtenerUnidad(numero);
        } else if(numero>10 && numero<100){
            resultado = obtenerDecena(Integer.valueOf(numeros[0]))+obtenerUnidad(Integer.valueOf(numeros[1]));
        } else if (numero>=100 && numero<1000){
            resultado = obtenerCentena(Integer.valueOf(numeros[0]))+obtenerDecena(Integer.valueOf(numeros[1]))+obtenerUnidad(Integer.valueOf(numeros[2]));
        } else if (numero>=1000 && numero<10000){
            resultado = obtenerMiles(Integer.valueOf(numeros[0]))+obtenerCentena(Integer.valueOf(numeros[1]))+obtenerDecena(Integer.valueOf(numeros[2]))+obtenerUnidad(Integer.valueOf(numeros[3]));
        }
        return resultado;
    }

    private static String obtenerUnidad(int numero){        
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
            default:
                resultado = "";
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
            default:
                resultado = "";
            break;
        }
        return resultado;
    }

    private static String obtenerCentena(int numero){        
        String resultado = "";
        switch(numero){
            case 1:
                resultado = "C";
            break;
            case 2:
                resultado = "CC";
            break;
            case 3:
                resultado = "CCC";
            break;
            case 4:
                resultado = "CD";
            break;
            case 5:
                resultado = "D";
            break;
            case 6:
                resultado = "DC";
            break;
            case 7:
                resultado = "DCC";
            break;
            case 8:
                resultado = "DCCC";
            break;
            case 9:
                resultado = "CM";
            break;
            case 10:
                resultado = "M";
            break; 
        }
        return resultado;
    }

    private static String obtenerMiles(int numero){        
        String resultado = "";
        switch(numero){
            case 1:
                resultado = "M";
            break;
            case 2:
                resultado = "MM";
            break;
            case 3:
                resultado = "MMM";
            break;
            case 4:
                resultado = "MMMM";
            break;
            case 5:
                resultado = "V̅";
            break;
            case 6:
                resultado = "V̅I̅";
            break;
            case 7:
                resultado = "V̅I̅I̅";
            break;
            case 8:
                resultado = "V̅I̅I̅I̅";
            break;
            case 9:
                resultado = "I̅X̅";
            break;
            case 10:
                resultado = "X̅";
            break; 
        }
        return resultado;
    }

}
