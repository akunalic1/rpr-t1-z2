package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Niz {
    private int velicina;
    private int[] niz;
    private enum TipBrojeva{ CIJELI, REALNI, IMAGINARNI};
    public Niz(){
        velicina=0;
        niz=null;
    }
    public static void ispisiTipove(){
        for(TipBrojeva tip: TipBrojeva.values()) System.out.print(tip + " ");
        System.out.println();
        for(TipBrojeva tip: TipBrojeva.values()) System.out.print(tip.ordinal() + " ");
    }
    public Niz(int velicina){
        niz=new int[velicina];
        setVelicina(velicina);
    }
    public void dodajElement(int element){
        int[] pom=new int[getVelicina()+1];
        if(niz != null)
       System.arraycopy(niz, 0, pom,0, getVelicina());
        pom[velicina]=element;
        setVelicina(velicina+1);
        niz=pom;
    }
    public void ispisiNiz(){
        for(int i=0; i<this.getVelicina(); i++){
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }
    public int getVelicina() {
        return velicina;
    }

    public void setVelicina(int velicina) throws IllegalArgumentException{
        if(velicina<0) throw new IllegalArgumentException ("Neispravna velicina niza!");
        this.velicina = velicina;
    }

    public int[] getNiz() throws  NullPointerException{
        if(niz==null) throw new NullPointerException("Niz ne postoji!");
        return niz;
    }

    public void setNiz(int[] niz) {
        this.niz = niz;
    }

    @Override
    public String toString() {
        return Arrays.toString(niz) ;
    }
}
