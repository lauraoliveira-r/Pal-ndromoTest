import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    @Test
    void testPalavrasSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Ovo"));
        assertFalse(ValidadorPalindromo.ehPalindromo("maçã"));
    }

    @Test
    void testFrasesComEspacoEPontuacao() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Isso não é um palíndromo"));
    }

    @Test
    void testComNumeros() {
        assertTrue(ValidadorPalindromo.ehPalindromo("12321"));
        assertFalse(ValidadorPalindromo.ehPalindromo("12345"));
    }

    @Test
    void testNuloOuVazio() {
        assertFalse(ValidadorPalindromo.ehPalindromo(null));
        assertTrue(ValidadorPalindromo.ehPalindromo(""));
    }
}
