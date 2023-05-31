import com.dixmillescodeurs.poo.*;

public class MainInterface {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        IPersonnel iPersonnel = new GenerationBuletinSolde();

      /*  Employe employe1 = new Employe("FOUOMENE","Daniel",35);
        Employe employe2 = new Employe("LATIFATOU","Iyali",20);
        Employe employe3 = new Employe("FARIMATA","Douaré",18);

        System.out.println(employe1);*/

        Ouvrier ouvrier1 = new Ouvrier("LATI","Iya",50);
        ouvrier1.setAnciennete(3);
        System.out.println("Le salaire de l'employe 1 est "+ iPersonnel.calculSalaire(ouvrier1));


        Directeur directeurRH = new Directeur("MBIANDOU","Douglas",45);
        System.out.println(directeurRH);
        directeurRH.setAnciennete(10);
        System.out.println("Le salaire du diracteur des RHs est "+ iPersonnel.calculSalaire(directeurRH));


        Rectangle rectangle = new Rectangle(16,4);

        System.out.println("Perimetre = "+ rectangle.perimetre());
        System.out.println("Surface = "+ rectangle.surface());


        /*Sharp calculatriceSharp = new Sharp();
        System.out.println(" La somme de 5 et 6 = "+ calculatriceSharp.somme(5,6));
        System.out.println(" La produit de 5 et 6 = "+ calculatriceSharp.produit(5,6));*/

        ICalculatrice calculatrice = new Sharp() ;

        System.out.println(" La somme de 5 et 6 = "+ calculatrice.somme(5,6));
        System.out.println(" La produit de 5 et 6 = "+ calculatrice.produit(5,6));

        IRobotIA chatGPT = new ChatGPTCodeurs();

        System.out.println(" la somme de 10 et 20 est " + chatGPT.calculer(10,20,Operateur.ADDITION,calculatrice));
        System.out.println(" la produit de 10 et 20 est " + chatGPT.calculer(10,20,Operateur.MULTIPLICATION,calculatrice));


    }
}