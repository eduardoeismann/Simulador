package feevale.entities;

public enum Categoria {

	COMPUTADOR("Computador"),
	IMPRESSORA("Impressora"),
	INTERNET("Internet"),
	SERVIDOR_INFRA("Servidor/Infra"),
	EMAIL("E-mail"),
	RELATORIOS("Relatórios"),
	SEM_CATEGORIA("indefinido");

	String name;

	private Categoria(String name) {
		this.name = name;
	}

	public static Categoria getByString(String string) {
		if (string == null || string.isEmpty()) {
			return null;
		}
		for (Categoria categoria : values()) {
			if (categoria.name.equals(string)) {
				return categoria;
			}
		}
		return null;
	}

}
