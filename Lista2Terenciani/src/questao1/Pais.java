package questao1;


public class Pais {
 private String nome, capital;
	private double dimensao;
	private Pais[] fronteiras;

	public Pais(String nome, String capital, double dimensao) {
	this.nome = nome;
	this.capital = capital;
	this.dimensao = dimensao;
	}
	public boolean equals(Pais outro) {
	return this.nome.equals(outro.getNome())
               && this.capital.equals(outro.getCapital());
	}
	public void setFronteiras(Pais...paises) {
		int quantidadePaisesIguais = 0;
		for(int i = 0; i < paises.length; i++) {
			if(this.equals(paises[i])) {
				quantidadePaisesIguais++;
			}
		}
		
		this.fronteiras = new Pais[paises.length - quantidadePaisesIguais];
		int idxFronteira = 0;
		for(int i = 0; i < paises.length; i++) {
			if(!this.equals(paises[i])) {
				this.fronteiras[idxFronteira] = paises[i];
				idxFronteira++;
			}
		}
		
	}
	public Pais[] getFronteiras() {
		return this.fronteiras;
	}
	
	public Pais[] vizinhosEmComum(Pais outro) {
		int totaisIguais = 0;
		for(Pais fronteiraPais: this.fronteiras) {
			for(Pais fronteiraOutro: outro.fronteiras) {
				if(fronteiraPais.equals(fronteiraOutro)) {
					totaisIguais++;
				}
			}
		}
		
		if(totaisIguais > 0) {
		int idxVizinhos = 0;
		Pais[] mesmosVizinhos = new Pais[totaisIguais];
		for(Pais fronteiraPais: this.fronteiras) {
		for(Pais fronteiraOutro: outro.fronteiras) {
		if(fronteiraPais.equals(fronteiraOutro)) {
		mesmosVizinhos[idxVizinhos] = fronteiraOutro;
                     idxVizinhos++;
					}
				}
			}
			
			return mesmosVizinhos;
		}
		
		return null;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getDimensao() {
		return dimensao;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

}        