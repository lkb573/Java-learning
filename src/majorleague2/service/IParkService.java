package majorleague2.service;


import majorleague2.model.MajorPark;

import java.util.List;

public interface IParkService {

    int sumOfNotUS(List<MajorPark> list);
    List<MajorPark> haveAliaspark(List<MajorPark> list);
    double avarOfNamechar(List<MajorPark> list);

}