package AppSalarioBasHoras;

public class Salario {
    String NombreEmpl;
    int SalarioxHRS;
    int NumHrsTrabajadas;

    public Salario(String NombreEmpl, int SalarioxHRS, int NumHrsTrabajadas) {
        this.NombreEmpl = NombreEmpl;
        this.SalarioxHRS = SalarioxHRS;
        this.NumHrsTrabajadas = NumHrsTrabajadas;
    }
    int CalculoSalario(){
        return SalarioxHRS*NumHrsTrabajadas;

    }

}
