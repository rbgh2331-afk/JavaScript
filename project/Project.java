package project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            System.out.println("");
            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 저장 및 종료");
            System.out.print("메뉴 선택 >> ");

            int ch = Integer.parseInt(sc.nextLine());

            if (ch == 1) {
                System.out.println("");
                System.out.println("[도서 등록]");
                System.out.print("ID : ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.print("제목 : ");
                String title = sc.nextLine();

                System.out.print("저자 : ");
                String author = sc.nextLine();

                manager.addItem(new Book(id, title, author));

            } else if (ch == 2) {
                System.out.println("[도서 목록 조회]");
                manager.displayAll();
                manager.loadFromFile();
            } else if (ch == 3) {
                System.out.println("데이터를 저장하고 프로그램을 종료합니다.");
                manager.saveToFile();
                break;

            } else {
                System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}