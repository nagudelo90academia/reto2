package co.edu.utp;

public class ComputadoresPortatiles extends Computadores{
    private static final Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG; 

    public ComputadoresPortatiles() {   
        //this(PRECIO_BASE, PESO_BASE, CONSUMO_W, PULGADAS_BASE, camaraITG: false);        
        this.peso = PESO_BASE; 
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso){        
        //this(precioBase, peso, CONSUMO_W, PULGADAS_BASE, camaraITG: false);
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;

    }

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;        
    }

    //Metodos 
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if (pulgadas > 40) {
            adicion += precioBase * 0.3;            
        }
        if (camaraITG) {
            adicion += 50;
        }
        return adicion;
    }
    
}
