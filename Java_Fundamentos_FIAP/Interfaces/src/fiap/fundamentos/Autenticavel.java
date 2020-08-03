package fiap.fundamentos;

public interface Autenticavel {
	
	String MSG_LOGOUT = "saindo";
	
	boolean login(String usuario, String senha);
	
	void logou();
}
