package bridge;

public class MainEntry {
    public static void main(String[] args) {
        var title = "복원된 지구";
        var author = "김형준";
        String[] content = {
                "플라스틱 사용의 감소와",
                "바다 생물 어획량 감소로 인하여",
                "지구는 복원되었다."
        };

        Draft draft = new Draft(title, author, content);

        Display display1 = new SimpleDisplay();
        // draft.print(display1);

        Display display2 = new CaptionDisplay();
        draft.print(display2);

        var publisher = "복약출판";
        var cost = 100;
        Publication publication = new Publication(title, author, content, publisher, cost);
        publication.print(display1);
    }
}

