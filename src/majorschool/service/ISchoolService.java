package majorschool.service;


import majorschool.model.NameId;
import majorschool.model.School;

import java.util.List;

public interface ISchoolService {

    List<School> schoolNameReset(List<School> list);
    List<NameId> nameIdReset(List<School> list);
}
