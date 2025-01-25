class Movie {
    private String id;
    private String title;
    private String studio;
    Movie(String id, String title, String studio) {
        this.id = id;
        this.title = title;
        this.studio = studio;
    }
    void view() {
        System.out.print(id + " " + title + " " + studio);
    }
}