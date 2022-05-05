package segundo_parcial;

/**
 *
 * @author AleMor
 */
public enum Principal {
   
    PALABRAS_RESERVADAS("(IF|ELSE|FOR|PRINT|INT)"),
    CADENA_CARACTERES("[a-z]"),
    OPERADOR_ARITMETICO("[*|/|+|-]"),
    NUMERO("[0-9]"),
    OPERADOR_RELACIONAL("([>=|<=|>|<|=|,|{|}|[|]|(|)|;|..|])");

    public final String patron;
    Principal(String s) {
        this.patron = s;

    }
}
