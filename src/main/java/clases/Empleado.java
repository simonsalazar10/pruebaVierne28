package clases;

public class Empleado {
    //ATRIBUTOS
    //(VARIABLES DE JAVA)
    //(FUERTES TIPADA)
    public String id;
    public String nombres;
    public String apellidos;
    public String correo;
    public String direccion;
    public String telefono;
    public String documento;
    char tipoAfiliacionCajaCompensacion;

    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionPrestamoVivienda;
    double deduccionGym;
    double demandaAlimentos;
    double deduccionSalud;
    double deduccionPensiones;
    double deduccionCajaCompensacion;
    double subsidioCajaCompensacion;
    double auxilioTransporte;
    double dotacion;
    double auxilioEscolar;

    //CONSTRUCTOR
    //(METODO ESPECIAL)
    //(CREAR OBJETO DE LA CLASE)

    public Empleado() {
    }





//METODOS DE CLASE
    //(FUNCIONES DE JAVA)
    //(toda la funcion retorna algo en java)

    public void saludar()
    {
        System.out.println("hola, buenos dias");
    }


}
