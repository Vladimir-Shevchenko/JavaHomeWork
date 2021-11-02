package com.pb.shevchenko.hw5;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {

        Book storyTail =   new Book("Story tails", "Andersson", "1867");
        Book kolobok =     new Book("Kolobok", "Ushanskiy", "1500");
        Book dictionary =  new Book("Dictionary", "Kolt", "1969");

        Book[]books=new Book[]{storyTail, kolobok, dictionary};


      Reader ivanov =  new Reader("Ivanov I.I.", 1, "Historical", "4.07.2000", "0675821412");
      Reader petrov =  new Reader("Petrov P.P.", 1, "Historical", "4.07.2000", "0675821412");
      Reader sidorov = new Reader("Sidorov I.I.", 1, "Historical", "4.07.2000", "0675821412");

      Reader[]readers=new Reader[]{ivanov, petrov, sidorov };

        System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(readers));

        Reader r = new Reader();

        r.takeBook(3);
        r.takeBook("Story tails", "Kolobok", "Dictionary");
        r.takeBook(ivanov, books);

        r.returnBook(3);
        r.returnBook("Story tails", "Kolobok", "Dictionary");
        r.returnBook(ivanov, books);


    }
}
