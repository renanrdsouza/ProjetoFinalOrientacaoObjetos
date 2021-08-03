package ProjetoVideo;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        setTotAssistido(getTotAssistido() + 1);
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String l) {
        this.login = l;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int a) {
        this.totAssistido = a;
    }

    @Override
    protected void ganharExp() {
        
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
