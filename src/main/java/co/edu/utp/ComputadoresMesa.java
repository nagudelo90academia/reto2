package co.edu.utp;

public class ComputadoresMesa extends Computadores{
    private static final Integer  ALMACENAMIENTO_BASE = 50;

    private Integer almacenamiento;

    //Constructor 
    public ComputadoresMesa(){
        //this(PRECIO_BASE, PESO_BASE, CONSUMO_W, ALMACENAMIENTO_BASE);
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.almacenamiento = ALMACENAMIENTO_BASE;        

    }

    public ComputadoresMesa(Double precioBase, Integer peso){
        //this(precioBase, peso, CONSUMO_W, ALMACENAMIENTO_BASE);
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;

    } 

    //Metodos
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if (almacenamiento > 100) {
            adicion += 50.0;
        }
        return adicion;
    }

    public Integer getCarga(){
        return almacenamiento;
    }   
}
