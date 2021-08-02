package ProjetoVideo;

public class Video implements AcoesVideo{
    private String video;
    private boolean avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String v) {
        this.video = v;
    }

    public boolean getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(boolean a) {
        this.avaliacao = a;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int v) {
        this.views = v;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int c) {
        this.curtidas = c;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean r) {
        this.reproduzindo = r;
    }

    @Override
    public void play() {
        if (!getReproduzindo()) {
            setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (getReproduzindo()) {
            setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }
}
