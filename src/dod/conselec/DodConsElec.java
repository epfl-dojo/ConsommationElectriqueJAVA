/*
 * # ConsommationElectriqueJAVA

Le programme doit calculer la consommation électrique d'un appareil et le coût de cette consommation.

* Un list field pour le choix de l'appareil
* Un text field pour le nombre d'heures où il est allumé
* Un radio pour la monnaie (dollars, euros, francs)
* Le résultat doit être affiché dans un text field bloqué à l'écriture
* Un popup de type warning doit apparaître si un champ n'est pas rempli
* Un popup de type erreur doit apparaître si le champ heures contient du texte
* Un popup invitant l'utilisateur à éteindre ses appareils doit apparaître si le prix dépasse 10'000.-

## Les appareils

* radio-réveil: 10watts

* aspirateur: 2000watts

## Les monnaies

* 1 CHF = 0,90501 euro

* 1 CHF = 1,00751 dollar

## Les formules

* kWh = nb heures * nb watts /1000

* prix = nb kWh * 0,25 (*0,90501) (*1,00751)

 */
package dod.conselec;

/**
 *
 * @author nbo
 */
public class DodConsElec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fenetre fen = new Fenetre();
    }
    
}
