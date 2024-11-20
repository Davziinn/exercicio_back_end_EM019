public class LeituraAnotação {
    public static void main(String[] args) {
        Class<?> claxx = MinhaClasse.class;

        if (claxx.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = claxx.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela);
        } else {
            System.out.println("A anotação 'Tabela' não está presente na classe.");
        }
    }
}