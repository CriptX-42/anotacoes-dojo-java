package OException.Runtime;

import OException.Exception.CustomLoginException;

public class TestLogin {
    public static void main(String[] args) {
        try {
            login();
        } catch (CustomLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws CustomLoginException {
        String login = "Ricardo";
        String senha = "123";

        String loginDigitado = "Ricardo";
        String senhaDigitada = "123546";

        if(!login.equals(loginDigitado) || !senha.equals(senhaDigitada)) {
            throw new CustomLoginException("Login está errado");
        }

    }
}
