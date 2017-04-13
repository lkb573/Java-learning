package maplogin.service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class UserCheckImpl implements IUserCheck {

    public boolean checkUserId(String id, Map<String, String> map){
        boolean check = true;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getKey().equals(id))
                check = true;
            else
                check = false;
        }
        return check;

    }

    public boolean checkUserPw(String id, String pw, Map<String, String> map){
        boolean check = true;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue().equals(pw))
                check = true;
            else
                check = false;
        }
        return check;
    }

}
