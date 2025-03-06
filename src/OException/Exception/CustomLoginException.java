package OException.Exception;

public class CustomLoginException extends Exception{
    public CustomLoginException() {
        super("Login inválido");
    }

    public CustomLoginException(String message) {
        super(message);
    }
}
