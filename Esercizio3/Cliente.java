package Esercizio3;

public class Cliente {
    private int codicecliente;
    private String nomeECognome;
    private String email;
    private String dataIscrizione;

    public Cliente(int codicecliente, String nomeECognome, String email, String dataIscrizione) {

        this.codicecliente = codicecliente;
        this.nomeECognome = nomeECognome;
        this.email= email;
        this.dataIscrizione=dataIscrizione;
    }

    public int getCodicecliente() {
        return codicecliente;
    }

    public String getNomeECognome() {
        return nomeECognome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }
}
