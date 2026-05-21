public class Livro {

    
    private String titulo;
    private String autor;
    private int anoPublicacao;

    
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Livro removido do sistema: " + titulo);
        super.finalize();
    }

    
    public static void main(String[] args) {

        // Criando objeto Livro
        Livro livro = new Livro(
                "Dom Casmurro",
                "Machado de Assis",
                1899
        );

        
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());

        
        livro.setTitulo("Dom Casmurro - Edição Revisada");

        
        System.out.println("\nApós alteração:");
        System.out.println("Título: " + livro.getTitulo());

        
        livro = null;

        
        System.gc();
    }
}