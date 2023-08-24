public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*String sinopse = """
                O Filme é esse\s
                Aqui
                sdsds
                """;
         */
        double temperatura = 31;
        double fahrenheit = (int) ((temperatura * 1.8) + 32);
        String mensagem =  String.format("A temperatura de %f celsius é equivalente a %f", temperatura, fahrenheit );

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}