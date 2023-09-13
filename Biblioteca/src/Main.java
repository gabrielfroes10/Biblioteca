public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Minha Biblioteca");

        Autor autor1 = new Autor("Autor 1");
        Autor autor2 = new Autor("Autor 2");

        Livro livro1 = new Livro("Harry Potter", autor1.getNome());
        Livro livro2 = new Livro("Senhor dos Aneis", autor2.getNome());


        biblioteca.adcionarAutor(autor1);
        biblioteca.adcionarAutor(autor2);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Verificando disponibilidade de 'Livro 1': " + biblioteca.verificarDisponibilidade("Harry Potter"));
        System.out.println("Verificando disponibilidade de 'Livro 3': " + biblioteca.verificarDisponibilidade("A Cabana"));
    }
}
