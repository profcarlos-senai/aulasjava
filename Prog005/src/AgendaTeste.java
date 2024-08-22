public class AgendaTeste {
    public static void main(String[] args) {
        Agenda agenda2024 = new Agenda(); // cria um objeto do tipo "Agenda"

        agenda2024.setCompromisso(10, 20, 8, "Mercado");
        agenda2024.setCompromisso(11, 24, 12, "Festa de Natal na casa da Vó");
        agenda2024.setCompromisso(18, 14, 5, "Tomar remédio");

        agenda2024.imprimeAno();
    }
}
