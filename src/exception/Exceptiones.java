package exception;

/**
 *
 * @author jrodriguezar
 */
public class Exceptiones {
    
    public Exceptiones(){
        int x = 0;
        try{
            this.divisionCero();
        }
        catch(ArithmeticException e){
            throw new ArithmeticException();
        }
    }
    
    public void divisionCero(){
        int c=0;
        String x =null;
        for (int i = 0; i < 10; i++)
        try{
            c = 5/i;
            x.length();
            System.out.println("Punto control 1");
        }
        catch(ArithmeticException e){
            throw new ArithmeticException();
            //System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            throw new NullPointerException();
            //System.out.println("Incicializar x");
        }
        finally{
            //System.out.println("Finalizacion");
            //...
        }
    }

    public static void main(String[] args) {
        try{
            Exceptiones esp = new Exceptiones();
        }
        catch(ArithmeticException e){
            System.out.println("Division por cero");
        }
    }    
}
