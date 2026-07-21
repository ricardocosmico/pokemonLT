package pokemon;

public class Pokemon {

    String nome;
    String tipo;
    int nivel;
    int vidaMaxima;
    int vidaAtual;

    Pokemon(String nome, String tipo, int nivel, int vidaMaxima) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
    }

    void exibirFicha() {

        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida Máxima: " + vidaMaxima);
        System.out.println("Vida Atual: " + vidaAtual);
        System.out.println("---------------------------");

    }

    void receberDano(int quantidade) {

        vidaAtual -= quantidade;

        if (vidaAtual < 0) {
            vidaAtual = 0;
        }

    }

    void recuperarTotal() {

        vidaAtual = vidaMaxima;

    }

    static void exibirEquipe(Pokemon[] equipe) {

        for (int i = 0; i < equipe.length; i++) {

            if (equipe[i] != null) {
                equipe[i].exibirFicha();
            }

        }

    }

    static void curarEquipe(Pokemon[] equipe) {

        for (int i = 0; i < equipe.length; i++) {

            if (equipe[i] != null) {
                equipe[i].recuperarTotal();
            }

        }

        System.out.println("Enfermeira Joy curou sua equipe!");

    }

    public static void main(String[] args) {

        // Criação da equipe
        Pokemon[] equipe = new Pokemon[3];

        // Instanciação dos Pokémon
        equipe[0] = new Pokemon("Pikachu", "Elétrico", 15, 80);
        equipe[1] = new Pokemon("Charmander", "Fogo", 12, 75);
        equipe[2] = new Pokemon("Squirtle", "Água", 14, 90);

        // Primeira exibição
        System.out.println("=== EQUIPE INICIAL ===");
        exibirEquipe(equipe);

        // Combate
        equipe[0].receberDano(30);
        equipe[2].receberDano(100);

        // Segunda exibição
        System.out.println("=== APÓS O COMBATE ===");
        exibirEquipe(equipe);

        // Cura
        curarEquipe(equipe);

        // Exibição final
        System.out.println("=== APÓS A CURA ===");
        exibirEquipe(equipe);

    }

}
