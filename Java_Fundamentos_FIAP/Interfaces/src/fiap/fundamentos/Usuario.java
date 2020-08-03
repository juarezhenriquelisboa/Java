package fiap.fundamentos;

public class Usuario implements Autenticavel {

		@Override 
		public boolean login(String usuario, String senha) {
			return false;
		}
		
		@Override
		public void logou() {
			
		}
}
