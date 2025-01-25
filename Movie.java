class Movie extends Item {
    private String id;
    private String title;
    private String studio;
    Movie(String item_id, String movie_id, String title, String studio) {
        super.id = item_id;
        this.id = movie_id;
        this.title = title;
        this.studio = studio;
    }
    void view() {
        System.out.print(id + " " + title + " " + studio);
    }
}