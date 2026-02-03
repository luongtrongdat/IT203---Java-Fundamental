package ktdg.ss08;

public class Student08 {
    private String id;
    private String name;
    private double score;

    public Student08(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student08() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        }
        return "Trung Binh";
    }

    @Override
    public String toString() {
        return "id=" + id + "| name=" + name + "| score=" + score + "| rank=" + getRank();
    }

}
