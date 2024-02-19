package homeworks.homework_21.incapsulation.task_2;

import scanner.UserInput;

import java.util.Scanner;

public class UserServise {
    User user = new User("user007","User!007","user007.tuta.io");

    public String inputPassword(){
        UserInput userInput = new UserInput();
        String passwordFromUserInput = userInput.inputText("Введите пароль:");
        return passwordFromUserInput;
    }

     public boolean checkOldPassword(String passwordFromUserInput, String oldPassword){

         if ((passwordFromUserInput.equals(user.getPassword()))
                 &&(passwordFromUserInput.length() >= 8)
                 //проверка на наличие одного из символов
                &&(passwordFromUserInput.matches((".*[!@#$%^&*()-+]+.*"))))     //квантификатор +, указывает, что символ может повторяться один или несколько раз

         {
             System.out.println("Вы ввели пароль верно.");
             return true;
         } else {
             System.out.println("Пароль введен неверно, попробуйте еще раз.");
             return false;
         }
     }


    public boolean checkNewPassword(String newPassword){

        if ( (newPassword.length() >= 8)
                //проверка на наличие одного из символов
                &&(newPassword.matches((".*[!@#$%^&*()-+]+.*"))))     //квантификатор +, указывает, что символ может повторяться один или несколько раз)

        {
            System.out.println("Новый пароль соответствует требованиям безопасности.");
            return true;
        } else {
            System.out.println("Новый пароль не соответствует требованиям безопасности.");
            return false;
        }
    }



    public void setNewPassword() {
        String oldPassword = inputPassword();
        if (checkOldPassword(oldPassword, user.getPassword())) {
            String newAddedPassword = inputPassword();
            if (checkNewPassword(newAddedPassword)) {
                //передаем новый пароль в данные пользователя
                user.setPassword(newAddedPassword);
                System.out.println("Новый пароль успешно установлен: " + newAddedPassword);

            } else {
                System.out.println("Не удалось изменить пароль, так как старый пароль введен неверно.");
            }
        }
    }


}
