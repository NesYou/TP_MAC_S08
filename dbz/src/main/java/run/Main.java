package run;

import exceptions.TransformationImpossibleException;
import race.Sayen;
import transformation.GorilleSayen;

public class Main {


    public static void main(String[] args) throws TransformationImpossibleException {

        Sayen goku = new Sayen(100000000,5000);
        System.out.println("Goku 0.1/Attaque non contrôlée: "+goku.getAttaqueNonControlee().getDegats());

        GorilleSayen gokuGorille = goku.transformationGorille();
        System.out.println("Goku 0.2/Attaque non contrôlée: "+gokuGorille.getAttaqueNonControlee().getDegats());
        System.out.println("Goku 0.2/Vague déferlante: "+gokuGorille.creerVagueDeferlante().getDegats());
        gokuGorille.voler();
        /*if (goku == gokuGorille.couperQueue()) {
            System.out.println("Transformation terminée");
        }
        else {
            throw new TransformationImpossibleException();
        }


        SuperSayen gokuSS1 = goku.transformationSS1();
        System.out.println("Goku 2.0/Attaque non contrôlée: "+gokuSS1.getAttaqueNonControlee().getDegats());
        System.out.println("Goku 2.0/Super kamehameha:" + gokuSS1.balanceSuperKamehameha().getDegats());
        System.out.println("Goku 2.0/Vague déferlante: "+gokuSS1.creerVagueDeferlante().getDegats());
        gokuSS1.voler();

        SuperSayen2 gokuSS2 = gokuSS1.transformationSS2();
        System.out.println("Goku 3.0/Attaque non contrôlée: "+gokuSS2.getAttaqueNonControlee().getDegats());
        System.out.println("Goku 3.0/Mega kamehameha:" + gokuSS2.balanceMegaKamehameha().getDegats());
        System.out.println("Goku 3.0/Vague déferlante: "+gokuSS2.creerVagueDeferlante().getDegats());
        gokuSS2.voler();
*/
    }
}