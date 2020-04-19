public class SimpleArray {
    public static void main(String[] args) {

        User lukasz = new User("Lukasz", 30);
        User justyna = new User("Justyna", 26);
        User marek = new User("Marek", 34);
        User dawid = new User("Dawid", 19);
        User tomek = new User("Tomek", 56);
        User anna = new User("Anna", 23);
        User kasia = new User("Kasia", 29);

        User[] users = new User[]{lukasz, justyna, marek, dawid, tomek, anna, kasia};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
        }
        int midAge = result / users.length;

        System.out.println("srednia wieku to " + midAge);

        for (int j = 0; j < users.length; j++) {
            if (users[j].getAge() < midAge) {
                System.out.println(users[j].getName() + " posiada mniej niż "
                        + midAge + " lat a dokładnie to " + users[j].getAge() + " co jest o " + (midAge - users[j].getAge()) + " mniej niż średnia");
            } else ;
            {

            }

        }


    }
}
