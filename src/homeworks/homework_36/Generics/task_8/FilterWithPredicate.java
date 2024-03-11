package homeworks.homework_36.Generics.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterWithPredicate {
    public static void main(String[] args) {


        User user1 = new User("user1",25);
        User user2 = new User("user2",15);
        User user3 = new User("user3",28);
        User user4 = new User("user4",16);
        User user5 = new User("user5",45);
        User user6 = new User("user6",23);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        List<User> usersAfter18 = filterAgeAfter18(users, (User user) -> user.getAge() > 18);
        System.out.println(usersAfter18);
    }

    public static List<User> filterAgeAfter18(List<User>users, Predicate<User> predicate){
        List<User> listUsersAfter18 = new ArrayList<>();

        for (User currentUser : users){
            if (predicate.test(currentUser)){
                listUsersAfter18.add(currentUser);
            }
        }
        return listUsersAfter18;
    }
}
