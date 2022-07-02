package it.sps.main.dto;

import javax.annotation.Generated;

import org.springframework.beans.BeanUtils;

public class AttoreDtoWeb {

	private Long id;
	private String nome;
	private int oscarVinti;
	private String cognome;
	private int eta; // Viene calcolato con metodo apposito
	private String luogoDiNascita;
	private String nazionalita;
	private java.sql.Date dataDiNascita;


	@Generated("SparkTools")
	private AttoreDtoWeb(Builder builder) {
		BeanUtils.copyProperties(builder, this);
	}


	public AttoreDtoWeb() {
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public java.sql.Date getDataDiNascita() {
		return dataDiNascita;
	}
	
	public void setDataDiNascita(java.sql.Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	public int getOscarVinti() {
		return oscarVinti;
	}
	
	public void setOscarVinti(int oscarVinti) {
		this.oscarVinti = oscarVinti;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(java.sql.Date eta) {
		// Fare le logiche di calcolo
		this.eta = 0;
	}
	
	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}
	
	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}
	
	public String getNazionalita() {
		return nazionalita;
	}
	
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	
	@Override
	public String toString() {
		return "AttoreDto [nome=" + nome + ", oscarVinti=" + oscarVinti + ", cognome=" + cognome + ", eta=" + eta
				+ ", luogoDiNascita=" + luogoDiNascita + ", nazionalita=" + nazionalita + ", dataDiNascita="
				+ dataDiNascita + "]";
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private Long id;
		private String nome;
		private int oscarVinti;
		private String cognome;
		private int eta;
		private String luogoDiNascita;
		private String nazionalita;
		private java.sql.Date dataDiNascita;

		private Builder() {
		}

		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withOscarVinti(int oscarVinti) {
			this.oscarVinti = oscarVinti;
			return this;
		}

		public Builder withCognome(String cognome) {
			this.cognome = cognome;
			return this;
		}

		public Builder withEta(int eta) {
			this.eta = eta;
			return this;
		}

		public Builder withLuogoDiNascita(String luogoDiNascita) {
			this.luogoDiNascita = luogoDiNascita;
			return this;
		}

		public Builder withNazionalita(String nazionalita) {
			this.nazionalita = nazionalita;
			return this;
		}

		public Builder withDataDiNascita(java.sql.Date dataDiNascita) {
			this.dataDiNascita = dataDiNascita;
			return this;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getOscarVinti() {
			return oscarVinti;
		}

		public void setOscarVinti(int oscarVinti) {
			this.oscarVinti = oscarVinti;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public int getEta() {
			return eta;
		}

		public void setEta(int eta) {
			this.eta = eta;
		}

		public String getLuogoDiNascita() {
			return luogoDiNascita;
		}

		public void setLuogoDiNascita(String luogoDiNascita) {
			this.luogoDiNascita = luogoDiNascita;
		}

		public String getNazionalita() {
			return nazionalita;
		}

		public void setNazionalita(String nazionalita) {
			this.nazionalita = nazionalita;
		}

		public java.sql.Date getDataDiNascita() {
			return dataDiNascita;
		}

		public void setDataDiNascita(java.sql.Date dataDiNascita) {
			this.dataDiNascita = dataDiNascita;
		}

		public AttoreDtoWeb build() {
			return new AttoreDtoWeb(this);
		}
	}
	
	
}
