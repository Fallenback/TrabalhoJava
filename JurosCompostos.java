public class JurosCompostos {

    private double principal;
    private double taxaJurosAnual;
    private int compostosPorAno;
    private int anos;

    // Construtor que recebe os valores necessários
    public JurosCompostos(double principal, double taxaJurosAnual, int compostosPorAno, int anos) {
        if (principal <= 0 || taxaJurosAnual < 0 || compostosPorAno <= 0 || anos < 0) {
            throw new IllegalArgumentException("Todos os valores devem ser positivos e o principal deve ser maior que zero.");
        }
        this.principal = principal;
        this.taxaJurosAnual = taxaJurosAnual;
        this.compostosPorAno = compostosPorAno;
        this.anos = anos;
    }

    // Método para calcular o montante final
    public double calcularMontante() {
        return principal * Math.pow(1 + taxaJurosAnual / compostosPorAno, compostosPorAno * anos);
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Exemplo: Principal = 1000, Taxa de Juros Anual = 5% (0.05), Compostos por Ano = 4 (trimestral), Anos = 10
        JurosCompostos juros = new JurosCompostos(1000, 0.05, 4, 10);
        double montante = juros.calcularMontante();
        System.out.printf("O montante final após %d anos é: %.2f%n", juros.anos, montante);
    }
}