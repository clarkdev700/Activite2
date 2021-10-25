package mypackage;
/**
 * Calcul.
 * @author GBIKPI BENISSANH Date E.
 */
public final class Calcul {

    /**
     * Contructeur privee.
     */
    private Calcul() {

    }
    /**
     * Calcul la somme de deux nombres.
     * @param a premiere valeur entier
     * @param b second valeur entier
     * @return la somme de a et b
     */
    public static int somme(final int a, final int b) {
        return a + b;
    }

    /**
     * Calcul la division de deux nombres.
     * @param a premiere valeur entier
     * @param b second valeur entier
     * @return la divion de a par b si b superieur ou egal à 10 sinon retourne b
     */
    public static int maFonction(final int a, final int b) {
        final int nbre = 10;
        if (b >= nbre) {
            return a / b;
        }
        return b;
    }

    /**
     * @param a premiere valeur entier
     * @param b second valeur entier
     * @return a / b si b != 0
     * @throw IllegalArgumentException si b == 0.
     */
    public static int division(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b ne doit pas etre 0");
        }
        return a / b;
    }
}
