package terceiraUnidade;

public class Pessoa {

	private int item;
	private String Nome;
	private String Curso;
	private String Universidade;

	public Pessoa(int item, String nome, String curso, String universidade) {
		super();
		this.item = item;
		this.Nome = nome;
		this.Curso = curso;
		this.Universidade = universidade;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		this.Curso = curso;
	}

	public String getUniversidade() {
		return Universidade;
	}

	public void setUniversidade(String universidade) {
		this.Universidade = universidade;
	}

	@Override
	public String toString() {
		return "item: " + item + ", Nome: " + Nome + ", Curso: " + Curso + ", Universidade: " + Universidade + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((Universidade == null) ? 0 : Universidade.hashCode());
		result = prime * result + item;
		result = prime * result + ((Curso == null) ? 0 : Curso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Universidade == null) {
			if (other.Universidade != null)
				return false;
		} else if (!Universidade.equals(other.Universidade))
			return false;
		if (item != other.item)
			return false;
		if (Curso == null) {
			if (other.Curso != null)
				return false;
		} else if (!Curso.equals(other.Curso))
			return false;
		return true;
	}

}
