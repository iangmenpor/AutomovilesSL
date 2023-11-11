import java.util.Scanner;

public class Main {
public static void main (String [] args){

    Scanner sc= new Scanner(System.in);

    //-Titulo:
    System.out.println("<--------Automoviles SL------->");

    //-Datos del coche;
    System.out.print("Rellene los datos del coche: \n->Matricula: ");
    String licenseplate=sc.nextLine();
    System.out.print("->Marca: ");
    String brand=sc.nextLine();
    System.out.print("->Modelo: ");
    String model=sc.nextLine();
    System.out.print("->Color: ");
    String color=sc.nextLine();
    System.out.print("->Tipo de combustible: ");
    String fuelType=sc.nextLine();
    System.out.print("->Motor: ");
    String engine=sc.nextLine();
    System.out.print("->Caballos de potencia");
    String cv=sc.nextLine();
    System.out.print("Precio: ");
    String price=sc.nextLine();


    Car coche = new Car();
    coche.setLicensePlate(licenseplate);
    coche.setBrand(brand);
    coche.setModel(model);
    coche.setColor(color);
    coche.setFuelType(fuelType);
    coche.setEngine(engine);
    coche.setCv(cv);

    //-Datos de Cliente
    System.out.print("Rellene los datos del cliente: \n->Nombre: ");
    String name=sc.nextLine();
    System.out.print("->Apellidos: ");
    String surname=sc.nextLine();
    System.out.print("DNI: ");
    String dni=sc.nextLine();
    System.out.print("->Dirección: ");
    String address=sc.nextLine();

    Client cliente= new Client();
    cliente.setName(name);
    cliente.setSurname(surname);
    cliente.setDni(dni);
    cliente.setAddress(address);

    //-Compra
    System.out.print("Rellene los detalles de la compra: \n->Código:");
    String code=sc.nextLine();
    System.out.print("->Fecha: ");
    String date = sc.nextLine();
    System.out.print("->Método de Pago: ");
    String paymentMethod=sc.nextLine();

    Purchase compra= new Purchase();
    compra.setCode(code);
    compra.setDate(date);
    compra.setPrice(price);
    compra.setPaymentMethod(paymentMethod);

    //No se usar ArrayLis... TuT

    //-Ticket
     System.out.println("<---------------------------TICKET---------------------------------------------------------------------------------------------------------------------------------------------------------------->");
     System.out.println("En "+ compra.getDate()+ " , reunidos.");
     System.out.println("De una parte Automoviles SL, en calidad de Vendedor. \nY de otra parte D. "+ cliente.getName()+" "+cliente.getSurname()+" con Documento Nacional de Identidad, nº. "+ cliente.getDni()+" domiciliado en "+ cliente.getAddress()+ " , en calidad de Comprador.");
     System.out.println("             MANIFIESTAN               ");
     System.out.println("Que han convenido, como el presente documento lo lleva en efecto, formalizar la compra-venta de vehículo automóvil cuyas características son las siguientes: \n      >Matrícula: "+coche.getLicensePlate()+"\n      >Marca y Tipo: "+ coche.getBrand()+ " "+ coche.getModel()+"\n      >Motor y Caballos de potencia: "+ coche.getEngine()+" "+coche.getCv()+ "\n      >Tipo de Combustible: "+ coche.getFuelType() +"\n      >Valor de Venta: "+ compra.getPrice()+ " por "+ compra.getPaymentMethod()+".");
     System.out.println("<------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->");
}
}