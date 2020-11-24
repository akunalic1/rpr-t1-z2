package ba.unsa.etf.rpr.t5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Predmet {
    public String naziv;
    public Integer brojECTS;
    private ArrayList<Student> spisakUpisanihNaPredmet;


    public ArrayList<Student> getSpisakUpisanihNaPredmet() {
        return spisakUpisanihNaPredmet;
    }
    void dodajStudentaNaSpisak(Student s) throws Exception {
        Optional<Student> postoji =spisakUpisanihNaPredmet.stream().filter(s::equals).findAny();
        if(postoji.isPresent()) {
           throw new Exception("Student je vec upisan na  predmet");
        }
        spisakUpisanihNaPredmet.add(s);
    }
    void skiniStudentaSaSpiska(Student s) throws Exception {

    }

};

