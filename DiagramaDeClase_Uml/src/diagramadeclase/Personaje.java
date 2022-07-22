
package diagramadeclase;


public abstract class  Personaje {
    private String nombre;
    private String descrpcion;
    private long tamaño;
    private int poder;
    private int vida;
    
    public void desplazarse(){
        System.out.println("");
    }
    public int mostrarVida(){
        System.out.println(vida);
        return 0;
    }
    public int mostrarPoder(){
        System.out.println(poder);
        return 0;
    }
}
