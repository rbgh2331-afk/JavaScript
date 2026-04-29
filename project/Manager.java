package project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manager implements Manageable {
    Book[] books = new Book[100];
    int count = 0;

    @Override
    public void addItem(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("결과 : 성공적으로 등록되었습니다.");
        } else {
            System.out.println("결과 : 저장 공간이 부족합니다.");
        }
    }

    @Override
    public void displayAll() {
        if (count == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    @Override
    public void saveToFile() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("books.txt");
    
            // AI도움 받았습니다. [핵심] 배열에 저장된 책들을 하나씩 꺼내기 위해 for문을 돌립니다.
            for (int i = 0; i < count; i++) {
                // AI도움 받았습니다. 한 권의 정보를 글자(String)로 만듭니다. (쉼표로 구분)
                String content = books[i].id + " | " + books[i].title + " | " + books[i].author + "\n";
                // AI도움 받았습니다. [배운 내용] 글자를 바이트 배열로 변환합니다.
                byte[] bytes = content.getBytes();
                fos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
    @Override
    public void loadFromFile() {
        BufferedReader bis = null;
        try {
            bis = new BufferedReader(new InputStreamReader(new FileInputStream("books.txt")));
            int x = 0;
            while ((x = bis.read()) != -1)
                System.out.print((char) x);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bis.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
