public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2008);
            System.out.println(notebook.weight + "g " + notebook.price +"zł " + notebook.year + "rok");
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.isItWorth();
            System.out.println(".......................................");

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
            System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price +"zł " + heavyNotebook.year + "rok");
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.isItWorth();
            System.out.println(".......................................");
        Notebook oldNotebook = new Notebook(1500, 500, 2005);
            System.out.println(oldNotebook.weight + "g " + oldNotebook.price +"zł " + oldNotebook.year + "rok");
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.isItWorth();
            System.out.println(".......................................");
        Notebook notebookHP = new Notebook(800, 700, 2043);
            System.out.println(notebookHP.weight + "g " + notebookHP.price +"zł " + notebookHP.year + "rok");
            notebookHP.checkPrice();
            notebookHP.checkWeight();
            notebookHP.isItWorth();
            System.out.println(".......................................");
        Notebook notebookAsus = new Notebook(900, 1001, 2018);
            System.out.println(notebookAsus.weight + "g " + notebookAsus.price +"zł " + notebookAsus.year + "rok");
            notebookAsus.checkPrice();
            notebookAsus.checkWeight();
            notebookAsus.isItWorth();
            System.out.println(".......................................");
        Notebook notebookDell = new Notebook(2399, 5000, 2020);
            System.out.println(notebookDell.weight + "g " + notebookDell.price +"zł " + notebookDell.year + "rok");
            notebookDell.checkPrice();
            notebookDell.checkWeight();
            notebookDell.isItWorth();
            System.out.println(".......................................");
        Notebook notebookApple = new Notebook(500, 9000, 2003);
            System.out.println(notebookApple.weight + "g " + notebookApple.price +"zł " + notebookApple.year + "rok");
            notebookApple.checkPrice();
            notebookApple.checkWeight();
            notebookApple.isItWorth();
            System.out.println(".......................................");

        LeapYear isLeapYear = new LeapYear(2020);
            isLeapYear.isItLeap();
        LeapYear isLeapYear2 = new LeapYear(2034);
            isLeapYear2.isItLeap();
        LeapYear isLeapYear3 = new LeapYear(2035);
            isLeapYear3.isItLeap();
        LeapYear isLeapYear4 = new LeapYear(2036);
            isLeapYear4.isItLeap();
        LeapYear isLeapYear5 = new LeapYear(2037);
            isLeapYear5.isItLeap();
    }



}