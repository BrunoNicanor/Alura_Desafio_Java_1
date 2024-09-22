public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Earth song",6.45);
        Musica musica2 = new Musica("Double fantasy",3.25);

        musica1.addAlbum("Dengerous");
        musica1.addfaixa(3);
        musica1.setCantor("Michael Jackson");
        musica1.setGenero("Pop");
        musica1.reproduzir();
        musica1.curtir();
        musica1.classificar(10);
        musica1.classificar(9.5);
        musica1.classificar(8);

        System.out.println("Titulo: " + musica1.getTitulo());
        System.out.println("Duração: "+ musica1.getDuracao());
        System.out.println("Contar: " + musica1.getCantor());
        System.out.println("Album: " + musica1.getAlbum());
        System.out.println("Faixa: " + musica1.getFaixa());
        System.out.println("Curtidas: " + musica1.getCurtidas());
        System.out.println("Reproduções:" + musica1.getTotalReproducoes());
        System.out.println("Classificação" + musica1.getClassificacao());

        Podcast podcast1 = new Podcast("Nerdcast",125);
        Podcast podcast2 = new Podcast("Flow",245);
        Podcast podcast3 = new Podcast("Podpah",180);


    }
}
