public class GradeDistribution {

    private int zeroStar;
    private int oneStar;
    private int twoStar;
    private int threeStar;
    private int fourStar;
    private int fiveStar;

    public GradeDistribution() {
        this.zeroStar = 0;
        this.oneStar = 0;
        this.twoStar = 0;
        this.threeStar = 0;
        this.fourStar = 0;
        this.fiveStar = 0;
    }

    public void addGrade(int grade) {

        if (grade < 50) {
            this.zeroStar++;
        } else if (grade < 60) {
            this.oneStar++;
        } else if (grade < 70) {
            this.twoStar++;
        } else if (grade < 80) {
            this.threeStar++;
        } else if (grade < 90) {
            this.fourStar++;
        } else {
            this.fiveStar++;
        }
    }

    public void printGradeDistribution() {

        System.out.println("5: " + gradesToStars(this.fiveStar));
        System.out.println("4: " + gradesToStars(this.fourStar));
        System.out.println("3: " + gradesToStars(this.threeStar));
        System.out.println("2: " + gradesToStars(this.twoStar));
        System.out.println("1: " + gradesToStars(this.oneStar));
        System.out.println("0: " + gradesToStars(this.zeroStar));
    }

    private String gradesToStars(int count) {

        String stars = "";

        for (int i = 0; i < count; i++) {
            stars += "*";
        }

        return stars;
    }
}