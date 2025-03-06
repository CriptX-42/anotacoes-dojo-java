package Utilitarios.Data;

import java.util.Date;

public class DataTeste {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); // CONTA O TEMPO A PARTIR DE MS E É LONG;
        System.out.println(date);
    }
}
