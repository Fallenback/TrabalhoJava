public class EquacaoDeSegundoGrau {

    private double a;
    private double b;
    private double c;

    public EquacaoDeSegundoGrau(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O coeficiente 'a' deve ser diferente de zero.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolver() {
        double delta = calcularDelta();
        
        if (delta > 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: %.2f e %.2f%n", raiz1, raiz2);
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A raiz da equação é: %.2f%n", raiz);
        } else {
            System.out.println("A equação não tem raízes reais.");
        }
    }

    private double calcularDelta() {
        return b * b - 4 * a * c;
    }

    public static void main(String[] args) {
        try {
            EquacaoDeSegundoGrau eq = new EquacaoDeSegundoGrau(1, -3, 2); // Exemplo: x^2 - 3x + 2 = 0
            eq.resolver();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}