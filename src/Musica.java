public class Musica extends Audio implements Classificador{
    private String cantor;
    private String album;
    private int faixa;
    private String genero;


    public Musica(String titulo, double duracao) {
        super(titulo, duracao);
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void addAlbum(String nomeAlbum){
        album = nomeAlbum;
    }

    public String getAlbum() {
        return album;
    }

    public int getFaixa() {
        return faixa;
    }

    public void addfaixa(int nomeFaixa){
        faixa = nomeFaixa;
    }

    @Override
    public void classificar(double nota) {
        int contador = 0;
        double totalNotas = 0;

        contador++;
        totalNotas += nota;

        setClassificacao(totalNotas/contador);
    }
}
