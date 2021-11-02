package com.pb.shevchenko.hw5;



public class Reader {

    String fio;
    int numTicket;
    String faculty;
    String dateOfBorn;
    String phoneNum;

    public Reader() {
    }

    public Reader(String fio, int numTicket, String faculty, String dateOfBorn, String phoneNum) {
        this.fio = fio;
        this.numTicket = numTicket;
        this.faculty = faculty;
        this.dateOfBorn = dateOfBorn;
        this.phoneNum = phoneNum;
    }

    public  void takeBook(int a){
        System.out.println("Петров В. В. взял "+a+" книги");
    }


    public void takeBook(String...arr){
        System.out.print("Петров В. В. взял книги: ");

        String s="";
        for (String i : arr){
        s = s+ i+", ";
        }
        System.out.print(s.substring(0,s.length()-2));
    }


    public void takeBook(Reader reader, Book...arr) {
        System.out.println();
        System.out.print("Петров В. В. взял книги: ");

        String s="";
        for (Book i : arr){
            s = s+ i.name+" ("+i.author+" "+i.year+" г.), ";
        }
        System.out.print(s.substring(0,s.length()-2));

    }




    public  void returnBook(int a){

        System.out.println("\nПетров В. В. вернул "+a+" книги");
    }


    public void returnBook(String...arr){
        System.out.print("Петров В. В. вернул книги: ");

        String s="";
        for (String i : arr){
            s = s+ i+", ";
        }
        System.out.print(s.substring(0,s.length()-2));
    }


    public void returnBook(Reader reader, Book...arr) {
        System.out.println();
        System.out.print("Петров В. В. вернул книги: ");

        String s="";
        for (Book i : arr){
            s = s+ i.name+" ("+i.author+" "+i.year+" г.), ";
        }
        System.out.print(s.substring(0,s.length()-2));

    }


    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", numTicket=" + numTicket +
                ", faculty='" + faculty + '\'' +
                ", dateOfBorn='" + dateOfBorn + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
