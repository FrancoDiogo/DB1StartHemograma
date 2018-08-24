package br.com.db1;

import java.util.Date;

public class Exame {

	private String unidade;

	private String codigoAtendimento;

	private Date dataRecepecao;

	private Date dataImpressao;

	
	public Integer calculaIdade() {
		return null;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getCodigoAtendimento() {
		return codigoAtendimento;
	}

	public void setCodigoAtendimento(String codigoAtendimento) {
		this.codigoAtendimento = codigoAtendimento;
	}

	public Date getDataRecepecao() {
		return dataRecepecao;
	}

	public void setDataRecepecao(Date dataRecepecao) {
		this.dataRecepecao = dataRecepecao;
	}

	public Date getDataImpressao() {
		return dataImpressao;
	}

	public void setDataImpressao(Date dataImpressao) {
		this.dataImpressao = dataImpressao;
	}

	public Boolean validaConvenio() {
		return null;
	}

}
