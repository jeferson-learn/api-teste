package alura.linguagem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
//@Document(collection = "linguagem")
public class Linguagem {

    @Id
    private String id;
    private String title;
    private String image;
    private double score;

    public Linguagem() {

    }

    public Linguagem(String title, String image, double score) {
        this.title = title;
        this.image = image;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public double getScore() {
        return score;
    }
}
