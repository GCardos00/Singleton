/*
 * Claro, aqui est� um resumo de cada commit em uma linha:
 * 1. Declara��o da classe Singleton.
 * 2. Declara��o da vari�vel de inst�ncia `instance`.
 * 3. Declara��o da vari�vel de inst�ncia `data`.
 * 4. Declara��o do construtor privado da classe Singleton.
 * 5. Declara��o do m�todo `getInstance` para obter a inst�ncia �nica.
 * 6. Verifica��o se a inst�ncia � nula.
 * 7. In�cio de um bloco sincronizado.
 * 8. Verifica��o novamente se a inst�ncia � nula (double-checked locking).
 * 9. Cria��o de uma nova inst�ncia da classe Singleton com o argumento `data`.
 * 10. Retorno da inst�ncia existente ou rec�m-criada.
 */
public class Singleton {
	private static volatile Singleton instance;
	private String data;
	
	private Singleton(String data) {
		this.data = data;
	}
	
	public static Singleton getInstance(String data) {
		
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton(data);
				}
			}
		}
		return instance;
	}
}