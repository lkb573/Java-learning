package majorschool.service;


import majorschool.model.NameId;
import majorschool.model.School;

import java.util.ArrayList;
import java.util.List;

public class SchoolService implements ISchoolService {

    public List<School> schoolNameReset(List<School> list){

        School sc = new School();

        List<School> newlist = new ArrayList<>();


        for (School e : list){

            sc = new School();

            if(e.getSchoolId().length() >= 6)
                sc.setSchoolId(e.getSchoolId().substring(0,6)+"...");
            else
                sc.setSchoolId(e.getSchoolId());

            sc.setName(e.getName());
            sc.setCity(e.getCity());
            sc.setState(e.getCity());
            sc.setCountry(e.getCountry());

            newlist.add(sc);
        }

        return newlist;

    }

    public List<NameId> nameIdReset(List<School> list){


        NameId ni = new NameId();

        List<NameId> newlist = new ArrayList<>();

        for (School e : list){

            ni = new NameId();
            if(e.getSchoolId().length() >= 6)
                ni.setNameId(e.getSchoolId().substring(0, 6) + "...");

            else
                ni.setNameId(e.getSchoolId());


            newlist.add(ni);
        }

        return newlist;

    }

}
