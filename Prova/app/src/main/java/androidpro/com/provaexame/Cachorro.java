package androidpro.com.provaexame;

public class Cachorro {

        String nome;
        String raca;
        String genero;

    public Cachorro()
        {

        }

    public Cachorro(String nome, String raca, String genero) {
        this.nome = nome;
        this.raca = raca;
        this.genero = genero;
    }

        public String getNome() {
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public String getRaca() {
        return raca;
    }

        public void setRaca(String raca) {
        this.raca = raca;
    }

        public String getGenero() {
        return genero;
    }

        public void setGenero(String genero) {
        this.genero = genero;
    }

}
