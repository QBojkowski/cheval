import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /* Cas 1 */
        int[] puissance1 = { 3, 9, 5, 8 };
        Arrays.sort(puissance1);
        int difmin = 10000;
        int chevalone = 0;
        int chevaltwo = 0;

        for (int i = 0; i < puissance1.length - 1; i++) {
            int dif = puissance1[i + 1] - puissance1[i];
            if (difmin > dif) {
                difmin = dif;
                chevalone = i;
                chevaltwo = i + 1;
            }

        }

        System.out.println(puissance1);
        System.out.println(
                "Les deux chevaux de puissance la plus proche sont les chevaux : " + chevalone + " et " + chevaltwo
                        + "\n Leur ecart de puissance est de : " + difmin);

        /* Cas 2 */

        int[] puissance2 = { 10, 5, 15, 17, 3, 8, 11, 28, 6, 55, 7 };
        Arrays.sort(puissance2);
        int difmin2 = 10000;
        int chevalone2 = 0;
        int chevaltwo2 = 0;
        String listeduo = "Liste des duo de chevaux de puissance similaire : ";

        for (int i = 0; i < puissance2.length - 1; i++) {
            int dif = puissance2[i + 1] - puissance2[i];
            if (difmin2 > dif) {
                difmin2 = dif;
            }

        }

        for (int i = 0; i < puissance2.length - 1; i++) {
            int dif = puissance2[i + 1] - puissance2[i];
            if (difmin2 == dif) {
                chevalone2 = i ;
                chevaltwo2 = i + 1;
                listeduo = listeduo + "\n Le duo : " + chevalone2 + " et " + chevaltwo2;
            }
        }

        System.out.println(listeduo);
    }

    /*
     * Cas 3 : Générer un tableau aléatoire de 1000 entiers compris entre 1 et
     * 100000
     */
}
