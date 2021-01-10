public class For {
    public static void main(String[] args) {
        /*
        for(statement de initializare; conditia de oprire; statement care se intampla dupa fiecare initializare) {
        //blocul de cod
        }
         */

        for (int counter = 0; counter < 25; counter++) {
            System.out.println("FOR1 - counter-ul are valoarea: " + counter);
        }

        System.out.println("-------------------------------");

        int iterator;
        for(iterator = 0; iterator<10; iterator++) {
            System.out.println("FOR2 - iteratorul are valoarea: " + iterator);
        }

        System.out.println("DUPA FOR2 iteratorul are valoarea: " + iterator);

        iterator=0;
        for(;iterator<25;){
            System.out.println("FOR3 - iteratorul are valoarea: "+iterator);
            iterator++;
        }
        System.out.println("DUPA FOR3 iteratorul are valoarea:" + iterator);
    }
}
