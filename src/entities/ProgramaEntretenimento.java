package entities;

public class ProgramaEntretenimento {

	private String nome;
	private String categoria;
	private String personagemPrincipais;
	private Integer faixaEtaria;
	private String classificacao;
	private double notaClassificacao;
	private String duracao;
	private Sede sede;
	private Documento documento;

	/* Construtor */
	public ProgramaEntretenimento() {
		
	}
	
	public ProgramaEntretenimento(String nome, String categoria, String personagemPrincipais, Integer faixaEtaria,
			String classificacao, double notaClassificacao, String duracao) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.personagemPrincipais = personagemPrincipais;
		this.faixaEtaria = faixaEtaria;
		this.classificacao = classificacao;
		this.notaClassificacao = notaClassificacao;
		this.duracao = duracao;
	}
	

	/* GEtTER AND SETTER */
	public String getNome() {
		return nome;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPersonagemPrincipais() {
		return personagemPrincipais;
	}

	public void setPersonagemPrincipais(String personagemPrincipais) {
		this.personagemPrincipais = personagemPrincipais;
	}

	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(Integer faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public double getNotaClassificacao() {
		return notaClassificacao;
	}

	public void setNotaClassificacao(double notaClassificacao) {
		this.notaClassificacao = notaClassificacao;
	}

	/* Metados */
	public void classificarPrograma() {
		if (getNotaClassificacao() <= 4) {
			System.out.println("Ruim");
		} else if (getNotaClassificacao() < 8) {
			System.out.println("Bom");
		} else {
			System.out.println("Otimo");
		}
	}

	@Override
	public String toString() {
		return "ProgramaEntretenimento [nome=" + nome + ", categoria=" + categoria + ", personagemPrincipais="
				+ personagemPrincipais + ", faixaEtaria=" + faixaEtaria + ", classificacao=" + classificacao
				+ ", notaClassificacao=" + notaClassificacao + ", duracao=" + duracao + "]";
	}

}
