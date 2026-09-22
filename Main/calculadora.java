
//codigo de adicao

javapublic class Adicao {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        
        // Operação aditiva
        int resultado = numero1 + numero2;
        
        System.out.println("O resultado da soma é: " + resultado);
    }
}

public static void realizarDivisao(double a, double b) {
        if (b == 0) {
            System.out.println("\n[Erro] Divisão por zero não é permitida!");
        } else {
            double resultado = a / b;
            System.out.println("\n[Divisão] Resultado: " + a + " / " + b + " = " + resultado);
        }
    }
