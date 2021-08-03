package ProjetoVideo;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    protected abstract void ganharExp();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public double getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(double e) {
        this.experiencia = e;
    }
}