package date_class.exceptions;

/**
 *  @Author Leonardo Marques - 23/08/2026
*/

public class DateExceptions extends IllegalArgumentException{
    public DateExceptions(String errorMensage) {
        super(errorMensage);
    }
}
