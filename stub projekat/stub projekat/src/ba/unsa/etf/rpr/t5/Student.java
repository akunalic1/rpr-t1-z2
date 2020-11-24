package ba.unsa.etf.rpr.t5;

import java.util.Objects;

public class Student {
    private String ime;
    private String prezime;
    private Integer indeks;
    private PlanStudija planStudija;
    private Semestar trenutniSemestar;

    public void upisiSledeciSemestar(Integer redniBroj){
        //provjeriti validnost rednog broja
        //set obavezne
        //postaviti u semestru redni broj semestra
        //ispisati izborne predmete
        //unos izbornog i provjeza zbira ects bodova
    }
    void setObavezniPredmet(Predmet p){

    }
    void izaberiIzbornePredmete(Predmet p){
        //
    }
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Integer getIndeks() {
        return indeks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(ime, student.ime) &&
                Objects.equals(prezime, student.prezime) &&
                Objects.equals(indeks, student.indeks) &&
                Objects.equals(planStudija, student.planStudija) &&
                Objects.equals(trenutniSemestar, student.trenutniSemestar);
    }
}
