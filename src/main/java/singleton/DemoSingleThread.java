
package singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        //Imprime uma mensagem indicando que o Singleton foi reutilizado se os valores forem iguais.
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        //Obtém a instância única da classe Singleton com o valor "FOO" e a atribui à variável singleton.
        Singleton singleton = Singleton.getInstance("FOO");
        //Obtém novamente a instância única da classe Singleton com o valor "BAR" e a atribui à variável anotherSingleton.
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        
        //Imprime o valor do campo data da instância singleton.
        System.out.println(singleton.value);
        //Imprime o valor do campo data da instância anotherSingleton.
        System.out.println(anotherSingleton.value);
    }
}