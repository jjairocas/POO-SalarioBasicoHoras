package AppSalarioBasHoras;

import java.util.*;

public class SalarioBasicoHoras {

    public static void main(String[] args) {

        AppSalarioBasicHoras form=new AppSalarioBasicHoras();
        form.setVisible(true);
    }


}
    /*public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado");
        String NombreEmpl= input.nextLine();
        System.out.println("Ingrese el salario por horas");
        int SalarioxHrs= input.nextInt();
        System.out.println("Ingrese el numero de horas trabajadas por mes");
        int NumHrsTrabajadas= input.nextInt();

        int Salario=SalarioxHrs*NumHrsTrabajadas;

        if(Salario>=450000){
            //if(SalarioxHrs>=2344 && NumHrsTrabajadas>=192){
            System.out.println("El nombre es:"+NombreEmpl+" y el salario es: $"+Salario);

        }
        else{
            System.out.println("El nombre es:"+NombreEmpl);
        }

    }*/