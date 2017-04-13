package maplogin;

import maplogin.service.UserCheckImpl;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExam2 {
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();

        map.put("myId", "1234");
        map.put("myId1", "1235");
        map.put("myId2", "1236");
        map.put("myId3", "1237");

        Scanner scan = new Scanner(System.in);

        int flag = 0;
        boolean check =true;

        while (flag == 0){

            System.out.println("Input Id & PW");
            System.out.print("Id : ");
            String id = scan.nextLine().trim();

            UserCheckImpl userCheck = new UserCheckImpl();
            check = userCheck.checkUserId(id, map);

            if(check == true){
                System.out.print("PW : ");
            }
            else{
                break;
            }

            String pw = scan.nextLine().trim();
            System.out.println();


            UserCheckImpl userCheck1 = new UserCheckImpl();
            check = userCheck1.checkUserPw(id, pw, map);

            if(check == true){
                System.out.print("Log-In!");
                flag = 1;
            }
            else{
                continue;
            }

        }

    }
}
/*if (!map.containsKey(id)){
                System.out.println("No ID! Input again");
                continue;
            }
            else {
                if(!(map.get(id)).equals(pw)){
                    System.out.println("Passwrod is wrong! Input again");
                }
                else{
                    System.out.println("Log-In!");
                    break;
                }
            }*/