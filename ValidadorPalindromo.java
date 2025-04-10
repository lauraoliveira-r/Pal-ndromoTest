public class ValidadorPalindromo {

    public static boolean ehPalindromo(String texto) {
        if (texto == null) return false;
        String normalizado = texto
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        String invertido = new StringBuilder(normalizado).reverse().toString();
        return normalizado.equals(invertido);
    }
}
