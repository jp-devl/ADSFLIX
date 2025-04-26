public class Principal {
    public static void main(String[] args) {
        Filme Filme1 = new Filme();

        Filme1.Nome = "O Poderoso Chefão";
        Filme1.AnodeLancamento = 1970;
        Filme1.Avaliacao = 10;
        Filme1.Genero = "Ação";
        Filme1.DuracaoemMinuto = 240;
        System.out.println(Filme1.Nome);
        System.out.println(Filme1.AnodeLancamento);
        System.out.println(Filme1.Avaliacao);
        System.out.println(Filme1.Genero);
        System.out.println(Filme1.DuracaoemMinuto);
    }

}
