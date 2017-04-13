package maplogin.service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public interface IUserCheck {

    boolean checkUserId(String id, Map<String, String> map);
    boolean checkUserPw(String id, String pw, Map<String, String> map);
}
