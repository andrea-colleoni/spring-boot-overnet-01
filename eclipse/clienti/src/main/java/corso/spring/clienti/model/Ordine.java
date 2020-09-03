package corso.spring.clienti.model;

import java.util.Date;

public class Ordine {
	
	private int id;
	
	private Date dataOrdine;
	
	private String descrizione;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dataOrdine
	 */
	public Date getDataOrdine() {
		return dataOrdine;
	}

	/**
	 * @param dataOrdine the dataOrdine to set
	 */
	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Ordine [id=" + id + ", dataOrdine=" + dataOrdine + ", descrizione=" + descrizione + "]";
	}
	

}
