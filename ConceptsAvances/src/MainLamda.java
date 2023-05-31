import com.dixmillescodeurs.poo.ICalculatrice;
import com.dixmillescodeurs.poo.ICalculatriceFuntional;
import com.dixmillescodeurs.poo.Sharp;

/**
 * @author Daniel FOUOMENE
 */
public class MainLamda {

    public static void main(String[] args) {

        ICalculatrice calculatrice = new Sharp() ;
        System.out.println("********** Sans Lamda ***********************");
        System.out.println(" La somme de 5 et 6 = "+ calculatrice.somme(5,6));
        System.out.println(" La produit de 5 et 6 = "+ calculatrice.produit(5,6));

        ICalculatriceFuntional somme = (double a,double b)-> a+b;
        ICalculatriceFuntional produit = (double a,double b)-> a*b;

        System.out.println("********** Avec Lamda ***********************");

        System.out.println(" La somme de 5 et 6 = "+ somme.calculate(5,6));
        System.out.println(" La somme de 5 et 6 = "+ produit.calculate(5,6));






    }

}
