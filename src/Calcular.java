import java.util.Scanner;

public class Calcular {

    public void CalcularNumeroSuerte() {
       Persona Objpersona;
        int dia, mes, anio;
        int numero=0, NumeroSuerte, suma=0; String aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dia de nacimiento: ");
        dia=teclado.nextInt();
        System.out.println("Mes: ");
        mes=teclado.nextInt();
        System.out.println("Dia de nacimiento: ");
        anio=teclado.nextInt();
        Persona obj = new Persona(dia,mes,anio);
        NumeroSuerte = Persona.getDia() + Persona.getMes() + Persona.getAnio();
        String numCadena = NumeroSuerte + " ";

        for (int i=0;i<4;i++) {
            aux = String.valueOf(numCadena.charAt(i));
            numero = Integer.parseInt(aux);
            suma += numero;
        }
        System.out.println(suma);
    }
}
