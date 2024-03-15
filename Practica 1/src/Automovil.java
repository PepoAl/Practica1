import java.util.Comparator;

class Automovil {
    private String marca;
    private String modelo;
    private String linea;
    private double precio;
    private String placa;

    public Automovil(String marca, String modelo, String linea, double precio, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.precio = precio;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLinea() {
        return linea;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPlaca() {
        return placa;
    }
}