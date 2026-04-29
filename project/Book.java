package project;

public class Book {
    int id;
    String title;
    String author;


    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { 
        return id; 
    }

    public String getTitle() { 
        return title; 
    }

    public String getAuthor() { 
        return author; 
    }

    // 여기 AI 사용했습니다.
    // [이 부분을 추가하세요] 객체를 문자로 출력할 때 어떤 모양으로 보여줄지 결정합니다.
    @Override
    public String toString() {
        return "ID : " + id + " | 제목 : " + title + " | 저자 : " + author;
    }
}
