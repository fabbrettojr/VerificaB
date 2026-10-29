/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabbrifrancescoverificab;

import java.util.Objects;

/**
 *
 * @author fabbri.francesco
 */
public class Evento {
    private String evento;
    private int prezzo;
    private int nBigliettiVenduti;
    private int nBigliettiResidui;
    
    /**
     * 
     * @param evento Nome evento.
     * @param prezzo Costo biglietto.
     * @param nBigliettiVenduti Biglietti gia venduti.
     * @param nBigliettiResidui Biglietti restanti.
     */
    public Evento(String evento, int prezzo, int nBigliettiVenduti, int nBigliettiResidui){
        this.evento = evento;
        this.prezzo = prezzo;
        this.nBigliettiVenduti = nBigliettiVenduti;
        this.nBigliettiResidui = nBigliettiResidui;
        
    }
    
    /**
     * 
     * @return Ritorna nome evento
     */
    public String getEvento(){
        return this.evento;
    }
    /**
     * 
     * @return Ritorna prezzo biglietto
     */
    public int getPrezzo(){
        return this.prezzo;
    }
    /**
     * 
     * @return Ritorna numero biglietti venduti
     */
    public int getBigliettiVenduti(){
        return this.nBigliettiVenduti;
    }
    /**
     * 
     * @return Ritorna numero biglietti rimanenti
     */
    public int getBigliettiResidui(){
        return this.nBigliettiResidui;
    }
    /**
     * 
     * @param quantita Parametro che serve per sapere quanti biglietti si vuole vendere
     */
    public void VendiBiglietti(int quantita){
        if ( this.nBigliettiResidui > quantita){
            this.nBigliettiResidui = this.nBigliettiResidui - quantita;
            this.nBigliettiVenduti = this.nBigliettiVenduti + quantita;
        }
    }
    /**
     * 
     * @param quantita Parametro che serve per sapere quanti biglietti si vuole ristampare
     */
    public void RistampaBiglietti(int quantita){
        this.nBigliettiResidui = this.nBigliettiResidui + quantita;
    }
    /**
     * 
     * @return Ritorna stringa da far visualizzare all utente
     */
    public String ToString(){
        return ("nome dell evento: " + this.evento + "\nprezzo biglietto: " + this.prezzo + "\nbiglietti venduti: " + this.nBigliettiVenduti + "\nbiglietti residui: " + this.nBigliettiResidui);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (this.prezzo != other.prezzo) {
            return false;
        }
        if (this.nBigliettiVenduti != other.nBigliettiVenduti) {
            return false;
        }
        if (this.nBigliettiResidui != other.nBigliettiResidui) {
            return false;
        }
        return Objects.equals(this.evento, other.evento);
    }
    
    
}
