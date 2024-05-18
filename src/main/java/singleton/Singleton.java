/*
- Define o pacote em que a classe `Singleton` está localizada.

- Declaração da classe `Singleton` como `final`, o que significa que não pode ser estendida.

- Declaração da variável de classe `instance`, que conterá a única instância da classe `Singleton`.

- Declaração do campo público `value`, que pode ser acessado para armazenar dados na instância de `Singleton`.

- Declaração do construtor privado da classe `Singleton`. Isso impede que outras classes instanciem `Singleton` diretamente.

- Este trecho simula uma inicialização lenta, atrasando a execução por 1000 milissegundos (1 segundo). Isso é comum em Singletons para emular situações reais em que a inicialização pode ser demorada.

- Atribui o valor passado como argumento ao campo `value`.

- Declaração do método estático `getInstance` que retorna a instância única da classe `Singleton`.

- Verifica se a instância é nula. Se for, cria uma nova instância da classe `Singleton` com o valor passado como argumento.
*/
package singleton;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
