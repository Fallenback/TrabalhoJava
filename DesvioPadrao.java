public class DesvioPadrao {

    private double[] valores;

    // Construtor que recebe um array de valores
    public DesvioPadrao(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("O array de valores não pode ser nulo ou vazio.");
        }
        this.valores = valores;
    }

    // Método para calcular a média dos valores
    public double calcularMedia() {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    // Método para calcular a variância
    public double calcularVariancia() {
        double media = calcularMedia();
        double somaQuadrados = 0;
        for (double valor : valores) {
            somaQuadrados += Math.pow(valor - media, 2);
        }
        // Para desvio padrão da população
        return somaQuadrados / valores.length;
        // Se quiser calcular para uma amostra, use: return somaQuadrados / (valores.length - 1);
    }

    // Método para calcular o desvio padrão
    public double calcularDesvioPadrao() {
        return Math.sqrt(calcularVariancia());
    }

    // Método principal para teste
    public static void main(String[] args) {
        double[] dados = {10, 12, 23, 23, 16, 23, 21, 16};
        DesvioPadrao dp = new DesvioPadrao(dados);

        System.out.printf("Valores: %s%n", java.util.Arrays.toString(dados));
        System.out.printf("Média: %.2f%n", dp.calcularMedia());
        System.out.printf("Variância: %.2f%n", dp.calcularVariancia());
        System.out.printf("Desvio Padrão: %.2f%n", dp.calcularDesvioPadrao());
    }
}