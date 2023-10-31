package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private  long cin;
    private String Ecole;


    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany (cascade = CascadeType.ALL )
    private List<Reservation> ReservationEtudiant;


 public Etudiant() {
 }

 public Etudiant(long idEtudiant, String nomEt, String prenomEt, long cin, String ecole, Date dateNaissance, List<Reservation> reservationEtudiant) {
  this.idEtudiant = idEtudiant;
  this.nomEt = nomEt;
  this.prenomEt = prenomEt;
  this.cin = cin;
  Ecole = ecole;
  this.dateNaissance = dateNaissance;
  ReservationEtudiant = reservationEtudiant;
 }


 public long getIdEtudiant() {
  return idEtudiant;
 }

 public void setIdEtudiant(long idEtudiant) {
  this.idEtudiant = idEtudiant;
 }

 public String getNomEt() {
  return nomEt;
 }

 public void setNomEt(String nomEt) {
  this.nomEt = nomEt;
 }

 public String getPrenomEt() {
  return prenomEt;
 }

 public void setPrenomEt(String prenomEt) {
  this.prenomEt = prenomEt;
 }

 public long getCin() {
  return cin;
 }

 public void setCin(long cin) {
  this.cin = cin;
 }

 public String getEcole() {
  return Ecole;
 }

 public void setEcole(String ecole) {
  Ecole = ecole;
 }

 public Date getDateNaissance() {
  return dateNaissance;
 }

 public void setDateNaissance(Date dateNaissance) {
  this.dateNaissance = dateNaissance;
 }

 public List<Reservation> getReservationEtudiant() {
  return ReservationEtudiant;
 }

 public void setReservationEtudiant(List<Reservation> reservationEtudiant) {
  ReservationEtudiant = reservationEtudiant;
 }

 @Override
 public String toString() {
  return "Etudiant{" +
          "idEtudiant=" + idEtudiant +
          ", nomEt='" + nomEt + '\'' +
          ", prenomEt='" + prenomEt + '\'' +
          ", cin=" + cin +
          ", Ecole='" + Ecole + '\'' +
          ", dateNaissance=" + dateNaissance +
          ", ReservationEtudiant=" + ReservationEtudiant +
          '}';
 }
}
