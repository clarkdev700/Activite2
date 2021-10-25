package mypackage;

import static org.junit.jupiter.api.Assertions.assertEquals; // import pour la m�thode statique assertEquals
import static org.junit.jupiter.api.Assertions.assertThrows; //import pour la m�thode statique assertThrows
import org.junit.jupiter.api.Test; // import pour l'annotation @Test indiquant qu'il s'agit d'une m�thode de test

public class CalculTest {

    /**
     * V�rifie le constructeur de la classe.
     */
    @Test
    public void testConstructeur() {
        //
    }

    /**
     * V�rifie la somme de a et b.
     */
    @Test
    public void testSomme() {
        final int a = 2;
        final int b = 3;
        final int expected = 5;
        assertEquals(expected, Calcul.somme(a, b));
    }

    /**
     * V�rifie la division de a et b.
     */
    @Test
    public void testDivision() {
        final int a = 8;
        final int b = 2;
        final int expected = 4;
        assertEquals(expected, Calcul.division(a, b));
    }

    /**
     * mafontion avec b superieur � 10. return la division de a/b
     */
    @Test
    public void testMaFonctionAvecBSuperieurADix() {
        final int a = 20;
        final int b = 10;
        final int expected = 2;
        assertEquals(expected, Calcul.maFonction(a, b));
    }

    /**
     * mafontion avec b inferieur � 10. retrun b
     */
    @Test
    public void testMaFonctionAvecBInferieurADix() {
        final int a = 10;
        final int b = 5;
        final int expected = 5;
        assertEquals(expected, Calcul.maFonction(a, b));
    }

    /**
     * Division par 0. return une exception captur�
     */
    @Test
    public void testDivisionParZero() {
        final int a = 4;
        final int b = 0;
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
            Calcul.division(a, b);
        });
        assertEquals("b ne doit pas etre 0", exception.getMessage());
    }
}
