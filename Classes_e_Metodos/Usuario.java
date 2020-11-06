package classe;

public class Usuario {

	String nome;
	String email;
		
	// equals method
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
			
			Usuario outro = (Usuario)objeto;
			
			boolean igualNome = outro.nome.equals(this.nome);
			boolean igualEmail = outro.email.equals(this.email);
			
			return igualNome && igualEmail;
		
		}else {
			return false;
		}
	}
	
	// hashcode method
	public int hashCode() {
	
		return this.nome.length();
	}
}
